import java.util.ArrayList;

/**
 * Objective: Ensure that there is only one instance of a VehicleManager that manages
all vehicles in the system.
 */
/**
 * VeicleManager follows Singleton pattern.
 */
public class VehicleManager {

    private static VehicleManager manager;

    // Arraylist to keep all vehicles
    private ArrayList<Vehicle> vehicleList;

    private VehicleManager() {
        this.vehicleList = new ArrayList<>();
    }

    /**
     *
     * @return VehicleManager
     */
    public static VehicleManager getVehicleManager() {
        if (manager == null) {
            manager = new VehicleManager();
        }
        return manager;
    }

    /*
     * 
     * implement a
     * method that
     * add and
     * retrieve vehicles (Hint: you can use an
     * ArrayList to keep the Vehicles)
     */

    /**
     * @param Vehicle - vehicle
     * @return void
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /*
     * DO THE PROFESSOR WANTS ME TO RETRIVE EACH VEHICLE OBJECTS OR THE ENTIRE
     * LIST??
     * I will follow with 3 different methods.
     */
    /**
     * 
     * @return ArrayList<Vehicle>
     */
    public ArrayList<Vehicle> getVehicleList() {
        return this.vehicleList;
    }

    /**
     * @param int - index
     * @return Vehicle
     */
    public Vehicle getSingleVehicle(int index) {
        return vehicleList.get(index);
    }

    /**
     * 
     * @return void
     */
    public void showVehicles() {
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println(vehicleList.get(i));
        }
    }

    /**
     * Create a few instances of vehicles (using Builder and Factory) and add them
     * to the VehicleManager
     */

}
