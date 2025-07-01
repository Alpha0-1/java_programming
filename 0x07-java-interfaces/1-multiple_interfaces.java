/**
 * 1-multiple_interfaces.java
 * Shows how a class can implement multiple interfaces.
 *
 * A single class can implement more than one interface.
 */

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();  // Expected output: Duck is swimming.
        duck.fly();   // Expected output: Duck is flying.
    }
}
