import java.util.*;
import java.util.stream.*;

/**
 * Demonstrates various ways to create streams in Java.
 */
public class StreamCreation {
    public static void main(String[] args) {
        // Stream from collection
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> streamFromList = names.stream();

        // Stream from array
        Stream<String> streamFromArray = Stream.of("Java", "Python", "C++");

        // Infinite stream using iterate
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);

        // Limited stream
        Stream<String> limitedStream = Stream.generate(Math::random).limit(5)
                                            .map(x -> String.format("%.2f", x))
                                            .map(s -> "Rand: " + s);

        // Print generated streams
        System.out.println("Names:");
        streamFromList.forEach(System.out::println);

        System.out.println("\nLanguages:");
        streamFromArray.forEach(System.out::println);

        System.out.println("\nLimited random numbers:");
        limitedStream.forEach(System.out::println);
    }
}
