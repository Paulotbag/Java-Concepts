package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * 
 * ContractEmployee interface
 * 
 */

public interface ContractEmployee extends EmployeeService {

	public Date renewalDate(Employee employee);
	// f. Renewal date is only applicable for Contract Employees and is calculated 1
	// year from today.

}
