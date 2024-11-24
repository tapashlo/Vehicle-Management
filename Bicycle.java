// Bicycle class, a subclass of Vehicle
public class Bicycle extends Vehicle {
    // Private attribute specific to Bicycle
    private boolean hasBell;

    // Constructor that calls the Vehicle constructor and sets hasBell
    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel); // Call to the superclass constructor
        this.hasBell = hasBell;
    }

    // Overridden start method with a custom message for Bicycle
    @Override
    public void start() {
        System.out.println("Pedal away! The bicycle is now in motion.");
    }

    // Method to ring the bell, only if the bicycle has one
    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    // Getter and Setter methods for hasBell
    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
