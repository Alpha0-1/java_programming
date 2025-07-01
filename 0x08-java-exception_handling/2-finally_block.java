/**
 * Demonstrates the use of finally block that always executes after try-catch.
 */
public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred.");
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
