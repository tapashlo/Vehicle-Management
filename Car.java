// Car class, a subclass of Vehicle
public class Car extends Vehicle {
    // Private attribute specific to Car
    private int numberOfDoors;

    // Constructor that calls the Vehicle constructor and sets the number of doors
    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel); // Call to the superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Overridden start method with a custom message
    @Override
    public void start() {
        System.out.println("The car has started. Ready to drive!");
    }

    // Method to honk the car horn
    public void honk() {
        System.out.println("Beep Beep!");
    }

    // Getter and Setter methods for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
