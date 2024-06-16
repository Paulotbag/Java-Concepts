/**
 * @author Paulo Ricardo Gomes Granjeiro
 * @version java 21.0.1 2023-10-17 LTS
 * Date: 2024/06/16
 * Activity: Object Oriented Programming Design Patterns - JDBC and Factory pattern
 */
package com.algonquin.cst8288.assignment2.client;

import com.algonquin.cst8288.assignment2.event.ConcreteAcademicEvent;
import com.algonquin.cst8288.assignment2.event.ConcretePublicEvent;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.handler.InteractionHandler;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import com.algonquin.cst8288.assignment2.logger.LogLevel;

import java.util.Scanner;

public class Client {
    private static final LMSLogger logger = LMSLogger.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Library Management System");
            System.out.println("1. Create Event");
            System.out.println("2. Retrieve Event");
            System.out.println("3. Update Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // creating a new event in the databse
                    System.out.print("Enter Library Type (Public/Academic): ");
                    String libraryType1 = scanner.nextLine().trim();
                    InteractionHandler handler1 = new InteractionHandler(libraryType1);

                    Event event1 = libraryType1.equalsIgnoreCase("Public") ? new ConcretePublicEvent()
                            : new ConcreteAcademicEvent();

                    System.out.print("Enter Event Name: ");
                    event1.setEventName(scanner.nextLine());
                    System.out.print("Enter Event Description: ");
                    event1.setEventDescription(scanner.nextLine());
                    System.out.print("Enter Event Activities: ");
                    event1.setEventActivities(scanner.nextLine());

                    event1.calculateAdmissionFee();
                    handler1.createEventInDB(event1);

                    logger.log(LogLevel.INFO, "Created event: " + event1.getEventName());
                    break;
                case 2: // retrieve event informations from the database
                    System.out.print("Enter Library Type (Public/Academic): ");
                    String libraryType2 = scanner.nextLine().trim();
                    InteractionHandler handler2 = new InteractionHandler(libraryType2);

                    System.out.print("Enter Event ID to Retrieve: ");
                    int eventId2 = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Event event2 = new ConcretePublicEvent(); // using a default event type just to have access to the
                                                              // db to retrieve data
                    event2 = handler2.retrieveEventFromDB(eventId2, event2);

                    if (event2 != null) {
                        System.out.println("Event Retrieved: ");
                        System.out.println("Name: " + event2.getEventName());
                        System.out.println("Description: " + event2.getEventDescription());
                        System.out.println("Activities: " + event2.getEventActivities());
                        System.out.println("Admission Fees: " + event2.getAdmissionFees());
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;
                case 3:// updates event in the database
                    System.out.print("Enter Library Type (Public/Academic): ");
                    String libraryType3 = scanner.nextLine().trim();
                    InteractionHandler handler3 = new InteractionHandler(libraryType3);

                    Event event3 = libraryType3.equalsIgnoreCase("Public") ? new ConcretePublicEvent()
                            : new ConcreteAcademicEvent();

                    System.out.print("Enter Event ID to Update: ");
                    int eventId3 = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Retrieve the event from the database

                    event3 = handler3.retrieveEventFromDB(eventId3, event3); // Retrieve event directly from
                                                                             // DBOperations

                    if (event3 == null) {
                        System.out.println("Event not found.");
                        return;
                    }

                    System.out.print("Enter New Event Name: ");
                    event3.setEventName(scanner.nextLine());
                    System.out.print("Enter New Event Description: ");
                    event3.setEventDescription(scanner.nextLine());
                    System.out.print("Enter New Event Activities: ");
                    event3.setEventActivities(scanner.nextLine());

                    event3.calculateAdmissionFee();
                    handler3.updateEventInDB(event3);

                    logger.log(LogLevel.INFO, "Updated event: " + event3.getEventName());
                    break;
                case 4:
                    System.out.print("Enter Library Type (Public/Academic): ");
                    String libraryType4 = scanner.nextLine().trim();
                    InteractionHandler handler4 = new InteractionHandler(libraryType4);
                    System.out.print("Enter Event ID to Delete: ");
                    int eventId4 = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    handler4.deleteEventFromDB(eventId4);

                    logger.log(LogLevel.INFO, "Deleted event ID: " + eventId4);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }

        scanner.close();
    }

}