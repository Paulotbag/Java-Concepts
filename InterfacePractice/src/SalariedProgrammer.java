/**
 * 
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */


//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

public class SalariedProgrammer extends Programmer  {
private double weeklySalary;

/**
 * Constructor for SalariedProgrammer
 * @param firstName
 * @param lastName
 * @param socialSecurityNumber
 * @param weeklySalary
 */
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, 
double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * setter for weekly salary
 * @param weeklySalary
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * Getter for weeklySalary
 * @return - double
 */
public double getWeeklySalary() {
return weeklySalary;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * There is not much to change here. Basically just changed the previous one to the one that matches the abstract method
 * in the superclass
 * @return - double
 * @see - Programmer
 */
@Override                                                           
public double getPaymentAmount() {                                          
return getWeeklySalary();                                        
}                                             

/**
 * @return - String representation of SalariedProgrammer object   
 */
@Override        
public String toString() {
	return String.format("commission programmer: %s %s\nsocial security number: %s\nweekly salary: $%.2f\npayment due: $%.2f\n", getFirstName(), getLastName(), getSocialSecurityNumber(), getWeeklySalary(), getPaymentAmount());
}
}

