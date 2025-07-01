/**
 * 3-abstract_classes.java
 * Introduces abstract classes and methods in Java.
 * Abstract classes cannot be instantiated; they define templates for subclasses.
 */

abstract class Animal {
    abstract void makeSound();  // Abstract method

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.makeSound();  // Meow
        myCat.sleep();      // Animal is sleeping
    }
}
