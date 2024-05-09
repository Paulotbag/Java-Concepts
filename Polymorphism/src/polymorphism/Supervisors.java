
package polymorphism;

/**
This code contains Supervisor class declaration, constructor and method. 
A Supervisor is an employee who also receives a bonus. 
It implements the bi-weekly pay for the employee according to instructions provided.
*/
	public class Supervisors extends Employees{
		private double bonus;

/**
 * Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
 * @param name the name of this employee
 * @param pay the annual pay
 * @param bonus the bi-weekly bonus
 */
	public Supervisors(String name, double pay, double bonus){
		super(name, pay);
		this.bonus=bonus;
	}

	/**
	 * Calculates the bi-weekly payment
	 * @param workedHours
	 * @return calculated bi-weekly payment
	 */
	public double biWeeklyPay(int workedHours)	{
		double pay = (getPay()/52)*2 + getBonus();
		return pay;
	}
	
	/**
	 * Getter for bonus
	 * @return bonus - the bonus that supervisors receive.
	 */
	public double getBonus() {
		return this.bonus;
	}
	
}
