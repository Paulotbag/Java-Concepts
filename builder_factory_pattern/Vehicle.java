public abstract class Vehicle {
    /*
     * Class attributes
     */
    private String engineType;
    private boolean hasFrame;
    private boolean hasAllElectronicComp;
    private boolean paintVehicle;

    private String hasEnergy;
    private int numberOfWheels;
    private boolean engineON;
    private String vehicleColour;

    ////////////////////////////////
    // abstract methods
    public abstract void start();

    public abstract void moveForward();

    public abstract void moveBackward();

    public abstract void turnLeft();

    public abstract void turnRight();

    public abstract void stop();

    public abstract void turnOffEngine();

    ////////////////////////////////
    // getters and setters
    /**
     * 
     * @return boolean
     */
    public boolean getEngineState() {
        return this.engineON;
    }

    /**
     * @param boolean - setEngineState
     * @return void
     */
    public void setEngineState(boolean setEngineState) {
        this.engineON = setEngineState;
    }

    /**
     * 
     * @return String
     */
    public String getEnergy() {
        return hasEnergy;
    }

    /**
     * @param String - energy
     * @return void
     */
    public void setEnergy(String energy) {
        this.hasEnergy = energy;
    }

    /**
     *
     * @return String
     */
    public String getVehicleColour() {
        return this.vehicleColour;
    }

    /**
     * @param String - colour
     * @return void
     */
    public void setVehicleColour(String colour) {
        if (!paintVehicle) {
            System.out.println("This vehicle can not be painted!");
        } else {
            this.vehicleColour = colour;
        }
    }

    /**
     * @param String - engineType
     * @return void
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * @return String
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * @param int - numberOfWheels
     * @return void
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * @return int
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * @param boolean - trueOfFalse
     * @return void
     */
    public void setHasFrame(boolean trueOrFalse) {
        this.hasFrame = trueOrFalse;
    }

    /**
     * @return boolean
     */
    public boolean getHasFrame() {
        return hasFrame;
    }

    /**
     * @param boolean - trueOrFalse
     * @return void
     */
    public void setHasAllElectronicComp(boolean trueOrFalse) {
        this.hasAllElectronicComp = trueOrFalse;
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
        return this.paintVehicle;
    }

    /**
     * @param boolean - trueOrFalse
     * @return void
     */
    public void setPaintVehicle(boolean trueOrFalse) {
        this.paintVehicle = trueOrFalse;
    }

    /*
     * This constructor accepts a CarBuilder which is then used
     * to obtain the data for the fields.
     * Use it in the case of simple builder.
     */
    // public Vehicle(CarBuilder builder) {
    // engineON = builder.getEngineON();
    // hasEnergy = builder.getHasEnergy();
    // vehicleColour = builder.getVehicleColour();
    // }

}
