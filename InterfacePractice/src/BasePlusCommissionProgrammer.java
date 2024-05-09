
/**
 * 
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week

//constructor
/**
 * Constructor for BasePlusCommissionProgrammer
 * @param firstName
 * @param lastName
 * @param socialSecurityNumber
 * @param grossSales
 * @param commissionRate
 * @param baseSalary
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

/**
 * Set baseSalary variable.
 * @param - double baseSalary
 */
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/**
 * Getter for baseSalary
 * @return - double
 */
//return base salary
public double getBaseSalary() {
return baseSalary;
}

//calculate earnings; override method earnings in CommissionProgrammer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION? 
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * You just need small changes. Just make sure the toString matches what is required.
 * The method bellow had the previous named change to getPaymentAmount to match the one from its superclass.
 * @return - double -> the final salary of the programmer.
 * 
 */
@Override                                                            
public double getPaymentAmount() {                                             
return (getBaseSalary() + super.getPaymentAmount());                        
} 

/**
 * @return - String representation of BasePlusCommissionProgrammer object
 */
@Override     
public String toString() {
	return String.format("commission programmer: %s %s\n"
			+ "social security number: %s\n"
			+ "gross sales: $%.2f; commission rate: %.2f; base salary: $%.2f", getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getBaseSalary());
}


}



