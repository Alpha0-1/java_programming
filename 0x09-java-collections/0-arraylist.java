import java.util.ArrayList;

/**
 * Demonstrates basic operations on ArrayList such as adding, removing,
 * accessing elements, checking size, and iteration.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access an element by index
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");

        // Iterate using for-each loop
        System.out.println("Fruits in list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check size and if empty
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}
