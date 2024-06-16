package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar; //I imported this class to calculate the renewalDate for 1 year ahead.
import java.util.Date;

import com.algonquin.cst8288.assignment1.controller.Rate;

public class ContractEmployeeImpl implements ContractEmployee {

    // This constructor inherits the variables from the Employee class.
    public ContractEmployeeImpl() {
    }

    // Contract Employees should get their compensation based on salary and bonus.
    // Due the fact that ContractEmployee does not have bonus, the following will be
    // my approach: the compensation will be 1.5% of base salary * years of service
    // (after 3 years, the compensation will not increase with the number of
    // years of service anymore) > I will add 1.5% Contract Rate in the Rate class.
    @Override
    public double calculateTotalCompensation(Employee employee) {
        if (employee.getNumberOfServiceYear() > 0) {
            return employee.getSalary() * employee.getNumberOfServiceYear() * Rate.CONTRACT_PERCENTAGE;
        } else if (employee.getNumberOfServiceYear() > 3) {
            return employee.getSalary() * 3 * Rate.CONTRACT_PERCENTAGE;
        } else {
            return 0.0;
        }

    }

    // This method was a bit confusing to me because Employee class already has
    // getRenewalDate.
    // So, I made this method to calculate the new renewalDate based on the
    // previous
    // renewalDate.
    @Override
    public Date renewalDate(Employee employee) {
        // f. Renewal date is only applicable for Contract Employees and is calculated 1
        // year from today.
        if (employee.getRenewalDate() == null) {
            // Setting the renewalDate to the current date if not set yet.
            employee.setRenewalDate(new Date());
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(employee.getRenewalDate());
        calendar.add(Calendar.YEAR, 1);
        employee.setRenewalDate(calendar.getTime());
        return employee.getRenewalDate();

    }
}
