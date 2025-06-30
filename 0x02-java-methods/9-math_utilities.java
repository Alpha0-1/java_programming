import java.util.InputMismatchException;

/**
 * A utility class containing various mathematical helper methods.
 */
public class MathUtilities {

    /**
     * Calculates the area of a rectangle given its length and width.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area of the rectangle
     */
    public static double calculateAreaOfRectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive.");
        }
        return length * width;
    }

    /**
     * Calculates the perimeter of a rectangle given its length and width.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the perimeter of the rectangle
     */
    public static double calculatePerimeterOfRectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive.");
        }
        return 2 * (length + width);
    }

    /**
     * Calculates the factorial of a positive integer.
     *
     * @param n the positive integer
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    /**
     * Calculates the greatest common divisor (GCD) of two positive integers.
     * Uses the Euclidean algorithm.
     *
     * @param a the first positive integer
     * @param b the second positive integer
     * @return the GCD of a and b
     * @throws IllegalArgumentException if a or b is negative or zero
     */
    public static int calculateGCD(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both numbers must be positive.");
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calculates the least common multiple (LCM) of two positive integers.
     * Uses the formula: LCM(a, b) = (a * b) / GCD(a, b)
     *
     * @param a the first positive integer
     * @param b the second positive integer
     * @return the LCM of a and b
     * @throws IllegalArgumentException if a or b is negative or zero
     */
    public static int calculateLCM(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both numbers must be positive.");
        }
        return (a * b) / calculateGCD(a, b);
    }

    /**
     * Calculates the hypotenuse of a right-angled triangle given the lengths of the other two sides.
     * Uses the Pythagorean theorem: c = sqrt(a² + b²)
     *
     * @param a the length of the first side
     * @param b the length of the second side
     * @return the length of the hypotenuse
     * @throws IllegalArgumentException if a or b is not positive
     */
    public static double calculateHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both sides must be positive.");
        }
        return Math.hypot(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Math Utilities Demo");
        System.out.println("------------------");

        try {
            // Example 1: Calculate area and perimeter of a rectangle
            double length = 5.0;
            double width = 3.0;
            System.out.println("Rectangle with length = " + length + ", width = " + width);
            System.out.println("Area = " + calculateAreaOfRectangle(length, width));
            System.out.println("Perimeter = " + calculatePerimeterOfRectangle(length, width));
            System.out.println("------------------");

            // Example 2: Calculate factorial
            int number = 5;
            System.out.println("Factorial of " + number + " = " + calculateFactorial(number));
            System.out.println("------------------");

            // Example 3: Calculate GCD and LCM
            int a = 12;
            int b = 18;
            System.out.println("For numbers " + a + " and " + b);
            System.out.println("GCD = " + calculateGCD(a, b));
            System.out.println("LCM = " + calculateLCM(a, b));
            System.out.println("------------------");

            // Example 4: Calculate hypotenuse
            double side1 = 3.0;
            double side2 = 4.0;
            System.out.println("Hypotenuse of sides " + side1 + " and " + side2);
            System.out.println("Result = " + calculateHypotenuse(side1, side2));
            System.out.println("------------------");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
