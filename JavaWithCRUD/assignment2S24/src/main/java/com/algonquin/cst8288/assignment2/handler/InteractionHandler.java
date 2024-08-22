package com.algonquin.cst8288.assignment2.handler;

import com.algonquin.cst8288.assignment2.database.DBOperations;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.library.ConcreteAcLibFactor;
import com.algonquin.library.ConcretePubLibFactor;
import com.algonquin.library.LibraryFactoryInterface;
import com.algonquin.library.LibraryInterface;

/**
 * This class is responsable for handling some interactions between the client
 * and the database.
 */
public class InteractionHandler {
    private LibraryFactoryInterface factory;

    /**
     * 
     * @param libraryType
     */
    public InteractionHandler(String libraryType) {
        if (libraryType.equalsIgnoreCase("Academic")) {
            factory = new ConcreteAcLibFactor();
        } else if (libraryType.equalsIgnoreCase("Public")) {
            factory = new ConcretePubLibFactor();
        } else {
            throw new IllegalArgumentException("Unknown library type");
        }
    }

    /**
     * 
     * @return LibraryInterface
     */
    public LibraryInterface createLibrary() {
        return factory.createLibrary();
    }

    /**
     * 
     * @param event
     */
    public void createEventInDB(Event event) {
        DBOperations.createEvent(event);
    }

    /**
     * 
     * @param eventId
     * @param event
     * @return
     */
    public Event retrieveEventFromDB(int eventId, Event event) {
        return DBOperations.retrieveEvent(eventId, event);
    }

    /**
     * 
     * @param event
     */
    public void updateEventInDB(Event event) {
        DBOperations.updateEvent(event);
    }

    /**
     * 
     * @param eventId
     */
    public void deleteEventFromDB(int eventId) {
        DBOperations.deleteEvent(eventId);
    }

    /**
     * 
     * @param event
     * @return
     */
    public LibraryInterface createLibraryFromEvent(Event event) {
        return event.makeLibrary();
    }
}
