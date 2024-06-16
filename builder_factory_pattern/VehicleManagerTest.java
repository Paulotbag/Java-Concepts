
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleManagerTest {
    @Test
    public void testSingleton() {
        VehicleManager manager1 = VehicleManager.getVehicleManager();
        VehicleManager manager2 = VehicleManager.getVehicleManager();
        assertSame(manager1, manager2);
    }

    @Test
    public void testAddAndGetVehicle() {
        VehicleManager manager = VehicleManager.getVehicleManager();
        Car car = new Car();
        manager.addVehicle(car);
        assertEquals(1, manager.getVehicleList().size());
        assertSame(car, manager.getSingleVehicle(0));
    }
}
