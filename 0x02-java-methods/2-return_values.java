/**
 * Demonstrates methods that return values.
 */
public class ReturnValues {
    public static void main(String[] args) {
        int sum = add(5, 7);  // Call add method and store result
        System.out.println("Sum: " + sum);
    }

    /**
     * Adds two integers and returns the result.
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
