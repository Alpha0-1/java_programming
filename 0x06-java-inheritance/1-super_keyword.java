/**
 * 1-super_keyword.java
 * Illustrates use of 'super' keyword to access superclass members.
 * Shows how to call superclass constructor and methods.
 */

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    void startEngine() {
        System.out.println("Engine started in Vehicle");
    }
}

class Car extends Vehicle {
    Car() {
        super();  // Calls superclass constructor explicitly
        System.out.println("Car constructor called");
    }

    @Override
    void startEngine() {
        super.startEngine();  // Calls superclass method
        System.out.println("Car engine revved up!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }
}
