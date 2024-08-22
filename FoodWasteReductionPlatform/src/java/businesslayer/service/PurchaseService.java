package businesslayer.service;

import dataaccesslayer.impl.PurchaseDaoImpl;
import java.sql.Connection;
import java.sql.SQLException;
import model.*;
import java.util.List;

public class PurchaseService {
    private PurchaseDaoImpl purchaseDAO;

    public PurchaseService(Connection connection) {
        this.purchaseDAO = new PurchaseDaoImpl(connection);
    }
    
    public List<Purchase> getPurchaseList() throws SQLException {
        return purchaseDAO.getPurchaseList();
    }
      public void getPurchaseByPurchaseId(int purchaseId) throws SQLException {
        purchaseDAO.getPurchaseByPurchaseId(purchaseId);
    }

    public void addPurchase(Purchase purchase) throws SQLException {
        purchaseDAO.addPurchase(purchase);
    }

    public void updatePurchase(Purchase purchase) throws SQLException {
        purchaseDAO.updatePurchase(purchase);
    }

    public void deletePurchase(int purchaseId) throws SQLException {
        purchaseDAO.deletePurchase(purchaseId);
    }
}
