// To Do: Programmer Comments

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		GradingSystem gradingSystem = null;
		Scanner keyboard = new Scanner(System.in);
		String course = null;
		String grade = null;
		

		System.out.print("Please enter course number ");
		course = keyboard.nextLine();

		System.out.print("Please enter letter grade ");
		grade = keyboard.nextLine();
		keyboard.close();
		gradingSystem = new GradingSystem(course, grade);
		
		gradingSystem.createReport();
		
		
		// update the line below to include your name
		System.out.println("\nProgram by Paulo Ricardo Gomes Granjeiro");
		System.out.println();

	}
}



