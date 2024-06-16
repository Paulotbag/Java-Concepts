package com.algonquin.cst8288.assignment2.logger;

/**
 * This class enum some LogLevel. It helps identify some errors that can
 * possibly happen during the execution of the methods from the DBOperations.
 */
public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(3),
    WARN(4),
    ERROR(5);

    final int level;

    /**
     * 
     * @param level
     */
    LogLevel(int level) {
        this.level = level;
    }
}
