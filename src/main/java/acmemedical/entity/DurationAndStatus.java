/********************************************************************************************************
 * File:  DurationAndStatus.java Course Materials CST 8277
 *
 * @author Teddy Yap
 * @implemented by Azadeh Sadeghtehrani
 * 
 */
package acmemedical.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DurationAndStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Basic
	@Column(name = "start_date", nullable = false)
	private LocalDateTime startDate;

	@Basic
	@Column(name = "end_date", nullable = true)
	private LocalDateTime endDate;

	@Basic
	@Column(name = "active", nullable = false)
	private byte active;

	/**
	 * Defaul Constructor
	 */
	public DurationAndStatus() {
	}

	/**
	 *
	 * @return LocalDateTime
	 */
	public LocalDateTime getStartDate() {
		return startDate;
	}

	/**
	 *
	 * @param startDate
	 */
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 *
	 * @return LocalDateTime
	 */
	public LocalDateTime getEndDate() {
		return endDate;
	}

	/**
	 *
	 * @param endDate
	 */
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	/**
	 *
	 * @param startDate
	 * @param endDate
	 * @param active
	 */
	public void setDurationAndStatus(LocalDateTime startDate, LocalDateTime endDate, String active) {
		setStartDate(startDate);
		setEndDate(endDate);
		byte p = 0b1;
		byte n = 0b0;
		setActive(("+".equals(active) ? p : n));
	}

	/**
	 *
	 * @return byte
	 */
	public byte getActive() {
		return active;
	}

	/**
	 *
	 * @param active
	 */
	public void setActive(byte active) {
		this.active = active;
	}

	/**
	 * Very important:  Use getter's for member variables because JPA sometimes needs to intercept those calls<br/>
	 * and go to the database to retrieve the value
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		// Only include member variables that really contribute to an object's identity
		// i.e. if variables like version/updated/name/etc. change throughout an object's lifecycle,
		// they shouldn't be part of the hashCode calculation
		return prime * result + Objects.hash(getStartDate(), getEndDate(), getActive());
	}

	/**
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (obj instanceof DurationAndStatus otherDurationAndStatus) {
			// See comment (above) in hashCode():  Compare using only member variables that are
			// truly part of an object's identity
			return Objects.equals(this.getStartDate(), otherDurationAndStatus.getStartDate()) &&
					Objects.equals(this.getEndDate(), otherDurationAndStatus.getEndDate()) &&
					Objects.equals(this.getActive(), otherDurationAndStatus.getActive());
		}
		return false;
	}

}