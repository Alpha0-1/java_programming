import java.util.TreeMap;

/**
 * Demonstrates TreeMap for maintaining keys in sorted order.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> phoneBook = new TreeMap<>();

        // Add contacts out of order
        phoneBook.put("Zoe", 123456);
        phoneBook.put("Alice", 987654);
        phoneBook.put("Bob", 456789);

        // Automatically sorted by key
        System.out.println("Phone book:");
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }

        // First and last key
        System.out.println("First contact: " + phoneBook.firstKey());
        System.out.println("Last contact: " + phoneBook.lastKey());
    }
}
