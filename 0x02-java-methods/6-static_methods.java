/**
 * Demonstrates the difference between static and instance methods.
 */
public class StaticMethods {
    public static void main(String[] args) {
        // Calling static method directly without object
        StaticMethods.staticMessage();

        // Creating object to call instance method
        StaticMethods obj = new StaticMethods();
        obj.instanceMessage();
    }

    /**
     * A static method can be called without creating an object.
     */
    public static void staticMessage() {
        System.out.println("This is a static method.");
    }

    /**
     * An instance method requires an object to be called.
     */
    public void instanceMessage() {
        System.out.println("This is an instance method.");
    }
}
