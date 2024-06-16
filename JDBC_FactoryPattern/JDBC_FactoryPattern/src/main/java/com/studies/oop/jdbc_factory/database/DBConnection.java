package com.algonquin.cst8288.assignment2.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is responsable for providing tools to connect to your MySQL
 * database.
 * It also follows singleton principle.
 */
public class DBConnection {

	// variables for singleton pattern
	private static DBConnection instance = null;
	private Connection connection = null;

	// credentials for accessing the database. For who uses this code, if you use
	// this same code to connect to MySQL db, just make sure to change the
	// below variables value to access your
	// database. If you try to connect to another rdbms, you will need to change the
	// driveString.

	private final String serverUrl = "jdbc:mysql://localhost:3306/bookvault"; // replace "bookvault" with the
																				// name of another databse in
																				// case you need to connect to
																				// another db.
	private final String userString = "root";
	private final String passwordString = "10032023";
	private final String driverString = "com.mysql.cj.jdbc.Driver";

	/**
	 * This is the constructor for DBConnetion. When initialized, it will create a
	 * connection to your database based on the credentials provided, and will close
	 * if a SQLExecption is thrown.
	 */
	private DBConnection() {
		try {
			Class.forName(driverString);
			this.connection = DriverManager.getConnection(serverUrl, userString, passwordString);
		} catch (ClassNotFoundException | SQLException excep) {
			excep.printStackTrace();
		}
	}

	/**
	 * 
	 * @return DBConnection
	 */
	public static DBConnection getInstance() {
		if (instance == null) {
			synchronized (DBConnection.class) {
				if (instance == null) {
					instance = new DBConnection();
				}
			}
		}
		return instance;
	}

	/**
	 * This method helps return the private connection variable that we create in
	 * this class after instantiating DBConnection.
	 * 
	 * @return Connection
	 */
	public Connection getConnection() {
		return connection;
	}
}
