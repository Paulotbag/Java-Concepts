/**
 * 
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

public abstract class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;

//three-argument constructor
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

public String getFirstName() {
	return this.firstName;
}

public String getLastName() {
	return this.lastName;
}

public String getSocialSecurityNumber() {
	return this.socialSecurityNumber;
}

//return String representation of Programmer object
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
} 


//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....?? 
//Answer: abstract


public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
}  //this last method is abstract. Its implementation is not required here. We can implement in subclasses of Programmer.
