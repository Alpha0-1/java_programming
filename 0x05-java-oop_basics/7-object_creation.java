/**
 * File: 7-object_creation.java
 * Description: Demonstrates how to create and use objects.
 */

public class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving a " + brand);
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        car1.drive();  // Output: Driving a BMW
    }
}

