package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslayer.service.ClaimService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import model.Claim;
import model.Purchase;

@WebServlet("/claim")
public class ClaimController extends HttpServlet {
    private ClaimService claimService;

    @Override
    public void init() throws ServletException {
        Connection connection = (Connection) getServletContext().getAttribute("DBConnection");
        this.claimService = new ClaimService(connection);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int charityId = Integer.parseInt(req.getParameter("charityId"));
        int productId = Integer.parseInt(req.getParameter("productId"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        try {
            Claim claim = new Claim(charityId, productId, quantity);
            claimService.addClaim(claim);
            resp.getWriter().write("Claim successful.");
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
