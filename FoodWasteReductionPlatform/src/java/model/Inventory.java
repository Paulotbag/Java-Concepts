package model;

public class Inventory {
    private int inventoryId;
    private int productId;
    private int quantity;
    private String location;
    private int userId;

    public Inventory() {
    }

    public Inventory(int inventoryId, int productId, int quantity, String location, int userId) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.quantity = quantity;
        this.location = location;
        this.userId = userId;
    }

    public Inventory(int productId, int quantity, String location, int userId) {
        this.productId = productId;
        this.quantity = quantity;
        this.location = location;
        this.userId = userId;
    }


    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
}
