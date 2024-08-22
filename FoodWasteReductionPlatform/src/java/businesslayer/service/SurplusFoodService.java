package businesslayer.service;

import dataaccesslayer.impl.SurplusFoodDaoImpl;
import model.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class SurplusFoodService {
    private SurplusFoodDaoImpl surplusFoodDAO;

    public SurplusFoodService(Connection connection) {
        this.surplusFoodDAO = new SurplusFoodDaoImpl(connection);
    }

    public List<SurplusFood> getSurplusFoodList() throws SQLException {
        return surplusFoodDAO.getSurplusFoodList();
    }

    public void addSurplusFood(SurplusFood food) throws SQLException {
        surplusFoodDAO.addSurplusFood(food);
    }

    public void updateSurplusFood(SurplusFood food) throws SQLException {
        surplusFoodDAO.updateSurplusFood(food);
    }

    public void deleteSurplusFood(int foodId) throws SQLException {
        surplusFoodDAO.deleteSurplusFood(foodId);
    }
}
