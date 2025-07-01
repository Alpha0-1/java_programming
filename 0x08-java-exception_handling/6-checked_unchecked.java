/**
 * Demonstrates the difference between checked and unchecked exceptions.
 */
public class CheckedUncheckedExample {
    public static void main(String[] args) {
        // Unchecked exception - doesn't require handling
        try {
            int result = 10 / 0; // ArithmeticException (unchecked)
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }

        // Checked exception - must be handled or declared
        try {
            readFile(); // This method declares a checked exception
        } catch (Exception e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }
    }

    public static void readFile() throws Exception {
        throw new Exception("This is a checked exception.");
    }
}
