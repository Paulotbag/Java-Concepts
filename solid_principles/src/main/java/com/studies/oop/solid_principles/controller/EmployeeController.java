/**
 * Assignment 1 OOP
 * Student Name: Paulo Ricardo Gomes Granjeiro
 * Student ID: 041118057
 * Student email: gome0154@algonquinlive.com
 * Due Date: 06/20/2024
 * Professor Name: Gustavo
 */

/**
 * EmployeeController - The controller class responsible for processing employee data.
*/

package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

/**
 * This class does 2 things:
 * Validate and save employee data.
 * 
 * 
 */
public class EmployeeController {

	private PersistenceService persistenceService;

	public EmployeeController(PersistenceService persistenceService) {
		this.persistenceService = persistenceService;
	}

	public void setPersistenceService(PersistenceService persistenceService) {
		this.persistenceService = persistenceService;
	}

	public String processEmployee(Employee employee) throws IOException {

		// Validates Employee object
		if (!DataValidation.isValidEmployee(employee)) {
			System.out.println("FAIL");
			return "PROCESS EMPLOYEE FAILED";
		}

		// Store data

		persistenceService.saveEmployee(employee,
				"\"C:\\Users\\paulo\\OneDrive\\Documents\\College\\Spring_2024\\OOP with DESIGN PARTERNS - CST8288-030\\assignment1\\assignment1S24\\assignment1S24\\log\\json_employee_data.txt\"");

		persistenceService.saveEmployee(employee,
				"\"C:\\Users\\paulo\\OneDrive\\Documents\\College\\Spring_2024\\OOP with DESIGN PARTERNS - CST8288-030\\assignment1\\assignment1S24\\assignment1S24\\log\\text_employee_data.txt\"");
		return "PROCESS EMPLOYEE SUCCESS";
	}

}
