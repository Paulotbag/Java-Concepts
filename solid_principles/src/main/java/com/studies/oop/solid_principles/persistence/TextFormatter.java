package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

public class TextFormatter implements Formatter {

  public String format(Employee employee) throws IOException {
    return "Employee [name=" + employee.getName()
        + ", email=" + employee.getEmail()
        + ", address=" + employee.getAddress()
        + ", salary=" + employee.getSalary()
        + ", numberOfServiceYear=" + employee.getNumberOfServiceYear()
        + ", bonus=" + employee.getBonus()
        + ", totalCompensation=" + employee.getTotalCompensation()
        + ", pensionContribution=" + employee.getPensionContribution()
        + ", renewalDate=" + employee.getRenewalDate() + "]";

  }
}
