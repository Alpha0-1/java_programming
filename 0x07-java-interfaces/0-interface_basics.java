/**
 * 0-interface_basics.java
 * Demonstrates defining and implementing interfaces in Java.
 *
 * Interfaces define a contract that implementing classes must follow.
 */

interface Animal {
    // Abstract method (does not have a body)
    void makeSound();

    // Default method (can be overridden)
    default void breathe() {
        System.out.println("The animal is breathing.");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();   // Expected output: Woof!
        dog.breathe();     // Expected output: The animal is breathing.
    }
}
