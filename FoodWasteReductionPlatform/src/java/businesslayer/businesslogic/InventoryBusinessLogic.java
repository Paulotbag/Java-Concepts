package businesslayer.businesslogic;

import java.sql.Connection;
import java.sql.SQLException;

import dataaccesslayer.impl.InventoryDaoImpl;
import model.*;

public class InventoryBusinessLogic {
    private InventoryDaoImpl inventoryDAO;

    public InventoryBusinessLogic(Connection connection) {
        this.inventoryDAO = new InventoryDaoImpl(connection);
    }

    public void addInventory(Inventory inventory) throws SQLException {
        inventoryDAO.addInventory(inventory);
    }

    public Inventory getInventory(int inventoryId) throws SQLException {
        return inventoryDAO.getInventory(inventoryId);
    }

}
