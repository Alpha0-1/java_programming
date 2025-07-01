/**
 * Demonstrates best practices in exception handling:
 * - Specific catch blocks
 * - Avoid empty catches
 * - Logging meaningful messages
 */
public class ExceptionBestPractices {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Best practice: log detailed message instead of just printing
            System.err.println("[ERROR] Division by zero: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("[ERROR] Unexpected error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
