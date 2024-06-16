package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

public class PermanentEmployeeImpl implements PermanentEmployee {

    public PermanentEmployeeImpl() {
    }

    @Override
    public double calculateTotalCompensation(Employee employee) {
        return employee.getSalary() * (1 + Rate.BONUS_PERCENTAGE * employee.getNumberOfServiceYear());
    }

    // c. Bonus and Pension are ONLY relevant for Permanent Employees.
    // e. Pension contribution is 1% of base salary.
    @Override
    public double pensionContribution(Employee employee) {
        return employee.getSalary() * Rate.PENSION_PERCENTAGE;
    }

    // c. Bonus and Pension are ONLY relevant for Permanent Employees.
    // d. Bonus is 2.5% of base salary and calculated multiplying by the years of
    // service.
    @Override
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * Rate.BONUS_PERCENTAGE * employee.getNumberOfServiceYear();
    }

}
