package dataaccesslayer.impl;

import model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClaimDaoImpl {

    private Connection connection;

    public ClaimDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public List<Claim> getClaimList() throws SQLException {
        String sql = "SELECT * FROM claims";
        List<Claim> claimList = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Claim claim = new Claim();
                claim.setClaimId(rs.getInt("claim_id"));
                claim.setUserId(rs.getInt("user_id"));
                claim.setSurplusId(rs.getInt("surplus_id"));
                claimList.add(claim);
            }
        }
        return claimList;
    }

    public void getClaimByClaimId(int claimId) throws SQLException {
        String sql = "SELECT claim_id FROM claims WHERE claim_id = ?";
        Claim claim = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery();) {
            stmt.setInt(1, claimId);
            while (rs.next()) {
                claim = new Claim();
                claim.setClaimId(rs.getInt("claim_id"));
                claim.setUserId(rs.getInt("user_id"));
                claim.setSurplusId(rs.getInt("surplus_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addClaim(Claim claim) throws SQLException {
        String sql = "INSERT INTO claims (user_id, surplus_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, claim.getUserId());
            stmt.setInt(2, claim.getSurplusId());
            stmt.executeUpdate();
        }
    }

    public void updateClaim(Claim claim) throws SQLException {
        String sql = "UPDATE claims SET user_id = ?, surplus_id = ? WHERE claim_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, claim.getUserId());
            stmt.setInt(2, claim.getSurplusId());
            stmt.setInt(3, claim.getClaimId());
            stmt.executeUpdate();
        }
    }

    public void deleteClaim(int claimId) throws SQLException {
        String sql = "DELETE FROM claims WHERE claim_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, claimId);
            stmt.executeUpdate();
        }
    }
}
