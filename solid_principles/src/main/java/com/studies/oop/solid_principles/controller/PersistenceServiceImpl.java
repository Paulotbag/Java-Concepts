package com.algonquin.cst8288.assignment1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;

public class PersistenceServiceImpl implements PersistenceService {

    private Formatter formatter;

    public PersistenceServiceImpl(Formatter formatter) {
        this.formatter = formatter;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public Formatter getFormatter() {
        return formatter;
    }

    @Override
    public void saveEmployee(Employee employee, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(formatter.format(employee));
            writer.flush();
        }
    }
}
