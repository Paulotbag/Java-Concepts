package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;
import com.algonquin.library.LibraryInterface;
import com.algonquin.library.PublicLibrary;

/**
 * Class responsable for providing a concrete implementation of the abstract
 * class Event.
 */
public class ConcretePublicEvent extends Event {

    /**
     * 
     * constructor of ConcretePublicEvent.
     */
    public ConcretePublicEvent() {
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
            case "KIDS_STORY":
                this.admissionFees = Constants.KIDS_STORYTIME_DURATION * Constants.KIDS_STORYTIME_RATE;
                break;
            case "MOVIE_NIGHT":
                this.admissionFees = Constants.MOVIE_NIGHT_DURATION * Constants.MOVIE_NIGHT_RATE;
                break;
            default:
                throw new IllegalArgumentException("Unknown event or event type unavailable for the provided library.");
        }
    }

    /**
     * @return LibraryInterface - an instance of LibraryInterface
     */
    @Override
    public LibraryInterface makeLibrary() {
        return new PublicLibrary();
    }

}
