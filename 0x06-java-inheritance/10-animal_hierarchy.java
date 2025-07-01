/**
 * 10-animal_hierarchy.java
 * Complete example of an inheritance hierarchy.
 * Base class Animal extended by specific animals like Lion and Dolphin.
 */

abstract class Animal {
    abstract void move();
    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is resting");
    }
}

class Lion extends Animal {
    @Override
    void move() {
        System.out.println("Lion walks");
    }

    @Override
    void makeSound() {
        System.out.println("Roar!");
    }
}

class Dolphin extends Animal {
    @Override
    void move() {
        System.out.println("Dolphin swims");
    }

    @Override
    void makeSound() {
        System.out.println("Click-click");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal dolphin = new Dolphin();

        lion.move();         // Output: Lion walks
        lion.makeSound();    // Output: Roar!
        lion.sleep();        // Output: Animal is resting

        dolphin.move();      // Output: Dolphin swims
        dolphin.makeSound(); // Output: Click-click
        dolphin.sleep();     // Output: Animal is resting
    }
}
