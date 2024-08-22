package businesslayer.service;

import java.sql.Connection;
import java.sql.SQLException;

import dataaccesslayer.impl.ClaimDaoImpl;
import model.*;
import java.util.List;

public class ClaimService {
    private ClaimDaoImpl claimDAO;

    public ClaimService(Connection connection) {
        this.claimDAO = new ClaimDaoImpl(connection);
    }
    
    public List<Claim> getClaimList() throws SQLException {
        return claimDAO.getClaimList();
    }
    
    public void getClaimByClaimId(int claimId) throws SQLException {
        claimDAO.getClaimByClaimId(claimId);
    }

    public void addClaim(Claim claim) throws SQLException {
        claimDAO.addClaim(claim);
    }

    public void updateClaim(Claim claim) throws SQLException {
        claimDAO.updateClaim(claim);
    }

    public void deleteClaim(int claimId) throws SQLException {
        claimDAO.deleteClaim(claimId);
    }
}
