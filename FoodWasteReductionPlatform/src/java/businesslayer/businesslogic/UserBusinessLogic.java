package businesslayer.businesslogic;

import java.sql.Connection;
import java.sql.SQLException;

import dataaccesslayer.impl.UserDaoImpl;
import model.*;

public class UserBusinessLogic {
    private final UserDaoImpl userDAO;

    public UserBusinessLogic(Connection connection) {
        this.userDAO = new UserDaoImpl(connection);
    }

    public void addUser(User user) throws SQLException {
        userDAO.addUser(user);
    }

    public User getUserByEmail(String email) throws SQLException {
        return userDAO.getUserByEmail(email);
    }

    public void updateUser(User user) throws SQLException {
        userDAO.updateUser(user);
    }

    public void deleteUser(int userId) throws SQLException {
        userDAO.deleteUser(userId);
    }
    
    public boolean isUserExist(String email) throws SQLException {
        return userDAO.getUserByEmail(email) != null;
    }
}
