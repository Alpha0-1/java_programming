/**
 * 3-static_interface_methods.java
 * Demonstrates static methods in interfaces.
 *
 * Static methods in interfaces provide utility functions.
 */

interface MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 7);
        System.out.println("Sum: " + result);  // Expected output: Sum: 12
    }
}
