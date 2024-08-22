package dataaccesslayer.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class SurplusFoodDaoImpl {
    private Connection connection;

    public SurplusFoodDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public List<SurplusFood> getSurplusFoodList() throws SQLException {
        String sql = "SELECT * FROM surplus_food_list";
        List<SurplusFood> foodList = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                SurplusFood food = new SurplusFood();
                food.setSurplusId(rs.getInt("surplus_id"));
                food.setProductId(rs.getInt("product_id"));
                food.setQuantity(rs.getInt("quantity"));
                food.setExpiryDate(rs.getDate("expiry_date"));
                food.setPrice(rs.getInt("price"));
                food.setStatus(rs.getString("status"));
                foodList.add(food);
            }
        }
        return foodList;
    }

    public void addSurplusFood(SurplusFood food) throws SQLException {
        String sql = "INSERT INTO surplus_food_list (productId, quantity, expiryDate, price, status) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, food.getProductId());
            stmt.setInt(2, food.getQuantity());
            stmt.setDate(3, food.getExpiryDate());
            stmt.setDouble(4, food.getPrice());
            stmt.setString(5, food.getStatus());
            stmt.executeUpdate();
        }
    }

    public void updateSurplusFood(SurplusFood food) throws SQLException {
        String sql = "UPDATE surplus_food_list SET productId = ?, quantity = ?, expiryDate = ?, price = ?, status = ? WHERE surplus_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, food.getProductId());
            stmt.setInt(2, food.getQuantity());
            stmt.setDate(3, food.getExpiryDate());
            stmt.setDouble(4, food.getPrice());
            stmt.setString(5, food.getStatus());
            stmt.setInt(6, food.getSurplusId());
            stmt.executeUpdate();
        }
    }

    public void deleteSurplusFood(int surplusId) throws SQLException {
        String sql = "DELETE FROM surplus_food_list WHERE surplus_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, surplusId);
            stmt.executeUpdate();
        }
    }
}
