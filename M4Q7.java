// Define the abstract class Vehicle
abstract class Vehicle {
    // Declare the abstract method move()
    public abstract void move();
}

// Define the subclass Car
class Car extends Vehicle {
    // Implement the abstract method move()
    public void move() {
        System.out.println("Car is moving");
    }
}

// Define the subclass Bike
class Bike extends Vehicle {
    // Implement the abstract method move()
    public void move() {
        System.out.println("Bike is moving");
    }
}

// Define the subclass Cycle
class Cycle extends Vehicle {
    // Implement the abstract method move()
    public void move() {
        System.out.println("Cycle is moving");
    }
}

public class M4Q7 {
    public static void main(String[] args) {
        // Create an array of Vehicle references
        Vehicle[] vehicles = new Vehicle[3];

        // Populate the array with objects of Car, Bike, and Cycle classes
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Cycle();

        // Call the move() method using the Vehicle references
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}