/**
 * Demonstrates basic lambda expressions in Java.
 */
public class LambdaBasics {
    public static void main(String[] args) {
        // Lambda expression to add two numbers
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression without return keyword for single-line logic
        MathOperation subtraction = (a, b) -> a - b;

        // Using the lambdas
        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
    }

    // Functional interface with one abstract method
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }
}
