package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

import com.algonquin.cst8288.scanner.Scan;

import java.util.regex.Pattern;//these 2 classes were imported to ensure that the salary was positive.
import java.util.regex.Matcher;

public class Employee {

	private String name;
	private String email;
	private String address;
	private double salary;
	private int numberOfServiceYear;
	private double bonus;
	private double totalCompensation;
	private double pensionContribution; // I added this attribute just to save info of pensionContribution;
	private Date renewalDate; // Check notes at setRenewalDate down bellow

	// This constructor was empty. So, I will implement as it conveys to me.
	public Employee(String name, String email, String address, double salary, int numberOfServiceYear) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.salary = salary;
		this.numberOfServiceYear = numberOfServiceYear;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	// One of the requirements is to make sure all employees has positive salary.
	// I've found that I could ensure that here. But I don't know if this is the
	// best/propper solution.
	public void setSalary(double salary) {

		if (salary <= 0) {
			while (salary <= 0) {
				System.out.println(
						"One of the requiremente is that all employees must have an " +
								"integer salary greater than 0. Please provide a proper and valid input: ");
				salary = Scan.getInstance().getScanner().nextInt();
				String regex = "^-?\\d+$"; // accepting negative and positive numbers.
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(Double.toString(salary));
				if (matcher.matches() && salary > 0) {
					this.salary = salary;
					Scan.getInstance().closeScanner();
				}
			}

		} else {
			this.salary = salary;
		}
	}

	public int getNumberOfServiceYear() {
		return numberOfServiceYear;
	}

	public void setNumberOfServiceYear(int numberOfServiceYear) {
		this.numberOfServiceYear = numberOfServiceYear;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTotalCompensation() {
		return totalCompensation;
	}

	public void setTotalCompensation(double totalCompensation) {
		this.totalCompensation = totalCompensation;
	}

	public double getPensionContribution() {
		return pensionContribution;
	}

	public void setPensionContribution(double pensionContribution) {
		this.pensionContribution = pensionContribution;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) { // setting the renewalDate only make sense for ContractEmployee.
		this.renewalDate = renewalDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary
				+ ", numberOfServiceYear=" + numberOfServiceYear + ", bonus=" + bonus + ", totalCompensation="
				+ totalCompensation + ", renewalDate=" + renewalDate + "]";
	}

}