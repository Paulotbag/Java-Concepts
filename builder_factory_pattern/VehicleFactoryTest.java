import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleFactoryTest {
    @Test
    public void testCreateCar() {
        Vehicle car = VehicleFactory.createVehicle("car");
        assertTrue(car instanceof Car);
    }

    @Test
    public void testCreateMotorcycle() {
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        assertTrue(motorcycle instanceof Motorcycle);
    }

    @Test
    public void testUnknownVehicleType() {
        assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle("truck");
        });
    }
}
