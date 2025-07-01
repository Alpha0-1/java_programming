/**
 * 4-final_keyword.java
 * Demonstrates use of final keyword on classes and methods.
 * Prevents inheritance or overriding.
 */

final class FinalClass {
    void display() {
        System.out.println("Final class method");
    }
}

// Uncommenting below line will cause compilation error
// class SubClass extends FinalClass { } // Error: Cannot inherit from final class

class Parent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    // Uncommenting below will cause error
    // void show() { } // Error: Cannot override final method
}

public class Main {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.display();

        Child c = new Child();
        c.show();
    }
}
