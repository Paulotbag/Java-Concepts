//package businesslayer.service;
//
//import dataaccesslayer.impl.InventoryDaoImpl;
//import model.*;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//
//public class InventoryService {
//    private InventoryDaoImpl inventoryDAO;
//
//    public InventoryService(Connection connection) {
//        this.inventoryDAO = new InventoryDaoImpl(connection);
//    }
//
//    public List<Inventory> getInventoryList() throws SQLException {
//        return inventoryDAO.getInventoryList();
//    }
//
//    public void addInventory(Inventory inventory) throws SQLException {
//        inventoryDAO.addInventory(inventory);
//    }
//
//    public void updateInventory(Inventory inventory) throws SQLException {
//        inventoryDAO.updateInventory(inventory);
//    }
//
//    public void deleteInventory(int inventoryId) throws SQLException {
//        inventoryDAO.deleteInventory(inventoryId);
//    }
//}
