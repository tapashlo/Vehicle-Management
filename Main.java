// Main class to test the functionality of the Vehicle, Car, and Bicycle classes
public class Main {
    public static void main(String[] args) {
        // Create a Car object and test its methods
        Car myCar = new Car(120, 50.5, 4);
        myCar.start();  // Calls Car's overridden start method
        myCar.displayFuel();  // Calls the final displayFuel method from Vehicle
        myCar.honk();  // Calls the Car's honk method

        // Create a Bicycle object and test its methods
        Bicycle myBicycle = new Bicycle(25, 0.0, true);
        myBicycle.start();  // Calls Bicycle's overridden start method
        myBicycle.displayFuel();  // Calls the final displayFuel method from Vehicle
        myBicycle.ringBell();  // Calls the Bicycle's ringBell method

        // Testing the effect of access specifiers
        // Uncommenting below lines will cause compile-time errors due to access restrictions
        // System.out.println(myCar.speed);  // Cannot access 'speed' directly (protected)
        // System.out.println(myBicycle.fuel);  // Cannot access 'fuel' directly (private)
    }
}
