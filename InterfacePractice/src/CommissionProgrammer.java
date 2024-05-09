/**
 * 
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */

//CommissionProgrammer.java

//CommissionProgrammer class extends Programmer.

public class CommissionProgrammer extends Programmer { 

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage


/**
 * Constructor for CommissionProgrammer
 * @param firstName
 * @param lastName
 * @param socialSecurityNumber
 * @param grossSales
 * @param commissionRate
 */
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, 
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/**
 * Set gross sales amount on the creation of apps
 * @param double grossSales
 */
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

/**
 * Getter for GrossSales
 * @return - double
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * Setter for commissionRate
 * @param double commissionRate
 */
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/**
 * Getter for CommissionRate
 * @return double 
 */
public double getCommissionRate() {
return commissionRate;
} 

//calculate earnings; override abstract method earnings in Programmer.

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * You just need small changes. Just make sure the toString matches what is required.
 * The method bellow had the previous named change to getPaymentAmount to match the one from its superclass.
 * Calculates the programmer salary
 * @return - double 
 */
@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             


/**
 * @return - String representation of CommissionProgrammer object
 */
@Override      
public String toString() {
	return String.format("commission programmer: %s %s\nsocial security number: %s\ngross sales: $%.2f; commission rate: %.2f\npayment due: $%.2f\n", getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getPaymentAmount());
}

}

