/*
 * Author: Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * Course: CST8284 813
 * Professor: Natalie Gluzman
 * Date:2024/01/08
 */

/**
 * This class should has constructors and methods to count the users clicks
 * @see java.lang.object
 * @author paulo
 */


public class CountClicks {
	
	private int numClicks;

	/**
	 * CountClicks with no arguments will initialize the variable to zero, because int
	 * default value is zero.
	 */

	//method to track the clicks of the user.
	public static int click() {
		
		return numClicks;
	}
	
	//the undo() method is used to undo clicks.
	public static void undo() {
		
	}
	
	//the getValue() method is used to get the amount of clicks.
	public int getValue() {
		return this.numClicks;
	}
	
	//the reset() method is responsable to reset values when we face negative number of clicks.
	
}
