/**
 * 7-constants.java
 * Purpose: Demonstrates use of final variables as constants in Java
 */
public class Constants {
    public static void main(String[] args) {
        // Declare a constant for the value of PI
        final double PI = 3.14159;

        // Attempting to reassign will cause a compilation error
        // PI = 3.14; // Uncommenting this line will cause an error

        // Use the constant in a calculation
        double radius = 5.0;
        double area = PI * radius * radius;

        System.out.println("Area of circle: " + area);
    }
}
