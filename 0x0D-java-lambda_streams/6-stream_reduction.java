import java.util.*;
import java.util.stream.*;

/**
 * Demonstrates reduction operations using Stream.reduce().
 */
public class StreamReduction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum all elements
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("Sum: " + sum.orElse(0));

        // Product of all elements
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
    }
}
