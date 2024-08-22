package controller;
//merged UserController from Muhammed and Paulo

import businesslayer.service.UserService;
import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/user")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserService userService;

    @Override
    public void init() throws ServletException {
        Connection connection = (Connection) getServletContext().getAttribute("DBConnection");
        this.userService = new UserService(connection);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        try {
            User user = userService.getUserByEmail(email);
            req.setAttribute("user", user);
            req.getRequestDispatcher("/userDetails.jsp").forward(req, resp);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        try {
            if ("add".equals(action)) {
                addUser(req, resp);
            } else if ("update".equals(action)) {
                updateUser(req, resp);
            } else if ("delete".equals(action)) {
                deleteUser(req, resp);
            } else if ("register".equals(action)) {
                registerUser(req, resp);
            } else if ("login".equals(action)) {
                loginUser(req, resp);
            } else if ("logout".equals(action)) {
                logoutUser(req, resp);
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    private void addUser(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User user = new User(name, email, password, type);
        userService.addUser(user);
        resp.getWriter().write("User added successfully.");
    }

    private void updateUser(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User user = new User(userId, name, email, password, type);
        userService.updateUser(user);
        resp.getWriter().write("User updated successfully.");
    }

    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        userService.deleteUser(userId);
        resp.getWriter().write("User deleted successfully.");
    }

    private void registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String userType = request.getParameter("type");
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setType(userType);
        userService.registerUser(user);
        response.sendRedirect("login.jsp");
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = userService.authenticateUser(email, password);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp?error=true");
        }
    }

    private void logoutUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
        response.sendRedirect("login.jsp");
    }
}
