/**
 * 4-functional_interfaces.java
 * Demonstrates functional interfaces and lambda expressions.
 *
 * Functional interfaces have exactly one abstract method and support lambda expressions.
 */

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name);

        greet.sayHello("Alice");  // Expected output: Hello, Alice
    }
}
