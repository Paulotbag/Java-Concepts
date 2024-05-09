/*
 * Student Name: Paulo Ricardo Gomes Granjeiro
 * Lab Professor: Professor Mel Sanschagrin
 * Due Date: 2023-11-22
 * Description: Lab Exercise 05 .
 */

public class Roastery {

    private int totalPassed = 0;
    private double totalWeightPassed = 0;
    private final double targetWeight;
    private final double tolerance;
    
    
    public Roastery(double targetWeight, double tolerance) {
    	this.targetWeight = targetWeight;
    	this.tolerance = tolerance;
    }

    public void assessCoffeeBoxes() {
    	// implement a loop to read the weight from the user and check whether it is tolerable
    	// you need to keep track of passed (not failed) coffee boxes count and sum of their weight
    	String choice;
    	double weight;
    	CoffeeBox coffeeBox;
    	String result;
    	choice = "yes";
    	do {
    		weight=User.inputDouble("Enter the weight of the coffee box: ");
    		coffeeBox = new CoffeeBox(weight);
    		result = coffeeBox.classifyBox(targetWeight, tolerance);
    		System.out.println("Classification: " + result);
    		if (result.equals("pass")) {
    			totalPassed = totalPassed  + 1;
    			totalWeightPassed = totalWeightPassed + weight;
    		}
    		choice = User.inputString("Do you want to assess another coffee box? (yes/no): ");
    	}
    	while (choice.equals("yes")); //this is all that I've done for this part
    	
    }

    public void createReport() {
        System.out.println("Total coffee boxes assessed: " + CoffeeBox.getCount());
        System.out.println("Number of coffee boxes passed: " + totalPassed);
        System.out.println("Number of coffee boxes failed: " + (CoffeeBox.getCount() - totalPassed));
        System.out.println("Total weight of passed coffee boxes: " + totalWeightPassed);
        System.out.println("Average weight of passed coffee boxes: " + (totalWeightPassed / totalPassed));
    }
}
