/*
 * Assessment: 23 F CST8116 Lab Exercise 04
Student Name: Paulo Ricardo Gomes Granjeiro
Lab Professor Name: Mel Sanschagrin
Lab Section Number: 362
Due Date: November 8
 */

/* This class is responsible to create the object ShoeSizeConverter (a default constructor and a overload).
* This object also contain the createReport() method, responsible for converting the shoe size.
*/

public class ShoeSizeConverter {
	int shoeSize57 = 0; // User's Canadian shoe size
	String gender57 = null; // User's gender

	// default constructor
	public ShoeSizeConverter() {
		this(0, "");
	}

	// overload constructor with two parameters
	public ShoeSizeConverter(int shoeSize57, String gender57) {
		this.shoeSize57 = shoeSize57;
		this.gender57 = gender57;
	}

	// accessor
	public double getShoeSize() {
		return shoeSize57;
	}

	// mutator
	public void setShoeSize(int shoeSize57) {
		this.shoeSize57 = shoeSize57;
	}

	// accessor
	public String getGender() {
		return gender57;
	}

	// mutator
	public void setGender(String gender57) {
		this.gender57 = gender57;
	}

	// creating method createReport() to convert Canadian shoes to UK and EU
	public String createReport() {
		String report57 = null;

		switch (shoeSize57) {
			case 7:
				report57 = ("UK Size = 6, EU Size = 39");
				break;
			case 9:
				switch (gender57) {
					case "male":
						report57 = ("UK Size = 8, EU Size = 42");
						break;
					default:
						report57 = ("UK Size = 7, EU Size = 40");
						break;
				}
				break;
			case 10:
				report57 = ("UK Size = 9, EU Size = 43");
				break;
			default:
				report57 = "Shoe size not found";
				break;
		}
		System.out.print("Entered Canadian shoe size as " + shoeSize57 +
				" and  gender as: " + gender57 + " ");
		return report57;
	}
	/*
	 * if (shoeSize57 == 7) {
	 * report57 = ("UK Size = 6, EU Size = 39");
	 * } else if (shoeSize57 == 9 && gender57.equals("male")) {
	 * report57 = ("UK Size = 8, EU Size = 42");
	 * } else if (shoeSize57 == 9 && gender57.equals("female")) {
	 * report57 = ("UK Size = 7, EU Size = 40");
	 * } else if (shoeSize57 == 10) {
	 * report57 = ("UK Size = 9, EU Size = 43");
	 * } else {
	 * report57 = "Shoe size not found";
	 * }
	 * System.out.print("Entered Canadian shoe size as " + shoeSize57 +
	 * " and  gender as: " + gender57 + " ");
	 * return report57;
	 */
}
