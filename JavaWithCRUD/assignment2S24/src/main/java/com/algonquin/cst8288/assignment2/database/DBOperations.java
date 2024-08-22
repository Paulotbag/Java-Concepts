package com.algonquin.cst8288.assignment2.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import com.algonquin.cst8288.assignment2.logger.LogLevel;

/**
 * This class provides tools to make the CRUD operation in our database. It also
 * uses PreparedStatement for better security.
 */
public class DBOperations {
	private static final LMSLogger logger = LMSLogger.getInstance();
	private static Connection conn = DBConnection.getInstance().getConnection();

	/**
	 * This class helps create an event in the database through INSERT statement. If
	 * an error or something wrong happens during its execution, it will close the
	 * connection and throw one of the LogLevels information. So, the user just
	 * have to pay attention to the terminal if something wrong happens.
	 * 
	 * @param event
	 */
	public static void createEvent(Event event) {
		String sql = "INSERT INTO events (event_name, event_description, event_activities, admission_fees) VALUES (?, ?, ?, ?)";
		try (
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, event.getEventName());
			pstmt.setString(2, event.getEventDescription());
			pstmt.setString(3, event.getEventActivities());
			pstmt.setDouble(4, event.getAdmissionFees());
			pstmt.executeUpdate();
			logger.log(LogLevel.INFO, "Event created: " + event.getEventName());
		} catch (SQLException e) {
			logger.log(LogLevel.ERROR, "Error creating event: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * This class helps retrieve an event from the database through SELECT
	 * statement. If
	 * an error or something wrong happens during its execution, it will close the
	 * connection and throw one of the LogLevels information. So, the user just
	 * have to pay attention to the terminal if something wrong happens.
	 * 
	 * @param eventId
	 * @param event
	 * @return Event
	 */
	public static Event retrieveEvent(int eventId, Event event) {
		String sql = "SELECT * FROM events WHERE event_id = ?";
		try (
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, eventId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				populateEventFromResultSet(rs, event);
				logger.log(LogLevel.INFO, "Event retrieved: " + eventId);
			}
		} catch (SQLException e) {
			logger.log(LogLevel.ERROR, "Error retrieving event: " + e.getMessage());
			e.printStackTrace();
		}
		return event;
	}

	/**
	 * This class helps update an event in the database through UPDATE statement. If
	 * an error or something wrong happens during its execution, it will close the
	 * connection and throw one of the LogLevels information. So, the user just
	 * have to pay attention to the terminal if something wrong happens.
	 * 
	 * @param event
	 */
	public static void updateEvent(Event event) {

		String sql = "UPDATE events SET event_name = ?, event_description = ?, event_activities = ?, admission_fees = ? WHERE event_id = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, event.getEventName());
			pstmt.setString(2, event.getEventDescription());
			pstmt.setString(3, event.getEventActivities());
			pstmt.setDouble(4, event.getAdmissionFees());
			pstmt.setInt(5, event.getEventId());
			pstmt.executeUpdate();
			logger.log(LogLevel.INFO, "Event updated: " + event.getEventName());

		} catch (SQLException e) {
			logger.log(LogLevel.ERROR, "Error updating event: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * This class helps delete an event in the database through DELETE statement. If
	 * an error or something wrong happens during its execution, it will close the
	 * connection and throw one of the LogLevels information. So, the user just
	 * have to pay attention to the terminal if something wrong happens.
	 * 
	 * @param eventId
	 */
	public static void deleteEvent(int eventId) {
		String sql = "DELETE FROM events WHERE event_id = ?";
		try (
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, eventId);
			pstmt.executeUpdate();
			logger.log(LogLevel.INFO, "Event deleted: " + eventId);

		} catch (SQLException e) {
			logger.log(LogLevel.ERROR, "Error deleting event: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Method to create an Event from a ResultSet.
	 * 
	 * @param rs
	 * @param event
	 * @throws SQLException
	 */
	private static void populateEventFromResultSet(ResultSet rs, Event event) throws SQLException {

		event.setEventId(rs.getInt("event_id"));
		event.setEventName(rs.getString("event_name"));
		event.setEventDescription(rs.getString("event_description"));
		event.setEventActivities(rs.getString("event_activities"));
		event.setAdmissionFees(rs.getDouble("admission_fees"));

	}
}
