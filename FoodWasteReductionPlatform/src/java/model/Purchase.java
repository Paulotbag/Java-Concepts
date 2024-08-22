package model;

/**
 *
 * @author khush
 */
public class Purchase {

    private int purchaseId;
    private int userId;
    private int surplusId;

    public Purchase() {
    }

    public Purchase(int purchaseId, int userId, int surplusId) {
        this.purchaseId = purchaseId;
        this.userId = userId;
        this.surplusId = surplusId;

    }

    public Purchase(int userId, int surplusId) {
        this.userId = userId;
        this.surplusId = surplusId;

    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
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
