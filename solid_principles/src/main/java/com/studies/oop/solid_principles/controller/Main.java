package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;

import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;

/**
 * 
 * Main class to execute the application
 * 
 */

public class Main {

	public static void main(String[] args) throws IOException {

		// Implement Main.java class to execute your solution:
		// Instantiate two Employee objects
		Employee emp1 = new Employee("Gelep", "gelep1234@algonquinlive.com", "314 Milkway Avenue North",
				3000, 4);
		Employee emp2 = new Employee("Vetinha", "vetinha1234@algonquinlive.com",
				"413 Andromeda Avenue South", 1500, 2);

		// use PermanentEmployeeImpl.java and ContractEmployeeImpl.java
		// to calculate and populate required data for objects.

		PermanentEmployeeImpl permanentEmployee = new PermanentEmployeeImpl();
		ContractEmployeeImpl contractEmployee = new ContractEmployeeImpl();

		// Employee of type permanent has 3 variables to be set.
		emp1.setBonus(0);
		emp1.setTotalCompensation(permanentEmployee.calculateTotalCompensation(emp1));
		emp1.setPensionContribution(permanentEmployee.pensionContribution(emp1));
		// Employee of type contract has 2 variables to be set
		emp2.setTotalCompensation(contractEmployee.calculateTotalCompensation(emp2));
		emp2.setRenewalDate(contractEmployee.renewalDate(emp2));

		// Utilize EmployeeController.java to save both objects in JSON and Text
		// formats,
		// saving the data in files named json_employee_data.txt and
		// text_employee_data.txt.
		JSONFormatter jsonForm = new JSONFormatter();
		TextFormatter textForm = new TextFormatter();

		PersistenceServiceImpl persistent = new PersistenceServiceImpl(jsonForm);
		EmployeeController employeeController = new EmployeeController(persistent);
		employeeController.processEmployee(emp1);
		employeeController.processEmployee(emp2);

		persistent.setFormatter(textForm);
		employeeController.setPersistenceService(persistent);
		employeeController.processEmployee(emp1);
		employeeController.processEmployee(emp2);

		// Do the same thing to output the data to the console instead of saving it to a
		// file. >>Here is not clear if we need to output the data to the console on
		// both format.

		System.out.println(jsonForm.format(emp1));
		System.out.println();
		System.out.println(jsonForm.format(emp2));
		System.out.println();
		System.out.println(textForm.format(emp1));
		System.out.println();
		System.out.println(textForm.format(emp2));
		System.out.println();

	}

}
