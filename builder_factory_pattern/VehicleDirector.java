public class VehicleDirector {

    private VehicleBuilder myBuilder;

    /**
     * @param VehicleBuilder - builder
     * 
     */
    public VehicleDirector(VehicleBuilder builder) {
        this.myBuilder = builder;
    }

    /**
     * 
     * @return Vehicle
     */
    public Vehicle build() {
        this.myBuilder.buildEngine();
        this.myBuilder.buildWheels();
        this.myBuilder.buildAllFrames();
        this.myBuilder.rechargeEnergy();
        this.myBuilder.installAllElectronics();
        this.myBuilder.paintVehicle();
        return this.myBuilder.build();
    }

}
