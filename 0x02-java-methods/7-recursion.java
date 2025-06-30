/**
 * Demonstrates recursive methods in Java.
 */
public class Recursion {
    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    /**
     * Calculates factorial of a number using recursion.
     * @param n Number to compute factorial for
     * @return Factorial of n
     */
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        } else {
            return n * calculateFactorial(n - 1);  // Recursive call
        }
    }
}
