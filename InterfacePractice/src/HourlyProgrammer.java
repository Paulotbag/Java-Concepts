/**
 * 
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */
// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.

public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

/**
 * Constructor for HourlyProgrammer
 * @param firstName
 * @param lastName
 * @param socialSecurityNumber
 * @param wage
 * @param hours
 */
public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/**
 * Setter for wage
 * @param wage
 */
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/**
 * getter for wage
 * @return - double
 */
public double getWage() {
return wage;
} 

/**
 * setter for hours
 * @param hours
 */
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/**
 * getter for hours
 * @return double
 */
public double getHours() {
return hours;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
/**
 * This is a method that calculates the programmer salary
 * Answer: we have to change the name of the method to getPaymentAmount because it implements the abstract method
 *present in the interface Payme. The reason for this is because it is a subclass of Programmer, which also has the abstract method getPaymentAmount.
 *@return - double
 */
@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                      //with overtime                                       
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

/**
 * @return - String representation of HourlyProgrammer object              
 */
@Override       
public String toString() {
	return String.format("commission programmer: %s %s\nsocial security number: %s\ngross sales: $%.2f; hours worked: %.2f\npayment due: $%.2f\n", getFirstName(), getLastName(), getSocialSecurityNumber(), getWage(), getHours(), getPaymentAmount());
}

                     
}

