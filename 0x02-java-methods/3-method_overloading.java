/**
 * This class demonstrates method overloading in Java.
 * Overloaded methods have the same name but different parameters.
 */
public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Demonstrating method overloading");

        // Example 1: Area of circle
        double circleArea = calculateArea(5.0); // Radius only
        System.out.println("Circle area (radius 5): " + circleArea);

        // Example 2: Area of rectangle
        double rectangleArea = calculateArea(4.0, 6.0); // Length and width
        System.out.println("Rectangle area: " + rectangleArea);

        // Example 3: Area of square
        double squareArea = calculateArea(3.0); // Side length (overloaded method with one parameter)
        System.out.println("Square area (side 3): " + squareArea);
    }

    /**
     * Calculates the area of a circle.
     * @param radius Radius of the circle
     * @return Area of the circle
     */
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the area of a rectangle.
     * @param length Length of the rectangle
     * @param width Width of the rectangle
     * @return Area of the rectangle
     */
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    /**
     * Overloaded method to calculate the area of a square.
     * @param side Side length of the square
     * @return Area of the square
     */
    public static double calculateArea(double side) {
        return side * side;
    }
}
