/**
 * Demonstrates how to pass parameters to a method.
 */
public class Parameters {
    public static void main(String[] args) {
        greetUser("Alice");
        greetUser("Bob");
    }

    /**
     * Greets a user by name.
     * @param name The name of the person to greet.
     */
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
