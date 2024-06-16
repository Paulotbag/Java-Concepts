package com.algonquin.cst8288.scanner;

import java.util.Scanner;

//This class follows Singleton principle
public class Scan {
    private static Scan sc; // this is the instance of this class
    private Scanner scanner; // this one is actually the scanner

    private Scan() {
        this.scanner = new Scanner(System.in);
    }

    public static Scan getInstance() {
        if (sc == null) {
            // Create the instance if it does not exist
            sc = new Scan();
        }
        return sc;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void closeScanner() {
        this.scanner.close();
    }
}
