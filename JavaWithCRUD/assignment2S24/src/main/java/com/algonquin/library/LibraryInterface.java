package com.algonquin.library;

import java.util.ArrayList;
import com.algonquin.cst8288.assignment2.event.EventType;

/**
 * This is an interface for the libraries. The libraries are responsable for
 * providing their available events.
 */
public interface LibraryInterface {
    ArrayList<EventType> provideEventType();
}
