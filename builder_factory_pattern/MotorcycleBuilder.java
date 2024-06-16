//concrete builder
public class MotorcycleBuilder implements VehicleBuilder {

    private String engineType;
    private boolean hasFrame;
    private boolean hasAllElectronicComp;
    private boolean paintVehicle;

    private String hasEnergy;
    private int numberOfWheels;
    private boolean engineON;
    private String vehicleColour;
    private Motorcycle motorcycle;

    /////////////////
    // methods from interface VehicleBuilder
    /**
     * 
     * @return void
     */
    public void buildEngine() {
        motorcycle.setEngineType("Gasoline engine");
    }

    /**
     * 
     * @return void
     */
    public void buildWheels() {
        motorcycle.setNumberOfWheels(2);
    }

    /**
     * 
     * @return void
     */
    public void rechargeEnergy() {
        motorcycle.setEnergy("Full of energy");
    }

    /**
     * 
     * @return void
     */
    public void buildAllFrames() {
        motorcycle.setHasFrame(true);
    }

    /**
     * 
     * @return void
     */
    public void installAllElectronics() {
        motorcycle.setHasAllElectronicComp(true);
    }

    /**
     * 
     * @return void
     */
    public void paintVehicle() {
        motorcycle.setPaintVehicle(true);
    }

    /////////////////
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

    /////////////////
    // constructor
    private MotorcycleBuilder() {
        this.motorcycle = new Motorcycle();
    }

    // creates the instance of this class
    /**
     * 
     * @return MotorcycleBuilder
     */
    public static MotorcycleBuilder create() {
        return new MotorcycleBuilder();
    }

    /////////////////
    // chainned setters for the builder.
    /**
     * @param String - engineType
     * @return MotorcycleBuilder
     */
    public MotorcycleBuilder engineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * @param int - numberOfWheels
     * @return MotorcycleBuilder
     */
    public MotorcycleBuilder numberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    /**
     * @param String - energy
     * @return MotorcycleBuilder
     */
    public MotorcycleBuilder hasEnergy(String energy) {
        this.hasEnergy = energy;
        return this;
    }

    /**
     * @param boolean - hasFrame
     * @return MotorcycleBuilder
     */
    public MotorcycleBuilder hasFrame(boolean hasFrame) {
        this.hasFrame = hasFrame;
        return this;
    }

    /**
     * @param boolean - hasAllElectronicComp
     * @return MotorcycleBuilder
     */
    public MotorcycleBuilder hasAllElectronicComp(boolean hasAllElectronicComp) {
        this.hasAllElectronicComp = hasAllElectronicComp;
        return this;
    }

    /**
     * @param boolean - engineON
     * @return MotorcycleBuilder
     */
    public MotorcycleBuilder engineOn(boolean engineON) {
        this.engineON = engineON;
        return this;
    }

    /**
     * @param boolean - paintVehicle
     * @return MotorcycleBuilder
     */
    public MotorcycleBuilder vehicleHasPaint(boolean paintVehicle) {
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
     * @return Motorcycle
     */
    public Motorcycle build() {
        return motorcycle;
    }
}
