public class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void moveForward() {
        System.out.println("Motorcycle moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Motorcycle moving backward");
    }

    @Override
    public void turnLeft() {
        System.out.println("Motorcycle turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Motorcycle turning right");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Motorcycle engine turned off");
    }
}
