 /* Student Name:  Paulo Ricardo Gomes Granjeiro
 * Lab Professor:  Professor Mel Sanschagrin
 * Due Date:  2023/11/24
 */ 

/*
 * This class is responsible to classify the egg according to its weight using the method classifyCanadaAEgg.
 * Because it is a public static method, it can be called in another class without the need of calling a instance of this class.
 */
public class CanadaAEggClassifier {
	
	/*
	 * This is a utility class with only static members, prevents
	 * instantiation.
	 */
	private CanadaAEggClassifier() { }
	
	/*
	 *  The following method will verify and classify the egg according to its weight. This weight
	 *  comes from the instance egg from CanadaAEgg which allows to use the method getWeight inside
	 *  the classifyCanadaAEgg to get the value for weight.
	 */
	
	public static char classifyCanadaAEgg(CanadaAEgg egg) { //>>FOCUS HERE
		// This method will return a character based on the size designation for the egg:
		double weight = egg.getWeight();
		if ((int)Math.round(weight) >= 70) {
			return 'J';
		}
		else if ((int)Math.round(weight) >= 63) {
			return 'E';
		}
		else if ((int)Math.round(weight) >= 56) {
			return 'L';
		}
		else if ((int)Math.round(weight) >= 49) {
			return 'M';
		}
		else if ((int)Math.round(weight) >= 42) {
			return 'S';
		}
		else  {
			return 'P';
		}
		// J for Jumbo Size
		// E for Extra Large Size
		// L for Large Size
		// M for Medium Size
		// S for Small Size
		// P for Peewee Size
		
		
		// Please refer to [1] to know how to determine the size designations for eggs.
		//placeholder so the code will compile, update with the actual classification value
	}
	
}
/*
 * References:
 * [1] Egg Grade Requirements.  inspection.canada.ca.
 * https://inspection.canada.ca/about-cfia/acts-and-regulations/list-of-acts-and-regulations/documents-incorporated-by-reference/canadian-grade-compendium-volume-5/eng/1520869505643/1520869506282?chap=1 (Accessed Sept. 10, 2023).
 */

