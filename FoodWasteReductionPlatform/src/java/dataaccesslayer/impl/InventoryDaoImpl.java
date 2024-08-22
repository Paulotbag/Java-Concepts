package dataaccesslayer.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.*;

public class InventoryDaoImpl {
    private final Connection connection;

    public InventoryDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void addInventory(Inventory inventory) throws SQLException {
        String sql = "INSERT INTO Inventory (product_id, quantity, location, user_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, inventory.getProductId());
            statement.setInt(2, inventory.getQuantity());
            statement.setString(3, inventory.getLocation());
            statement.executeUpdate();
        }
    }

    public Inventory getInventory(int inventoryId) throws SQLException {
        String sql = "SELECT * FROM Inventory WHERE inventory_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, inventoryId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Inventory inventory = new Inventory();
                    inventory.setInventoryId(resultSet.getInt("inventory_id"));
                    inventory.setProductId(resultSet.getInt("productId"));
                    inventory.setQuantity(resultSet.getInt("quantity"));
                    inventory.setLocation(resultSet.getString("location"));
                    inventory.setLocation(resultSet.getString("user_id"));
                    return inventory;
                }
            }
        }
        return null;
    }

}
