/**
 * 2-default_methods.java
 * Illustrates the use of default methods in interfaces.
 *
 * Default methods allow adding functionality to existing interfaces without breaking implementations.
 */

interface Vehicle {
    default void start() {
        System.out.println("Vehicle started.");
    }
}

class Car implements Vehicle {
    // Can optionally override the default method
    public void start() {
        System.out.println("Car engine started.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Expected output: Car engine started.
    }
}
