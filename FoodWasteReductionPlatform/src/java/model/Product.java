package model;

import java.sql.Date;

public class Product {
    private int productId;
    private String productName;
    private int userId;
    private double price;
    private Date expiryDate;


    public Product() {
    }

    public Product(int productId, String productName, int userId, double price, Date expiryDate) {
        this.productId = productId;
        this.productName = productName;
        this.userId = userId;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public Product(String productName, int userId, double price, Date expiryDate) {
        this.productName = productName;
        this.userId = userId;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    


}
