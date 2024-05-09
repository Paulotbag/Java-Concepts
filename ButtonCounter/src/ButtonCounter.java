/**
 *
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * Course: CST8284 813
 * Professor: Natalie Gluzman
 * Date:2024/01/08
 */

public class ButtonCounter		{
	/** this variable is private to this class and it will be used
	 * to count the clicks	
	 */
	private int count;

	/**
	 * Get the number of clicks. It get the private variable count from this class
	 */
	public int getCount()		{
		return this.count;
	}

	/**
	 *This method will increment the value of the count variable by 1.
	 */
	public void add()	{
		this.count = (this.count + 1);
	}

	/**
	 * this will reset the variable count. It will make it equals to zero.
	 */
	public void reset()	{
		this.count = 0;
	}

	/**
	 * this method will reduce 1 value from count variable. 
	 * It will not reduce to negative values.
	 */
	public void minus()	{
		this.count = (this.count -1);
		if (this.count <0){
			this.count =0;
		}
	}
}