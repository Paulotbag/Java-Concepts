package model;

public class Subscription {
    private int subscriptionId;
    private int userId;
    private String location;
    private String communicationMethod;
    private String foodPreferences;

    public Subscription() {
    }

    public Subscription(int subscriptionId, int userId, String location, String communicationMethod, String foodPreferences) {
        this.subscriptionId = subscriptionId;
        this.userId = userId;
        this.location = location;
        this.communicationMethod = communicationMethod;
        this.foodPreferences = foodPreferences;
    }

    public Subscription(int userId, String location, String communicationMethod, String foodPreferences) {
        this.userId = userId;
        this.location = location;
        this.communicationMethod = communicationMethod;
        this.foodPreferences = foodPreferences;
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


   public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(String communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public String getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(String foodPreferences) {
        this.foodPreferences = foodPreferences;
    }
       public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
}
