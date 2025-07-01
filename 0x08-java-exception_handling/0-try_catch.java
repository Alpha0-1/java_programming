/**
 * Demonstrates basic exception handling using try-catch blocks.
 */
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    /**
     * Divides two integers.
     *
     * @param numerator   the number to be divided
     * @param denominator the number to divide by
     * @return the result of division
     */
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
