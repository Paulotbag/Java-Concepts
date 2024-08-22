import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.algonquin.cst8288.assignment2.database.DBConnection;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;

/**
 * The following class is responsable for testing the singularity of the
 * instances of the classes DBConnection and LMSLogger. This shows inte
 * importance of taking care and caution of when using these instance to not
 * cause unexpected behavior like unexpected closing of the connection with the
 * database.
 */
public class TestingSingleton {

    @Test
    public void testingDBConnectionSingleton() {
        DBConnection instance1 = DBConnection.getInstance();
        DBConnection instance2 = DBConnection.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testingLMSLoggerSingleton() {
        LMSLogger instance1 = LMSLogger.getInstance();
        LMSLogger instance2 = LMSLogger.getInstance();
        assertSame(instance1, instance2);
    }
}
