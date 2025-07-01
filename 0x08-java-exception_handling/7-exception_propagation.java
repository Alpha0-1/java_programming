/**
 * Demonstrates how exceptions propagate up the call stack.
 */
public class ExceptionPropagationExample {
    public static void methodThree() {
        int result = 10 / 0; // Exception occurs here
    }

    public static void methodTwo() {
        methodThree(); // Exception propagates here
    }

    public static void methodOne() {
        try {
            methodTwo(); // Exception caught here
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in methodOne(): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodOne(); // Start the chain
    }
}
