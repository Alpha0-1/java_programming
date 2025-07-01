/**
 * 0-basic_inheritance.java
 * Demonstrates basic inheritance in Java.
 * A simple example showing how a subclass inherits properties and methods from a superclass.
 */

// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Accessing method from superclass
        myDog.eat();  // Inherited method

        // Accessing method from subclass
        myDog.bark(); // Own method
    }
}
