package controller;

import businesslayer.businesslogic.InventoryBusinessLogic;
import model.*;

import java.sql.Connection;
import java.sql.SQLException;

public class InventoryController {
    private InventoryBusinessLogic inventoryBusinessLogic;

    public InventoryController(Connection connection) {
        this.inventoryBusinessLogic = new InventoryBusinessLogic(connection);
    }

    public void addInventory(Inventory inventory) {
        try {
            inventoryBusinessLogic.addInventory(inventory);
        } catch (SQLException e) {
            // Handle exception
        }
    }

    public Inventory getInventory(int inventoryId) {
        try {
            return inventoryBusinessLogic.getInventory(inventoryId);
        } catch (SQLException e) {
            // Handle exception
        }
        return null;
    }

}
