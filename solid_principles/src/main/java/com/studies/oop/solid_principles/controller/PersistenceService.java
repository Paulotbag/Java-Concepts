package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;

//interface
public interface PersistenceService {
    void saveEmployee(Employee employee, String filename) throws IOException;
}
