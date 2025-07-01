import java.util.TreeSet;

/**
 * Demonstrates TreeSet for maintaining sorted order of elements.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements out of order
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(1);

        // Automatically sorted
        System.out.println("Sorted numbers: " + numbers);

        // Get first and last
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // Subset example
        System.out.println("Subset from 5 to 15: " + numbers.subSet(5, 15));
    }
}
