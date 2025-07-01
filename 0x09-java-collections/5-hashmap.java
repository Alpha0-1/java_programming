import java.util.HashMap;

/**
 * Demonstrates HashMap operations including put, get, remove, and iteration.
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        // Add entries
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Retrieve value
        System.out.println("Alice's score: " + scores.get("Alice"));

        // Update value
        scores.put("Alice", 92);

        // Remove entry
        scores.remove("Bob");

        // Iterate over entries
        System.out.println("All scores:");
        for (HashMap.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
