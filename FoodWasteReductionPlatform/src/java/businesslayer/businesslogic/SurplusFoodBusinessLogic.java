package businesslayer.businesslogic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dataaccesslayer.impl.SurplusFoodDaoImpl;
import model.*;

public class SurplusFoodBusinessLogic {
    private SurplusFoodDaoImpl surplusFoodDAO;

    public SurplusFoodBusinessLogic(Connection connection) {
        this.surplusFoodDAO = new SurplusFoodDaoImpl(connection);
    }

    public void addSurplusFood(SurplusFood surplusFood) throws SQLException {
        surplusFoodDAO.addSurplusFood(surplusFood);
    }

    public List<SurplusFood> getSurplusFoodList() throws SQLException {
        return surplusFoodDAO.getSurplusFoodList();
    }

    public void updateSurplusFood(SurplusFood surplusFood) throws SQLException {
        surplusFoodDAO.updateSurplusFood(surplusFood);
    }

    public void deleteSurplusFood(int foodId) throws SQLException {
        surplusFoodDAO.deleteSurplusFood(foodId);
    }
}
