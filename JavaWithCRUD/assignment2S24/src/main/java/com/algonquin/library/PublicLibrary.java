package com.algonquin.library;

import java.util.ArrayList;
import com.algonquin.cst8288.assignment2.event.EventType;

/**
 * This class is a concrete implementation of LibraryInterface. It is
 * responsable for providing the event types available for Public libraries.
 */
public class PublicLibrary implements LibraryInterface {

    private ArrayList<EventType> libraryEvents;

    /**
     * @return ArrayList<EventType> - libraryEvents
     */
    @Override
    public ArrayList<EventType> provideEventType() {
        if (this.libraryEvents == null) {
            this.libraryEvents = new ArrayList<>();
        }

        if (this.libraryEvents.isEmpty()) {
            for (EventType eventType : EventType.values()) {
                if (eventType == EventType.KIDS_STORY || eventType == EventType.MOVIE_NIGHT) {
                    this.libraryEvents.add(eventType);
                }
            }
        }
        return this.libraryEvents;
    }
}
