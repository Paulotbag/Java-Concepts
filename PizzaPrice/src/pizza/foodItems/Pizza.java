package pizza.foodItems;

import pizza.services.Deliverable;
import java.util.ArrayList;
import java.util.List;

public class Pizza implements Deliverable {

    /**
     * Pizza Class' attributes
     */
    public static final boolean THIN_CRUST = true;
    private int sizeInInches;
    private String typeOfSuace;
    private boolean thinCrust;
    private List<FoodItem> toppings;
    private double basePrice;

    /**
     * Constructor for Pizza Class. It constructs an instance of class Pizza.
     *
     * @param size  -> size in inches of the pizza.
     * @param sauce -> type of sauce.
     */
    public Pizza(int size, String sauce) {
        this.sizeInInches = size;
        this.typeOfSuace = sauce;
        this.toppings = new ArrayList<>();
    }

    /**
     * Constructor for Pizza Class. It constructs an instance of class Pizza.
     *
     * @param size      -> size in inches of the pizza .
     * @param basePrice -> minimum price for the pizza.
     */
    public Pizza(int size, double basePrice) {
        this.sizeInInches = size;
        this.basePrice = basePrice;
        this.toppings = new ArrayList<>();
    }

    /**
     * Getter for sizeInInches attribute of class FoodItem.
     *
     * @return sizeInInches.
     */
    public int getSizeInInches() {
        return sizeInInches;
    }


    /**
     * Getter for thinCrust attribute of class FoodItem.
     *
     * @return thinCrust.
     */
    public boolean isThinCrust() {
        return thinCrust;
    }


    /**
     * Getter for basePrice attribute of class FoodItem.
     *
     * @return basePrice.
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * Setter for basePrice attribute of class FoodItem.
     *
     * @return basePrice.
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * Setter for thinCrust attribute of class FoodItem.
     *
     * @return thinCrust.
     */
    public void setThinCrust(boolean thinCrust) {
        this.thinCrust = thinCrust;
    }

    /**
     * Getter for typeOfSuace attribute of class FoodItem.
     *
     * @return typeOfSuace.
     */
    public String getTypeOfSuace() {
        return typeOfSuace;
    }

    /**
     * Getter for toppings attribute of class FoodItem.
     *
     * @return List<FoodItem> toppings.
     */
    public List<FoodItem> getToppings() {
        return toppings;
    }

    /**
     * Adding a topping to the pizza.
     *
     * @param item -> an object/instance of class FoodItem
     */
    public void addTopping(FoodItem item) {
        toppings.add(item);
    }

    /**
     * Getter for sizeInInches attribute of class FoodItem.
     *
     * @return sizeInInches.
     */
    public int sizeInInches() {
        return this.sizeInInches;
    }

    /**
     * override of toString() method
     *
     * @return A string object following the format: sizeInInches + " " + typeOfSuace + " " + thinCrust + " " + toopings + " " + basePrice
     */
    public String toString() {
        return sizeInInches + " " + typeOfSuace + " " + thinCrust + " " + toppings + " " + basePrice;
    }

    /**
     * This method calculates the delivery cost according to the size in inches of the pizza.
     *
     * @return price -> the cost of the delivery
     */
    @Override
    public double deliveryCost() { //Delivery costs: 10" = 2.50, 12" = 3.50, 14" = 4.75
        double price = 0.0;
        switch (this.sizeInInches) {
            case 10:
                price = 2.50;
                break;

            case 12:
                price = 3.50;
                break;

            case 14:
                price = 4.75;
                break;
        }
        return price;
    }
	
	
    /**
     * Calculates price of the pizza with the selected toppings.
     * @return [this.basePrice + toppingsPrice].
     */
    public double price() { //price is base price plus toppings price
        if (this.toppings != null) {
            double toppingsPrice = 0.0;
            for (FoodItem topping : toppings) {
                toppingsPrice += topping.price();
            }
            return this.basePrice + toppingsPrice; //base price plus toppings
        } else {
            return this.basePrice; //just base price
        }
    }

    /**
     * Calculates price of the pizza with the selected toppings.
     * @return [this.basePrice + toppingsPrice + price].
     */
    public double totalPrice() { //totalPrice is price plus delivery costs
        double deliveryPrice = deliveryCost(); // calculate delivery cost based on size
        double toppingsPrice = 0.0;
        if (this.toppings != null) {
            for (FoodItem topping : toppings) { // calculate toppings price
                toppingsPrice += topping.price();
            }
        }
        return this.basePrice + toppingsPrice + deliveryPrice; //base price plus toppings plus delivery costs
    }
}