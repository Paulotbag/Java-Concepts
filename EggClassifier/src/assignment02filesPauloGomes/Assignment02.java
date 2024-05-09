/* Student Name:  Paulo Ricardo Gomes Granjeiro
 * Lab Professor:  Professor Mel Sanschagrin
 * Due Date:  2023/11/24 
 * 
 */ 


/*
 * This class is the executor class. It has the main method and is the one responsible to call the necessary methods from other
 * classes to check in which class each egg provided fits. This class has some primitive and references variables declared 
 * as well as some loops and output messages.
 */
public class Assignment02 {

	/*This main method has some variables to help classify the egg provided by the user and also has some decision statements
	 * to evaluate if the user still wish to continue running the code and providing more egg weights. 
	 * This method also will count how many eggs where provided by the user through the do-while loop using the
	 * counterLoop variable to check this information.
	 */
	
	public static void main(String[] args) { //>>FOCUS HERE
	
		// (declare and initialize other variables as needed here)
		boolean keep=true;
		String evaluate = null;
		int counterLoop = 0;
		double weight;
		String[] eggTypes = {"Jumbo Size", "Extra Large Size", "Large Size", "Medium Size", "Small Size", "Peewee Size"};
		int[] counter = new int[(eggTypes.length)];
		CanadaAEgg egg = new CanadaAEgg();
		do {
		
		// Prompt the user to enter the weight of the egg 
		// Enter measured weight: 
		weight = User1.inputPositiveDouble(User1.inputDouble("\nPlease enter the weight of the egg: "));
		
		// Set the weight into an instance of CanadaAEgg
		egg.setWeight(weight);
		
		// Use the toString method of class CanadaAEgg
		// to output the information for the egg
		System.out.println(egg.toString());
		
		// Use the CanadaAEggClassifier method to obtain a classification of an egg instance
		// by passing the CanadaAEgg reference-value as an argument.
		// Output a message to tell the user the classification of the egg instance
		// for example
		//   Egg is of Jumbo Size.
		switch(CanadaAEggClassifier.classifyCanadaAEgg(egg)) {
		case 'J':
			System.out.println("Egg is of Jumbo Size\n");
			counter[0]++;
			break;
		case 'E':
			System.out.println("Egg is of Extra Large Size\n");
			counter[1]++;
			break;
		case 'L':
			System.out.println("Egg is of Large Size\n");
			counter[2]++;
			break;
		case 'M':
			System.out.println("Egg is of Medium Size\n");
			counter[3]++;
			break;
		case 'S':
			System.out.println("Egg is of Small Size\n");
			counter[4]++;
			break;
		default:
			System.out.println("Egg is of Pewee Size\n");
			counter[5]++;
			break;
		}
		
		counterLoop++;
		System.out.println("Eggs entered: " + counterLoop);
		for (int i = 0; i< eggTypes.length; i++) {
			System.out.println(eggTypes[i] + ": " + counter[i] );
		}
		
		System.out.println("Program by Paulo Ricardo Gomes Granjeiro, 041118057, Lab Section 362\n");
		
		evaluate = User1.inputString("Continue (yes/no)? -> ");
		
		switch(evaluate) {
		case "YES":
			keep = true;
			break;
		case "yes":
			keep = true;
			break;
		case "yES":
			keep = true;
			break;
		case "YEs":
			keep = true;
			break;
		case "YeS":
			keep = true;
			break;
		case "Yes":
			keep = true;
			break;
		case "yeS":
			keep = true;
			break;
		case "yEs":
			keep = true;
			break;
		case "y":
			keep = true;
			break;
		default:
			keep = false;
			System.out.println("Program has shut down.");
			break;
		}
		
		}
	
		while(keep == true);
		
		// Collect a count of, and display to the user:
		// the number of egg weights entered
		// the number of egg weight measurements that fall under each of the size designations
		// for example
		//   Eggs entered: 10
		//   Jumbo Size: 2
		//   Extra Large Size: 1
		//   Large Size: 3
		//   Medium Size: 1
		//   Small Size: 1
		//   Peewee Size: 2
		
	
		
		
		// Using a loop ask if there is more data to enter (yes, no) and continue
		// only if the user enters some form of yes
		// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)
		// if yes, processing should repeat starting with the output of the user-instructions
		
		// You can use any decision structure or loop for this program,
		// however a for-loop is not recommended for the main method logic

	}
}
