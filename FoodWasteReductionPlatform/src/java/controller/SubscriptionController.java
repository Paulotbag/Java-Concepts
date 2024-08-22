package controller;

import businesslayer.service.SubscriptionService;
import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/subscription")
public class SubscriptionController extends HttpServlet {
    private SubscriptionService subscriptionService;

    @Override
    public void init() throws ServletException {
        Connection connection = (Connection) getServletContext().getAttribute("DBConnection");
        this.subscriptionService = new SubscriptionService(connection);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        int productId = Integer.parseInt(req.getParameter("productId"));
        String action = req.getParameter("action");

        try {
            if ("subscribe".equals(action)) {
                String location = req.getParameter("location");
                String communicationMethod = req.getParameter("communicationMethod");
                String foodPreferences = req.getParameter("foodPreferences");
                Subscription subscription = new Subscription(userId, productId, location, communicationMethod, foodPreferences);
                subscriptionService.addSubscription(subscription);
                resp.getWriter().write("Subscribed successfully.");
            } else if ("unsubscribe".equals(action)) {
                subscriptionService.removeSubscription(userId, productId);
                resp.getWriter().write("Unsubscribed successfully.");
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
