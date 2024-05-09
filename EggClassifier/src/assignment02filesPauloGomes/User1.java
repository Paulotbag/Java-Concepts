/*
 * Student Name:  Paulo Ricardo Gomes Granjeiro
 * Lab Professor:  Professor Mel Sanschagrin
 * Due Date:  2023/11/24
 * Description:  Assignment 02 (23F) Starter Code
 * - create a method inputPositiveDouble(String prompt) that ensures that only 
 *   positive numbers are entered, use this in the main method logic.
 */

import java.util.Scanner;

/*
 * This class provides utility for getting user input from the console using
 * an instance of Scanner set to new Scanner(System.in) and has methods that 
 * prevent program crashes from text inputs when numbers are expected.
 */
public class User1 {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	/*
	 * This is a utility class with only static members, prevents
	 * instantiation.
	 */
	private User1() { }
	
	/*
	 * Does not prompt the user, reads in an int value when there is one.  If
	 * the user does not provide input that can be converted into an int an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right.  A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 */
	public static int inputInteger() {
		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;
		while (isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if (hasNextInt) {
				value = keyboard.nextInt();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input.  Enter an integer number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}
	
	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls to method inputInteger() to get the actual input value.
	 */
	public static int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}
	
	/*
	 * Does not prompt the user, reads in a double value when there is one.  If
	 * the user does not provide input that can be converted into a double an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right.  A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 */
	public static double inputDouble() {
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		while (isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if (hasNextDouble) {
				value = keyboard.nextDouble();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;	
	}
	
	/*
	 * This method prompts the user using the argument sent to message
	 * and then calls to method inputDouble() to get the actual input value.
	 */
	public static double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	
	/*
	 * This method is used to get a line of text from the console, it reads
	 * until it encounters a line terminator character.
	 */
	public static String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	
	/*
	 * This method prompts the user using the argument sent to message, 
	 * then calls to method inputString() which reads in the actual text.
	 */
	public static String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
	
	/*
	 * The following method utilizes the similar structure of inputDouble() method.
	 * It will check if the user is providing a positive number for weight. If the user does not provide it, it will prompt a message 
	 * to inform the user that only positive number is allowed and ask him to provide the weight again. This will be a loop 
	 * while the user keep providing a negative or zero number.
	 */
	
	public static double inputPositiveDouble(double message) { //>>FOCUS HERE (1) - I changed String prompt to message
		boolean isInputBad = true;
		double value = message;
		while (isInputBad) {
			if (value <= 0) {
				System.out.print("Enter positive number only.\nEnter measured weight: ");
				value = keyboard.nextDouble();
				keyboard.nextLine(); // clean up input stream
			}
			else {
				isInputBad = false; // break out of loop
			}
			
		}
		return value;	
	}
}