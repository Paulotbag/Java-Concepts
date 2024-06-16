import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algonquin.cst8288.assignment2.event.ConcreteAcademicEvent;
import com.algonquin.cst8288.assignment2.event.ConcretePublicEvent;

/**
 * This class is used to test the calculateAdmissionFee method that are
 * implemented in the concrete Event classes
 * like the Academic and Public.
 */
public class AdmissionFeeTest {
    @Test
    public void testingCalculateAdmissionFee_ConcreteAcademicEvent() {
        ConcreteAcademicEvent event = new ConcreteAcademicEvent();
        event.setEventName("WORKSHOP");
        event.calculateAdmissionFee();
        assertEquals(15.0, event.getAdmissionFees(), 0.0); // Constants.WORKSHOP_DURATION = 1.5 and
                                                           // Constants.WORKSHOP_RATE = 10
    }

    @Test
    public void testingCalculateAdmissionFee_ConcretePublicEvent() {
        ConcretePublicEvent event = new ConcretePublicEvent();
        event.setEventName("KIDS_STORY");
        event.calculateAdmissionFee();
        assertEquals(3.0, event.getAdmissionFees(), 0.0); // Constants.KIDS_STORYTIME_DURATION = 1 and
                                                          // Constants.KIDS_STORYTIME_RATE = 3
    }
}
