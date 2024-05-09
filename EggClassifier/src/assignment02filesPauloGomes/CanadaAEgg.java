 /* Student Name:  Paulo Ricardo Gomes Granjeiro
 * Lab Professor:  Professor Mel Sanschagrin
 * Due Date:  2023/11/24
 * Description:  Assignment 02 (23F) Starter Code
 */

/*
 * This class models a Canada A (or Grade A) egg with measurement for its 
 * weight in grams.  
 * A constant is provided for the default weight of a Canada A egg.
 */
public class CanadaAEgg {

	//ToDo:  Define a constant named DEFAULT_WEIGHT with a value of 57.50
	//       Use this constant inside of the no-argument constructor below to set the
	//       initial value of the instance variable weight
	final static double DEFAULT_WEIGHT = 57.50;

	private double weight; // Measured weight in grams
	
	/*
	 * No-argument constructor, sets weight to the default weight.
	 */
	public CanadaAEgg() { 
	weight = DEFAULT_WEIGHT;
	}
	/*
	 * Overloaded constructor, sets weight as specified.
	 */
	public CanadaAEgg(double weight) {
		this.weight = weight;
	}

	/*
	 * Accessor for weight, uses grams as unit of measure
	 */
	public double getWeight() {
		return weight;
	}

	/*
	 * Mutator for weight, uses grams as unit of measure
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * Returns a String that represents the data held within this object.
	 */
	public String toString() {
		String result;

		// the \ in the text-block escapes so there is no line-feed at the end
		// of the generated String.
		result = String.format(
				"""
				Entered weight is %.2f (grams) \
				""", weight);
		
		return result;
	}
	
}
