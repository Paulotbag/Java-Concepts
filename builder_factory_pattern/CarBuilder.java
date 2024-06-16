
//concrete builder
public class CarBuilder implements VehicleBuilder {

    private String engineType;
    private boolean hasFrame;
    private boolean hasAllElectronicComp;
    private boolean paintVehicle;

    private String hasEnergy;
    private int numberOfWheels;
    private boolean engineON;
    private String vehicleColour;
    private Car car;

    /////////////////

    //////////////
    // methods from interface VehicleBuilder.
    /**
     * 
     * @return void
     */
    public void buildEngine() {
        car.setEngineType("Electric engine");
    }

    /**
     * 
     * @return void
     */
    public void buildWheels() {
        car.setNumberOfWheels(4);
    }

    /**
     * 
     * @return void
     */
    public void rechargeEnergy() {
        car.setEnergy("Full of energy");
    }

    /**
     * 
     * @return void
     */
    public void buildAllFrames() {
        car.setHasFrame(true);
    }

    /**
     * 
     * @return void
     */
    public void installAllElectronics() {
        car.setHasAllElectronicComp(true);

    }

    /**
     * 
     * @return void
     */
    public void paintVehicle() {
        car.setPaintVehicle(true);

    }

    //////////////
    // getters
    /**
     * 
     * @return String
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * 
     * @return int
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * 
     * @return String
     */
    public String getHasEnergy() {
        return hasEnergy;
    }

    /**
     * 
     * @return boolean
     */
    public boolean getHasFrame() {
        return hasFrame;
    }

    /**
     * 
     * @return boolean
     */
    public boolean getHasAllElectronicComp() {
        return hasAllElectronicComp;
    }

    /**
     * 
     * @return boolean
     */
    public boolean getPaintVehicle() {
        return paintVehicle;
    }

    /**
     * 
     * @return boolean
     */
    public boolean getEngineON() {
        return engineON;
    }

    /**
     * 
     * @return String
     */
    public String getVehicleColour() {
        return vehicleColour;
    }

    //////////////
    // constructor
    private CarBuilder() {
        this.car = new Car();
    }

    //////////////
    // create method to create an instance of the class.
    /**
     * 
     * @return CarBuilder
     */
    public static CarBuilder create() {
        return new CarBuilder();
    }

    //////////////
    // chainned setters for the builder.
    /**
     * @param String - engineType
     * @return MotorcycleBuilder
     */
    public CarBuilder engineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * @param int
     * @return CarBuilder
     */
    public CarBuilder numberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    /**
     * @param String - amountEnergy
     * @return CarBuilder
     */
    public CarBuilder hasEnergy(String amountEnergy) {
        this.hasEnergy = amountEnergy;
        return this;
    }

    /**
     * @param boolean
     * @return CarBuilder
     */
    public CarBuilder hasFrame(boolean hasFrame) {
        this.hasFrame = hasFrame;
        return this;
    }

    /**
     * @param boolean
     * @return CarBuilder
     */
    public CarBuilder hasAllElectronicComp(boolean hasAllElectronicComp) {
        this.hasAllElectronicComp = hasAllElectronicComp;
        return this;
    }

    /**
     * @param boolean
     * @return CarBuilder
     */
    public CarBuilder VehicleHasPaint(boolean paintVehicle) {
        this.paintVehicle = paintVehicle;
        return this;
    }

    /**
     * @param boolean
     * @return CarBuilder
     */
    public CarBuilder engineOn(boolean engineON) {
        this.engineON = engineON;
        return this;
    }

    /**
     * @param boolean
     * @return CarBuilder
     */
    public CarBuilder vehicleHasPaint(boolean paintVehicle) {
        this.paintVehicle = paintVehicle;
        return this;
    }

    @Override
    public String toString() {
        return "MotorcycleBuilder [engineType=" + engineType + ", hasFrame=" + hasFrame + ", hasAllElectronicComp="
                + hasAllElectronicComp + ", paintVehicle=" + paintVehicle + ", hasEnergy=" + hasEnergy
                + ", numberOfWheels=" + numberOfWheels + ", engineON=" + engineON + ", vehicleColour=" + vehicleColour
                + "]";
    }

    /**
     * 
     * @return Car
     */
    public Car build() {
        return car;
    }

    //////////////
    /*
     * // using builder - uses Vehicle(CarBuilder) constructor to create and
     * initialize
     * // a Vehicle.
     * //this is for the case of simple builder
     */

    // public Vehicle build() {
    // return new Vehicle(this);
    // }
}
