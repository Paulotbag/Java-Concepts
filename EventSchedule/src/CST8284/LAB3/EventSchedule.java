package CST8284.LAB3;

import java.util.Calendar;

/*
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Paulo Ricardo Gomes Granjeiro. 
 */

/**
 *  
 * This class is named EventSchedule Class. It shows constructor chaining using
 * keyword "this". In this code, the simpler constructors call all the more
 * complex one, thereby chaining the calls 'UPWARDS' (from the default
 * constructor to the one with the most arguments.
 * 
 * @see TestDemo
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */

/*
 * Course: CST8284 813
 * Professor: Natalie Gluzman
 * Lab: 3
 * Date: 2024/01/29
 * References used to complete EventSchedule() constructor and toString method: 
 * 1)https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html#:~:text=getName,-public%20String%20getName&text=String%20getName()-,Returns%20the%20name%20of%20the%20entity%20(class%2C%20interface%2C%20array,The%20Java%E2%84%A2%20Language%20Specification%20.
 * 2)https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
 */
public class EventSchedule {

	/** Year component of the date of EventSchedule.											*/
	private int year;

	/** Month component of the date of EventSchedule.															*/
	private int month;

	/** Day component of the date of EventSchedule.												*/
	private int day;


	/**
	 * EventSchedule() is the default constructor. 
	 * It sets year, month, and day to the current date.
	 */
	public EventSchedule() {
		Calendar rightNow = Calendar.getInstance();
		this.day = rightNow.get(Calendar.DAY_OF_MONTH);
		this.month = rightNow.get(Calendar.MONTH)+1;
		this.year = rightNow.get(Calendar.YEAR);	
	}

	/**
	 * This constructor sets the year as passed, month to current month, and day to current day.
	 * @param year -> The year of this EventSchedule is passed by the user.
	 */
	public EventSchedule(int year) {
		Calendar rightNow = Calendar.getInstance();
		this.day = rightNow.get(Calendar.DAY_OF_MONTH);
		this.month = rightNow.get(Calendar.MONTH)+1;
		this.year = year;
		
	}


	/**
	 * This constructor sets the year as passed, month as passed, and day to current day.
	 * @param year -> The year of this EventSchedule is passed by the user.
	 * @param month -> The month of this EventSchedule is passed by the user.
	 */
	public EventSchedule(int year, int month) {
		Calendar rightNow = Calendar.getInstance();
		this.day = rightNow.get(Calendar.DAY_OF_MONTH);
		this.month = month;
		this.year = year;
	}

	/**
	 * This constructor sets the year as passed, month as passed, and day as passed.
	 * @param year -> The year of this EventSchedule passed by the user.
	 * @param month -> The month of this EventSchedule passed by the user.
	 * @param day -> The day of this EventSchedule passed by the user.
	 */
	public EventSchedule(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * Returns the year for this EventSchedule instance.
	 * @return the year for this EventSchedule instance.
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * Returns the month of this EventSchedule instance.
	 * @return the month of this EventSchedule instance.
	 */
	public int getMonth() {
		return this.month;
	}

	/**
	 * Returns the day of this EventSchedule instance.
	 * @return the day of this EventSchedule instance.
	 */
	public double getDay() {
		return this.day;
	}

	/**
	 * Sets the year for this EventSchedule instance.
	 * @param year -> This is the year to set for EventSchedule instance.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Sets the month for this EventSchedule instance.
	 * @param month -> This is the month to set for EventSchedule instance.
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Sets the day for this EventSchedule instance.
	 * @param day -> This is the day to set for EventSchedule instance.
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Convert this class into a meaningful string.
	 * It follows the format "class name:[attribute_Name=attribute_value,attribute_name=attibute_value....]".
	 * @return	"information" -> Return this object as a string showing the class, each instance variable name and value pair.
	 */
	public String toString()	{
		String information = "<" + EventSchedule.class.getName() + ">:[year=" + String.valueOf(year) + ", month=" + String.valueOf(month) + ", day=" + String.valueOf(day) + "]";
		return information;
	}
	
	/**
	 * This method output the date based on the EventSchedule instance.
	 * @return A formatted String representation of this EventSchedule, each field is
	 *         separated by a forward slash in the order year, month and day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "%d/%02d/%d%n", year, month, day);
	}

}
