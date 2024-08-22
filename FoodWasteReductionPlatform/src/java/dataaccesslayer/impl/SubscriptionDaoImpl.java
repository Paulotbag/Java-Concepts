package dataaccesslayer.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class SubscriptionDaoImpl {
    private Connection connection;

    public SubscriptionDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void addSubscription(Subscription subscription) throws SQLException {
        String sql = "INSERT INTO subscriptions (user_id, location, communication_method, food_preferences) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, subscription.getUserId());
            stmt.setString(2, subscription.getLocation());
            stmt.setString(3, subscription.getCommunicationMethod());
            stmt.setString(4, subscription.getFoodPreferences());
            stmt.executeUpdate();
        }
    }

    public void removeSubscription(int userId, int subscriptionId) throws SQLException {
        String sql = "DELETE FROM subscriptions WHERE user_id = ? AND subscription_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            stmt.setInt(2, subscriptionId);
            stmt.executeUpdate();
        }
    }

    public List<Subscription> getSubscriptionsBySubscriptionId(int subscriptionId) throws SQLException {
        String sql = "SELECT * FROM subscriptions WHERE subscription_id = ?";
        List<Subscription> subscriptions = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, subscriptionId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Subscription subscription = new Subscription();
                subscription.setUserId(rs.getInt("user_id"));
                subscription.setSubscriptionId(rs.getInt("subscription_id"));
                subscription.setLocation(rs.getString("location"));
                subscription.setCommunicationMethod(rs.getString("communication_method"));
                subscription.setFoodPreferences(rs.getString("food_preferences"));
                subscriptions.add(subscription);
            }
        }
        return subscriptions;
    }
}
