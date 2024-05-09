
package polymorphism;

/**
This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
*/

	public class Employees extends Millers{
		private double pay;


	/**
	 * Constructs an employee with a given name and an annual pay.
	 * @param name the name of this employee
	 * @param pay the annual pay of the employee
	 */
	public Employees(String name, double pay)		{
		setName(name);
		this.pay=pay;
	}


	/**
	 * Calculates the bi-weekly payment
	 * @param workedHours 
	 * @return calculated bi-weekly payment
	 */
	public double biWeeklyPay(int workedHours)	{
		return (getPay()/52)*2;
	}
	
	/**
	 * Setter for pay
	 * @return void
	 */
	public void setPay(double pay) {
		this.pay=pay;
	}
	
	/**
	 * Getter for pay
	 * @return pay - the annual pay of the employee
	 */
	public double getPay() {
		return this.pay;
	}

}