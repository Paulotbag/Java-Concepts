/*
 * Assessment: 23 F CST8116 Lab Exercise 04
Student Name: Paulo Ricardo Gomes Granjeiro
Lab Professor Name: Mel Sanschagrin
Lab Section Number: 362
Due Date: November 8
 */

import java.util.Scanner;

/* 
 * Simple class, contains main line logic for application.
 * It will ask for inputs from the user for the variables gender57 and shoeSize57.
 * At the end, it will prompt in the console the report57 (shoe size convention).
 */
public class Program {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//declaring variables
		int shoeSize57 	= 0;	// User's Canadian shoe size
		String gender57 = null;	// User's gender
		String report57	= null; // report from object
		
		//making the user provide values to input in the variables
		System.out.print("Please enter your Canadian shoe size ");
		shoeSize57 = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("Please enter your gender (male or female) ");
		gender57 = keyboard.nextLine();
		
		//closing the scanner
		keyboard.close();
		
		ShoeSizeConverter shoeSizeConverter = new ShoeSizeConverter(shoeSize57, gender57);
		
		//using the createReport() method to provide the value for report57
		report57 = shoeSizeConverter.createReport();

		System.out.println(report57);
		// update the line below to include your name
		System.out.println("Program by Paulo Ricardo Gomes Granjeiro");
		System.out.println();
		
	}
}



