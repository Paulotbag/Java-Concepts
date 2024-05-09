
package polymorphism;

/**
 * This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
*/
/*	
 */
	public class Consultants extends Millers{
		private double wage;
/**
 * A constructor for an hourly paid consultant with a given name and biweekly wage.
 * @param name - the name of this consultant
 * @param wage - the consultant wage per hour 
 */
		public Consultants(String name, double wage){
			setName(name);
			this.wage=wage;
		}

	/**
		 * Calculates the bi-weekly payment
		 * @param workedHours
		 * @return calculated bi-weekly payment
		 */
		
	public double biWeeklyPay(int hoursWorked)	{
		double pay;
		if(hoursWorked>76) {
			pay = (hoursWorked*getWage()) + ((hoursWorked-76)*getWage()*0.5); //this is for the overworked/overtime hours. His extra hours value 50% more.
		}
		else {
			pay = getWage() * hoursWorked;
		}
      return pay;
	}
	
	/**
	 * Getter for wage
	 * @return wage - the consultant wage per hour
	 */
	public double getWage() {
		return this.wage;
	}
	
}
