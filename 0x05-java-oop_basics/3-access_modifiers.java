/**
 * File: 3-access_modifiers.java
 * Description: Demonstrates public, private, and protected access modifiers.
 */

class Vehicle {
    private String model;       // Accessible only within this class
    protected int year;         // Accessible within package and subclasses
    public String type;         // Accessible everywhere

    public void setModel(String model) {
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Type: " + type);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setModel("Toyota Corolla");
        car.year = 2020;
        car.type = "Sedan";
        car.displayInfo();
    }
}

