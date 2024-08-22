package businesslayer.service;

import dataaccesslayer.impl.UserDaoImpl;
import model.User;
import java.sql.Connection;
import java.sql.SQLException;

public class UserService {
    private final UserDaoImpl userDao;

    public UserService(Connection connection) {
        this.userDao = new UserDaoImpl(connection);
    }

    public void registerUser(User user) throws SQLException {
        userDao.registerUser(user);
    }

    public User authenticateUser(String email, String password) throws SQLException {
        return userDao.authenticateUser(email, password);
    }

    public void addUser(User user) throws SQLException {
        userDao.addUser(user);
    }

    public void updateUser(User user) throws SQLException {
        userDao.updateUser(user);
    }

    public void deleteUser(int userId) throws SQLException {
        userDao.deleteUser(userId);
    }

    public User getUserByEmail(String email) throws SQLException {
        return userDao.getUserByEmail(email);
    }
}

