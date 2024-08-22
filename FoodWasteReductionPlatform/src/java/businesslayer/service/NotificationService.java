package businesslayer.service;

import dataaccesslayer.impl.SubscriptionDaoImpl;
import model.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class NotificationService {
    private SubscriptionDaoImpl subscriptionDAO;

    public NotificationService(Connection connection) {
        this.subscriptionDAO = new SubscriptionDaoImpl(connection);
    }

    public void notifySubscribers(int productId) throws SQLException {
        List<Subscription> subscriptions = subscriptionDAO.getSubscriptionsBySubscriptionId(productId);
        for (Subscription subscription : subscriptions) {
            // Implement the notification logic here, e.g., send an email or SMS
            System.out.println("Notifying user " + subscription.getUserId() + " about product " + productId);
        }
    }
}
