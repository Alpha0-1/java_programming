import java.util.*;
import java.util.stream.*;

/**
 * Demonstrates intermediate and terminal stream operations.
 */
public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Intermediate operations: filter, map, sorted
        Stream<Integer> processedStream = numbers.stream()
                .filter(n -> n % 2 == 0)     // Keep even numbers
                .map(n -> n * n)            // Square them
                .sorted();                  // Sort the results

        // Terminal operation: collect into list
        List<Integer> result = processedStream.collect(Collectors.toList());

        System.out.println("Processed stream result: " + result);
    }
}
