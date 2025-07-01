/**
 * 8-inheritance_hierarchy.java
 * Demonstrates multi-level inheritance in Java.
 * Shows a hierarchy of classes: LivingThing -> Mammal -> Human.
 */

class LivingThing {
    void breathe() {
        System.out.println("Living thing breathes");
    }
}

class Mammal extends LivingThing {
    void giveBirth() {
        System.out.println("Mammal gives birth");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Human speaks");
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.breathe();     // From LivingThing
        human.giveBirth();   // From Mammal
        human.speak();       // From Human
    }
}
