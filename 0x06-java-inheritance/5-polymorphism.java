/**
 * 5-polymorphism.java
 * Demonstrates polymorphic behavior through method overriding.
 * Same method behaves differently based on object type.
 */

class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies high");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        Bird b2 = new Penguin();

        b1.fly();  // Output: Sparrow flies high
        b2.fly();  // Output: Penguin can't fly
    }
}
