package com.algonquin.cst8288.assignment2.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LMSLogger {

    private static LMSLogger instance = null;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    /**
     * Constructor for LMSLogger. Private constructor to prevent instantiation.
     * Singleton pattern.
     * 
     */
    private LMSLogger() {
    }

    public static LMSLogger getInstance() {
        if (instance == null) {
            synchronized (LMSLogger.class) {
                if (instance == null) {
                    instance = new LMSLogger();
                }
            }
        }
        return instance;
    }

    /**
     * This method provides timestamp and some log message when some error occur
     * during some process execution when connected to the database.
     * 
     * @param level
     * @param message
     */
    public void log(LogLevel level, String message) {
        String timestamp = LocalDateTime.now().format(dtf);
        System.out.println(timestamp + " [" + level.name() + "] " + message);
    }
}
