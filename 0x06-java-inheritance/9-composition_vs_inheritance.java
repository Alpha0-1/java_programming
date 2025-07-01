/**
 * 9-composition_vs_inheritance.java
 * Compares composition vs inheritance.
 * Composition allows more flexibility than classical inheritance.
 */

// Using Inheritance
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car extends Engine {
    void drive() {
        start();  // Reusing method via inheritance
        System.out.println("Car is driving");
    }
}

// Using Composition
class Bike {
    private Engine engine;

    Bike(Engine engine) {
        this.engine = engine;
    }

    void ride() {
        engine.start();
        System.out.println("Bike is riding");
    }
}

public class Main {
    public static void main(String[] args) {
        // Inheritance-based usage
        Car car = new Car();
        car.drive();

        // Composition-based usage
        Engine bikeEngine = new Engine();
        Bike bike = new Bike(bikeEngine);
        bike.ride();
    }
}
