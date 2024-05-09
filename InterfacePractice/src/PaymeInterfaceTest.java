/**
 * 
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */

//This is the test for your interface Payme.

public class PaymeInterfaceTest  {

public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
 //START CODE 
	Payme[] pay1= new Payme[6];
//END CODE
 

// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE
	pay1[0]= new Invoice ("22776", "brakes", 3, 300.00);
	pay1[1]= new Invoice ("33442", "gear", 5, 90.99);
	pay1[2]= new SalariedProgrammer ("Chioma", "Chidimma", "345-67-0001", 320.00);
	pay1[3]= new HourlyProgrammer ("Amara", "Chukwu", "234-56-7770", 18.95, 40.00);
	pay1[4]= new CommissionProgrammer ("Peter", "Goodman", "123-45-6999", 16500.00, 0.44);
	pay1[5]= new BasePlusCommissionProgrammer ("Esther", "Patel", "102-34-5888", 1200.00, 0.04, 720.00);
// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : pay1) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.05 * oldBaseSalary);
       System.out.printf(
          "new base salary with 5%% increase is: $%.2f\n"
          + "payment due: $%.2f",
          programmer.getBaseSalary(), programmer.getPaymentAmount());
    } 

 }
}
}


