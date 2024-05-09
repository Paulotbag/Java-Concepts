package pizza.foodItems;

public class FoodItem {

	/**
	 * FoodItem attributes
	 */
	private String name;
	private String unitsOfMeasure; //{cup, half cup, quarter cup, oz, milliliters}
	private float quantity;
	private double pricePerUnit;
	
	/**
	 * Constructor for instance of class FoodItem
	 * @param name -> name of the food item
	 */
	public FoodItem(String name) {
		this.name = name;
	}
	
	/**
	 * Setter for unitsOfMeasure attribute of class FoodItem.
	 * @return unitsOfMeasure.
	 */
	public void setUnitsOfMeasure(String unitType) {
		this.unitsOfMeasure = unitType;
	}
	
	/**
	 * Setter for quantity attribute of class FoodItem.
	 * @return quantity.
	 */
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Setter for pricePerUnit attribute of class FoodItem.
	 * @return pricePerUnit.
	 */
	public void setPricePerUnit(double price) {
		this.pricePerUnit = price;
	}
	
	/**
	 * Getter for name attribute of class FoodItem.
	 * @return name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Calculates the price for each toppings according to the quantity and price of that unity.
	 * @return Double.valueOf(this.quantity)*this.pricePerUnit.
	 */
	public double price() {//price() is quantity * pricePerUnit. unit of measure types are for future expansion
		return Double.valueOf(this.quantity)*this.pricePerUnit;
	}

	
	
	
}
