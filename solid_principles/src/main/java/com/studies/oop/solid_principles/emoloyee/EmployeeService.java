package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * 
 * EmployeeService interface refactored to follow ISP
 * 
 */
public interface EmployeeService {
    public double calculateTotalCompensation(Employee employee);

    // b. Total compensation is calculated as salary + bonus.

}
