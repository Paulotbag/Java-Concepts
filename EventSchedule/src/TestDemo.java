/*
 * LAB 3!
 * The essence of this activity is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in the code using the Javadoc style.  
 */

import CST8284.LAB3.EventSchedule;

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */

/*
 * Course: CST8284 813
 * Professor: Natalie Gluzman
 * Lab:3
 * Date:2024/01/22
 * Reference used for anonymous objects:
 * https://www.geeksforgeeks.org/anonymous-object-in-java/
 */

public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		System.out.println("This was run in January 29, 2024 \n");
		System.out.println("Just creating 4 EventSchedules \n");
			
		System.out.println("EventSchedule1");
		System.out.printf("EventSchedule(int, int, int) was called%nEventSchedule() was called%n");
		System.out.println(new EventSchedule().createReport());
		
		System.out.println("EventSchedule2");
		System.out.printf("EventSchedule(int, int, int) was called%nEventSchedule(int) was called%n");
		System.out.println(new EventSchedule(2023).createReport());
		
		System.out.println("EventSchedule3");
		System.out.printf("EventSchedule(int, int, int) was called%nEventSchedule(int, int) was called%n");
		System.out.println(new EventSchedule(2023,12).createReport());
		
		System.out.println("EventSchedule4");
		System.out.printf("EventSchedule(int, int, int) was called%n");
		System.out.println(new EventSchedule(2023,12,15).createReport());
				


		/*
		 * Sample of output.
		 * This was run on January 17, 2024
		 * 
		 * Just creating 4 EventSchedules
		 * 
		 * EventSchedule1
		 * EventSchedule(int, int, int) was called
		 * EventSchedule() was called
		 * EventSchedule, 2024/1/17
		 *
		 * 
		 * EventSchedule2
		 * EventSchedule(int, int, int) was called
		 * EventSchedule(int) was called
		 * EventSchedule, 2023/1/17
		 * 
		 * 
		 * EventSchedule3
		 * EventSchedule(int, int, int) was called
		 * EventSchedule(int, int) was called
		 * EventSchedule, 2023/12/17
		 * 
		 * 
		 * EventSchedule4
		 * EventSchedule(int, int, int) was called
		 * EventSchedule, 2023/12/15
		 */
		
	}

}
