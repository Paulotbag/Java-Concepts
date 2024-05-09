
package polymorphism;

import java.util.Scanner;

/**
 * This class is called the MillerTest Class and provides the main method for
 * your program. This program shows polymorphism by applying a method to objects
 * of different classes. Note that in your program, the Users should be prompted
 * to input hours done worked by each miller. You must implement using an array.
 * The order of the workers in the output is Consultants, Employees and
 * Supervisors. Use the names in the output sample file provided for you. Assume
 * an annual pay, for example $84,000 and $30 as a Supervisor's bonus.
 */



public class MillersTest {
	
	
	/**
	 * Main entry point for testing purposes
	 * @param args	argument list as entered on the command line 
	 */
	public static void main(String[] args) {
		
		int hours;
		Scanner sc = new Scanner(System.in);
		Millers millers1 = new Consultants("Abby, Obi", 16.5); //consultants wage is per hour according to the received file
		Millers millers2 = new Employees("Goodman, Goodman", 84000); //the employees and supervisors receive a fix payment bi-weekly according to the received file
		Millers millers3 = new Supervisors("Myers, Myers", 84000, 30); //supervisors receive a bonus.
		
		Millers[] allMillers = {millers1, millers2, millers3};
		
		for(int i=0 ; i<allMillers.length ; i++) {
			System.out.printf("Enter the hours done by %s:", allMillers[i].getName());
			hours=sc.nextInt();
			System.out.printf("Total Pay for this miller is: %.2f \n\n", allMillers[i].biWeeklyPay(hours));
			
		}
		sc.close();
		

	
	
	
	}
}
