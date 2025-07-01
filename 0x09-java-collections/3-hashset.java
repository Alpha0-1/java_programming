import java.util.HashSet;

/**
 * Demonstrates Set operations with HashSet including add, remove, contains,
 * and iteration.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();

        // Adding elements
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");
        uniqueNames.add("Alice"); // Duplicate, won't be added

        // Check existence
        System.out.println("Contains 'Alice'? " + uniqueNames.contains("Alice"));

        // Remove element
        uniqueNames.remove("Bob");

        // Iterating through the set
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
