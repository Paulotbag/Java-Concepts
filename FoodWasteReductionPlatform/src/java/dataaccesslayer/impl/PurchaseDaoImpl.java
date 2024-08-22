package dataaccesslayer.impl;

import model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDaoImpl {
    private Connection connection;

    public PurchaseDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    public List<Purchase> getPurchaseList() throws SQLException {
        String sql = "SELECT * FROM purchases";
        List<Purchase> purchaseList = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Purchase purchase = new Purchase();
                purchase.setPurchaseId(rs.getInt("purchase_id"));
                purchase.setUserId(rs.getInt("user_id"));
                purchase.setSurplusId(rs.getInt("surplus_id"));
                purchaseList.add(purchase);
            }
        }
        return purchaseList;
    }
    
    public void getPurchaseByPurchaseId(int purchaseId) throws SQLException {
        String sql = "SELECT purchase_id FROM purchases WHERE purchase_id = ?";
        Purchase purchase = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery();) {
            stmt.setInt(1, purchaseId);
            while (rs.next()) {
                purchase = new Purchase();
                purchase.setPurchaseId(rs.getInt("purchase_id"));
                purchase.setUserId(rs.getInt("user_id"));
                purchase.setSurplusId(rs.getInt("surplus_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addPurchase(Purchase purchase) throws SQLException {
        String sql = "INSERT INTO purchases (user_id, surplus_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, purchase.getUserId());
            stmt.setInt(2, purchase.getSurplusId());
            stmt.executeUpdate();
        }
    }

    public void updatePurchase(Purchase purchase) throws SQLException {
        String sql = "UPDATE purchases SET user_id = ?, surplus_id = ? WHERE purchase_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, purchase.getUserId());
            stmt.setInt(2, purchase.getSurplusId());
            stmt.setInt(3, purchase.getPurchaseId());
            stmt.executeUpdate();
        }
    }

    public void deletePurchase(int purchaseId) throws SQLException {
        String sql = "DELETE FROM purchases WHERE purchase_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, purchaseId);
            stmt.executeUpdate();
        }
    }
}
