import java.util.*;
import java.util.stream.*;

/**
 * Demonstrates filtering and mapping operations on streams.
 */
public class StreamFiltering {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Filter short words and convert to uppercase
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered and mapped words: " + filteredWords);
    }
}
