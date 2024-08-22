package model;

import java.sql.Date;

/**
 *
 * @author khush
 */
public class Claim {
    private int claimId;
    private int userId;
    private int surplusId;
 
    public Claim() {
    }

    public Claim(int claimId, int userId, int surplusId) {
        this.claimId = claimId;
        this.userId = userId;
        this.surplusId = surplusId;
     
    }
    
    public Claim(int userId, int surplusId) {
        this.userId = userId;
        this.surplusId = surplusId;
        
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSurplusId() {
        return surplusId;
    }

    public void setSurplusId(int surplusId) {
        this.surplusId = surplusId;
    }



   
}
