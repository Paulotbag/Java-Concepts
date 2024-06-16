/**
 * @author Paulo Ricardo Gomes Granjeiro
 * @version JDK 18
 *          DATE: 06/08/2024
 *          OBJECTED ORIENTED PROGRAMMING: BUILDER (wITH DIRECTOR) AND FACTORY
 *          PATHERN
 *          ACTIVITY: LAB1
 */

public class Main {
    public static void main(String[] args) {
        // singleton pattern
        VehicleManager manager = VehicleManager.getVehicleManager();

        // builder pattern
        CarBuilder carBuilder = CarBuilder.create();
        VehicleDirector carDirector = new VehicleDirector(carBuilder);
        Vehicle car = carDirector.build();
        manager.addVehicle(car);

        MotorcycleBuilder motorcycleBuilder = MotorcycleBuilder.create();
        VehicleDirector motorcycleDirector = new VehicleDirector(motorcycleBuilder);
        Vehicle motorcycle = motorcycleDirector.build();
        manager.addVehicle(motorcycle);

        // factory pattern
        Vehicle factoryCar = VehicleFactory.createVehicle("car");
        manager.addVehicle(factoryCar);

        Vehicle factoryMotorcycle = VehicleFactory.createVehicle("motorcycle");
        manager.addVehicle(factoryMotorcycle);

        // verifying singleton
        VehicleManager anotherManager = VehicleManager.getVehicleManager();
        System.out.println("Is manager same as anotherManager: " + (manager == anotherManager));

        // list all vehicles
        for (Vehicle vehicle : manager.getVehicleList()) {
            vehicle.start();
            vehicle.moveForward();
            vehicle.stop();
            vehicle.stop();
            vehicle.turnOffEngine();
        }
    }
}
