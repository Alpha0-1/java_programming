/**
 * Demonstrates bounded type parameters in Java generics.
 * Bounded types restrict the types that can be passed to a generic class or method.
 */
public class BoundedGenerics {

    /**
     * Method that accepts only Number subclasses as type argument.
     * @param number the value to display
     */
    public static <T extends Number> void displayNumber(T number) {
        System.out.println("Value: " + number + ", Class: " + number.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        displayNumber(10);       // Integer
        displayNumber(10.5);     // Double
        displayNumber(100L);     // Long

        // Uncommenting the next line would cause a compile-time error:
        // displayNumber("Ten"); // Not a subclass of Number
    }
}
