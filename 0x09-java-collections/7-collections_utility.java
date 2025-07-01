import java.util.*;

/**
 * Demonstrates common utility methods from Collections class.
 */
public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);

        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        // Reversing
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        // Shuffling
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        // Finding max and min
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        // Frequency
        System.out.println("Frequency of 5: " + Collections.frequency(numbers, 5));
    }
}
