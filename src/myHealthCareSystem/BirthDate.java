package myHealthCareSystem;

/**
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 */
/**
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */
public class BirthDate {
	/*	Attributes			************************************/
	/** Birth day															*/
	private	final int day;
	/** Birth month.														*/
	private	final int month;
	/** Birth year.														*/
	private	final int year;	
	
	/*	Constructors		************************************/
	/**
	 * Create the birth date for this patient.
	 * @param year	-> Year of birth (4 numeric characters)
	 * @param month	-> Month of birth (01 thru 12) (2 digit month)
	 * @param day -> Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		if (year < 0 || year < 1900 || year >2100) {
            this.year=1900;
        }else {
        	this.year = year;
        }
		
		if (month < 1 || month > 12) {
			this.month=1;
        } else {
        	this.month = month;
        }
		
		if (day < 1 || day > 31) {
			this.day=1;
        }else {
        	this.day = day;
    		
        }
	}
	
	
	/*	Accessors			************************************/
	public int	getDay(){	
		return day;			}
	public int	getMonth(){	
		return month;		}
	public int	getYear(){	
		return year;		}
	
	/* Modifiers			************************************/

	
	/*	Normal Behavior	************************************/
	public String formattedBirthDate()	{
		return String.valueOf(this.year) + "/" + String.valueOf(this.month) + "/" + String.valueOf(this.day);
	}


	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString()	{
		return /* "<" + getClass().getName() + ">: " + */ "[year= " + this.year + ", month= " + this.month + ", day= " + this.day + "]"; 
	}
	

}
