package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslayer.service.PurchaseService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import model.Purchase;

@WebServlet("/purchase")
public class PurchaseController extends HttpServlet {
    private PurchaseService purchaseService;

    @Override
    public void init() throws ServletException {
        Connection connection = (Connection) getServletContext().getAttribute("DBConnection");
        this.purchaseService = new PurchaseService(connection);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        int productId = Integer.parseInt(req.getParameter("productId"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        try {
            Purchase purchase = new Purchase(userId, productId, quantity);
            purchaseService.addPurchase(purchase);
            resp.getWriter().write("Purchase successful.");
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
