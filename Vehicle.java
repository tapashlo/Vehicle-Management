// Vehicle class, the base class for all vehicles
public class Vehicle {
    // Protected attributes so that subclasses can access them
    protected int speed;
    private double fuel;

    // Constructor to initialize speed and fuel
    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    // Method to start the vehicle, to be overridden in subclasses
    public void start() {
        System.out.println("The vehicle has started.");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    // Final method that prints fuel level, can't be overridden in subclasses
    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel + " liters.");
    }

    // Getter and Setter methods for speed and fuel (encapsulation)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
