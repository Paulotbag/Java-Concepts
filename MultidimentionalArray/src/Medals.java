/**
 * @author Paulo Ricardo Gomes Granjeiro
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 * Student Number: 041118057
 * Course: CST8284 813
 * Professor: Natalie Gluzman
 * Lab:2
 * Date:2024/01/15
 */


/**
 * This program contains the class Medals
 * which prints a table of medal winner counts with row totals.
 */
public class Medals {
	/**
	 * This class has four attributes related to the medals.
	 */
	public static void main(String[] args) {
		final int MEDALS = 3;
		final int GOLD = 0;
		final int SILVER = 1;
		final int BRONZE = 2;
		int medalsCountry = 0;			// total number of medals for each ROW

		String[] countries = { "Canada", "Italy", "Germany", "Japan", "Kazakhstan", "Russia", "South Korea",
				"United States" };

		int[][] medalCounts = { { 4, 3, 3 }, { 0, 0, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 0, 1 }, { 3, 1, 1 }, { 0, 1, 0 },
				{ 1, 0, 1 } };
		
		/*
		 *	Array of size 3 to hold the total for each column.
		 * 	Small modifications in the code to keep total for each medal type were done as requested. 
		 *  and then use a for loop to print total line below were done as requested,
		 */
		
		int[] totalMedals = new int[3];


		/* Printing the heading using formatted print statements to align 
		 * the medal count for selected countries.
		 * */
		System.out.printf("        Country              Gold  Silver  Bronze   Total\n");
		System.out.printf("                             --------------------\n");
		
		/* Following loop prints out the medals by country.
		 * It Includes only those countries that have at least 1 gold medal
		 * Includes in the display all medals for a country that has at least one gold medal.
		 */
		
		for (int i = 0; i < countries.length; i++) {
			
			/* This selection will choose those countries 
			 * with "gold" medals.			
			 * */
			if (medalCounts[i][0]>0){
				
			/*Printing country name as a field of 15 bytes (as a String value)*/
			System.out.printf("        %-15s", countries[i]);
			
				/*Printing each ROW column value and accumulate the ROW total.
				 *Calculate the total number of medals for each ROW		*/
				for (int j = 0; j < MEDALS; j++) {
					medalsCountry = medalsCountry + medalCounts[i][j];
					totalMedals[j] = totalMedals[j] + medalCounts[i][j]; //Calculating total medals according to medal type.
					System.out.printf("%8d", medalCounts[i][j]);
				}
				
				/*Printing total number of medals for each ROW as a field of size 8
			     *and numeric data type. This includes newline after printing each value */
				System.out.printf("%8d%n", medalsCountry);
				medalsCountry = 0;
			}

		}

		/* Printing the footer and Total Medal types.
		 * It was used the same format as the previous printf() for the body of the output.
		 */
		System.out.printf("                             --------------------\n");
		System.out.printf("        %-15s", "Total Medals");
		for (int j = 0; j < MEDALS; j++) {
			System.out.printf("%8d", totalMedals[j]);
		}

	}
	
}