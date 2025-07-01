import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

/**
 * Demonstrates usage of Collectors utility class with streams.
 */
public class CollectorsUsage {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Alex");

        // Group by first letter
        Map<Character, List<String>> groupedByName = names.stream()
                .collect(groupingBy(name -> name.charAt(0)));

        // Count frequency of each character
        String text = "hello world";
        Map<Character, Long> charFrequency = text.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()));

        System.out.println("Grouped by initial: " + groupedByName);
        System.out.println("Character frequency: " + charFrequency);
    }
}
