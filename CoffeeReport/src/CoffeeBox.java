/*
 * Student Name: Paulo Ricardo Gomes Granjeiro
 * Lab Professor: Professor Mel Sanschagrin
 * Due Date: 2023-11-22
 * Description: Lab Exercise 05 .
 */

public class CoffeeBox {
	private static long count = 0;
    private double weight;

    public CoffeeBox(double weight) {
    	// implement me by assigning the parameters to the right class and instance variables
    	// remember you need to keep the count of created coffee boxes here
    	this.weight = weight; //this is what I've done for this part
    	count++;
    }

    public String classifyBox(double targetWeight, double tolerance) {
    	if ((weight<=(targetWeight+tolerance)) && (weight>=(targetWeight-tolerance))){
    		return "pass";
    	}
    	else {
    	return "fail";
    	}
    }

	public static long getCount() {
		return count;
	}
}
