package testMyHealthCareSystem;

import myHealthCareSystem.*;

/**
 * This is a simple test demo class for the health care system.
 */
/**
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */

public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

		/*
		 * This class uses System.out.printf, formatted prints to show all health
		 * data as found in the EMRecord class (includes the parent class EMHRecord). 
		 * It does not miss any item (including any attributes which are complex objects, name, address etc.
		 *
		 *		Use the following standards guide to discover what field entries might look like for demo purposes.
		 *
		 * 		Field values and constraints can be found in the Standards guide
		 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 *
		 */
		


		//THIS CLASS INSTANTIATE AT LEAST ONE EMRecord object and provide formatted output of all data elements
		//in the class EMRecord (including EMHRecord)

			
		/*INSTANTIATING EVERYTHING RELATED TO EMRecord and EMHRecord*/	
		EMRecord emr = new EMRecord("ON", "5", "3", "8");
		/*--------------------attributes from EMHRecord---------------------------*/
		emr.setFunctionalCentreAccount("7*4153000");
		emr.setEncounterSequence(111);
		emr.setIssuingProvince("ON");
		emr.setResidenceCode("ON");
		emr.setGender("M");
		emr.setSubmissionYear(1990);
		emr.setAdminViaAmbulance("A");
		emr.setRegistrationDate(19901210);
		emr.setRegistrationTime(1430);
		emr.setBirthDate((new BirthDate(1980, 8, 15)));
		emr.getFunctionalCentreAccount(); 
		emr.getEncounterSequence();
		emr.getIssuingProvince();
		emr.getResidenceCode();
		emr.getGender();
		emr.getSubmissionYear();
		emr.getAdminViaAmbulance();
		emr.getRegistrationDate();
		emr.getRegistrationTime();
		emr.getBirthDate();
		/*--------------------attributes from EMRecord---------------------------*/
		emr.setName((new Name("Paulo", "Granjeiro", "Ricardo")));
		emr.setAddress((new Address("Woodroffe Avenue", "1315", "Ottawa", "E2E 3W1")));
		emr.setHeight(72); 
		emr.setWeight(176);
		
		/*This multidimensional array helps format the output for values related to EMHRecord*/
		String[][] emhrInformations = { 
				{"Functional Centre Account = ", emr.getFunctionalCentreAccount()}, 
				{"Encounter Sequence = ", Integer.toString(emr.getEncounterSequence())}, 
				{"Issuing Province = ", emr.getIssuingProvince()}, 
				{"Residence Code = ", emr.getResidenceCode()},
				{"Gender = ", emr.getGender()}, 
				{"Submission Year = ", Integer.toString(emr.getSubmissionYear())}, 
				{"Admin Via Ambulance = ", emr.getAdminViaAmbulance()}, 
				{"Registration Date = ", Integer.toString(emr.getRegistrationDate())}, 
				{"Registration Time = ", Integer.toString(emr.getRegistrationTime())},
				{"Birth Date = ", emr.formattedBirthDate()}
										};

		/*PRINTING EVERYTHING RELATED TO EMHRecord*/
		System.out.printf("[EMHRecord informations]%n");
		for (int z=0; z<emhrInformations.length; z++) {
			for (int w = 0; w<2; w++) {
				System.out.printf("%s", emhrInformations[z][w]);
			}
			System.out.printf("%n");
		}
		
			
		/*PRINTING EVERYTHING RELATED TO EMRecord*/
		System.out.printf("%n%n");
		System.out.printf("[EMRecord Informations]\n");
		System.out.println(emr);
		System.out.println("Address: " + emr.formattedAddress());
		System.out.println("Name: " + emr.formattedName());
		System.out.printf("Health Data: Height = %d, Weight = %d %n", emr.getHeight(), emr.getWeight());
		System.out.println("Patient BMI = " + emr.bmi() + "\n");
		
		
		/*PRINTING BMI REFERENCE VALUES*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

	
}
