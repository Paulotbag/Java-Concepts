package businesslayer.service;

import dataaccesslayer.impl.SubscriptionDaoImpl;
import model.*;

import java.sql.Connection;
import java.sql.SQLException;

public class SubscriptionService {
    private SubscriptionDaoImpl subscriptionDAO;

    public SubscriptionService(Connection connection) {
        this.subscriptionDAO = new SubscriptionDaoImpl(connection);
    }

    public void addSubscription(Subscription subscription) throws SQLException {
        subscriptionDAO.addSubscription(subscription);
    }

    public void removeSubscription(int userId, int productId) throws SQLException {
        subscriptionDAO.removeSubscription(userId, productId);
    }
}
