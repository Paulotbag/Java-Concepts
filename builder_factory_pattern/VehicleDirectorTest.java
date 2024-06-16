import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleDirectorTest {
    @Test
    public void testConstructCar() {
        CarBuilder builder = CarBuilder.create();
        VehicleDirector director = new VehicleDirector(builder);
        Vehicle car = director.build();
        assertEquals("Electric engine", car.getEngineType());
        assertEquals(4, car.getNumberOfWheels());
        assertEquals("Full of energy", car.getEnergy());
        assertEquals(true, car.getHasFrame());
        assertEquals(true, car.getHasAllElectronicComp());
        assertEquals(true, car.getPaintVehicle());
    }

    @Test
    public void testConstructMotorcycle() {
        MotorcycleBuilder builder = MotorcycleBuilder.create();
        VehicleDirector director = new VehicleDirector(builder);
        Vehicle motorcycle = director.build();
        assertEquals("Gasoline engine", motorcycle.getEngineType());
        assertEquals(2, motorcycle.getNumberOfWheels());
        assertEquals("Full of energy", motorcycle.getEnergy());
        assertEquals(true, motorcycle.getHasFrame());
        assertEquals(true, motorcycle.getHasAllElectronicComp());
        assertEquals(true, motorcycle.getPaintVehicle());
    }
}
