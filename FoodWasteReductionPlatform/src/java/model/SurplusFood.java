package model;

import java.sql.Date;

/**
 * Class for DTO object of SurplusFood
 */
public class SurplusFood {

    private int surplusId;
    private int productId;
    private int quantity;
    private Date expiryDate;
    private double price;
    private String status;

    public SurplusFood() {
    }

    public SurplusFood(int surplusId, int productId, int quantity, Date expiryDate, double price, String status) {
        this.surplusId = surplusId;
        this.productId = productId;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.price = price;
        this.status = status;
    }

    public SurplusFood(int productId, int quantity, Date expiryDate, double price, String status) {
        this.productId = productId;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.price = price;
        this.status = status;
    }

    /**
     * @return int
     */
    public int getSurplusId() {
        return surplusId;
    }

    /**
     * @param surplusId
     */
    public void setSurplusId(int surplusId) {
        this.surplusId = surplusId;
    }

    /**
     * @return String
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return int
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return int
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
