package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;
import com.algonquin.library.AcademicLibrary;
import com.algonquin.library.LibraryInterface;

/**
 * This class is an implementation of the abstract class Event.
 */
public class ConcreteAcademicEvent extends Event {

    /**
     * constructor for ConcreteAcademicEvent.
     */
    public ConcreteAcademicEvent() {
        super();
    }

    /**
     * 
     * @return void
     */
    @Override
    public void calculateAdmissionFee() {
        String eventType = eventName.toUpperCase().trim();
        switch (eventType) {
            case "WORKSHOP":
                this.admissionFees = Constants.WORKSHOP_DURATION * Constants.WORKSHOP_RATE;
                break;
            case "BOOK_LAUNCH":
                this.admissionFees = 0.0;
                break;
            default:
                throw new IllegalArgumentException("Unknown event or event type unavailable for the provided library.");
        }
    }

    /**
     * @return LibraryInterface - return an instance of LibraryInterface
     */
    @Override
    public LibraryInterface makeLibrary() {
        return new AcademicLibrary();
    }
}
