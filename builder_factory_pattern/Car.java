public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void moveForward() {
        System.out.println("Car moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car moving backward");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turning right");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Car engine turned off");
    }
}
