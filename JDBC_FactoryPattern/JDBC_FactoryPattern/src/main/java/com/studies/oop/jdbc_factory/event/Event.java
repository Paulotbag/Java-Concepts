package com.algonquin.cst8288.assignment2.event;

import com.algonquin.library.LibraryInterface;

/**
 * This is an abstract class used to help on the creation of concrete subclasses
 * of Event.
 */
public abstract class Event {

	protected String eventName;
	protected String eventDescription;
	protected String eventActivities;
	protected double admissionFees;
	protected int eventId;

	/**
	 * 
	 * @return eventId
	 */
	public int getEventId() {
		return eventId;
	}

	/**
	 * 
	 * @param int eventId
	 * @return eventId
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return String - the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param String - eventName the eventName to set
	 * @return void
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return String - the eventDescription
	 */
	public String getEventDescription() {
		return eventDescription;
	}

	/**
	 * @param String - eventDescription the eventDescription to set
	 * @return void
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	/**
	 * @return String - the eventActivities
	 */
	public String getEventActivities() {
		return eventActivities;
	}

	/**
	 * @param String - eventActivities the eventActivities to set
	 * @return void
	 */
	public void setEventActivities(String eventActivities) {
		this.eventActivities = eventActivities;
	}

	/**
	 * @return double - the admissionFees
	 */
	public double getAdmissionFees() {
		return admissionFees;
	}

	/**
	 * @param double - admissionFees the admissionFees to set
	 * @return void
	 */
	public void setAdmissionFees(double admissionFees) {
		this.admissionFees = admissionFees;
	}

	// Every library has its own admission fee
	public abstract void calculateAdmissionFee();

	// Every concrete subclass of Event should return a concrete object that comes
	// from LibraryInterface.
	public abstract LibraryInterface makeLibrary();

}
