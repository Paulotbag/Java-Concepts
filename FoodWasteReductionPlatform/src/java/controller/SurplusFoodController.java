package controller;

import businesslayer.service.SurplusFoodService;
import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

@WebServlet("/surplusFood")
public class SurplusFoodController extends HttpServlet {
    private SurplusFoodService surplusFoodService;

    @Override
    public void init() throws ServletException {
        Connection connection = (Connection) getServletContext().getAttribute("DBConnection");
        this.surplusFoodService = new SurplusFoodService(connection);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<SurplusFood> foodList = surplusFoodService.getSurplusFoodList();
            req.setAttribute("foodList", foodList);
            req.getRequestDispatcher("/surplusFoodList.jsp").forward(req, resp);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        try {
            if ("add".equals(action)) {
                int productId = Integer.parseInt(req.getParameter("productId"));
                int quantity = Integer.parseInt(req.getParameter("quantity"));
                Date expiryDate = java.sql.Date.valueOf(req.getParameter("expiryDate"));
                double price = Double.parseDouble(req.getParameter("expiryDate"));
                String status = req.getParameter("expiryDate");
                SurplusFood food = new SurplusFood(productId, quantity, expiryDate, price, status);
                surplusFoodService.addSurplusFood(food);
                resp.getWriter().write("Surplus food added successfully.");
            } else if ("update".equals(action)) {
                int surplusId = Integer.parseInt(req.getParameter("surplusId"));
                int productId = Integer.parseInt(req.getParameter("productId"));
                int quantity = Integer.parseInt(req.getParameter("quantity"));
                Date expiryDate = java.sql.Date.valueOf(req.getParameter("expiryDate"));
                double price = Double.parseDouble(req.getParameter("expiryDate"));
                String status = req.getParameter("expiryDate");
                SurplusFood food = new SurplusFood(surplusId, productId, quantity, expiryDate, price, status);
                surplusFoodService.updateSurplusFood(food);
                resp.getWriter().write("Surplus food updated successfully.");
            } else if ("delete".equals(action)) {
                int foodId = Integer.parseInt(req.getParameter("foodId"));
                surplusFoodService.deleteSurplusFood(foodId);
                resp.getWriter().write("Surplus food deleted successfully.");
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
