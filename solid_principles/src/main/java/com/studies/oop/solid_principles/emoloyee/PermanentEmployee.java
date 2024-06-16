package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * 
 * PermanentEmployee interface
 * 
 */
public interface PermanentEmployee extends EmployeeService {
    public double pensionContribution(Employee employee);

    // c. Bonus and Pension are ONLY relevant for Permanent Employees.
    // e. Pension contribution is 1% of base salary.
    public double calculateBonus(Employee employee);

    // c. Bonus and Pension are ONLY relevant for Permanent Employees.
    // d. Bonus is 2.5% of base salary and calculated multiplying by the years of
    // service.
}
