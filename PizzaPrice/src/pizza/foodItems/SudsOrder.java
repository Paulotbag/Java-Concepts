package pizza.foodItems;

import pizza.services.Deliverable;

public class SudsOrder implements Deliverable{
/**
 * SudsOrder Attributes.
 */
	private String name;
	private int number;
	private int sizeInMl;
	
	/**
	 * Constructor for instance of class SudsOrder.
	 * @param name -> name of sudsOrder.
	 * @param number -> number of sodas.
	 * @param sizeInMl -> size of the sudsOrder in milliliter.
	 */
	public SudsOrder(String name, int number, int sizeInMl) {
		this.name = name;
		this.number = number;
		this.sizeInMl = sizeInMl;
	}
	
	/**
	 * Getter for name attribute of class SudsOrder.
	 * @return name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Getter for number attribute of class SudsOrder.
	 * @return number.
	 */
	public int getNumber() {
		return this.number;
	}
	
	/**
	 * Getter for sizeInMl attribute of class SudsOrder.
	 * @return sizeInMl.
	 */
	public int sizeInMl() {
		return this.sizeInMl;
	}
	
	/**
	 * Overrides original toString method. This implements attributes of class SudsOrder.
	 * @return [name + " " + number + " " + sizeInMl].
	 */
	@Override
	public String toString() {
		return name + " " + number + " " + sizeInMl;
	}
	
	/**
	 * deliveryCost() for SudsOrder. The cost of a suds order "is" the delivery cost.
	 * @return this.number * 0.75.
	 */
	@Override
	public double deliveryCost() { 
		return this.number * 0.75; // number is how many units are ordered
	}
	
}
