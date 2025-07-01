/**
 * Demonstrates the use of generic methods in Java.
 * Generic methods allow type parameters to be used within method definitions.
 */
public class GenericMethods {

    /**
     * A generic method to print any type of array.
     * @param <T> Type parameter
     * @param array Array of elements to print
     */
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"One", "Two", "Three"};

        System.out.println("Printing integer array:");
        printArray(intArray);

        System.out.println("Printing string array:");
        printArray(strArray);
    }
}
