import java.util.*;
import java.util.function.*;

/**
 * Demonstrates use of Optional class for null handling.
 */
public class OptionalHandling {
    public static void main(String[] args) {
        // Create optional values
        Optional<String> nonEmpty = Optional.of("Hello");
        Optional<String> maybeEmpty = Optional.ofNullable(null);

        // Use orElse
        System.out.println("Non-empty or default: " + nonEmpty.orElse("Default"));
        System.out.println("Maybe empty or default: " + maybeEmpty.orElse("Default"));

        // Use ifPresent
        nonEmpty.ifPresent(msg -> System.out.println("Value present: " + msg));

        // Use map and flatMap
        Optional<String> transformed = nonEmpty.map(String::toUpperCase);
        System.out.println("Transformed: " + transformed.orElse("None"));

        // Example with function returning Optional
        Optional<Integer> number = findNumber(true);
        System.out.println("Found number: " + number.orElse(-1));
    }

    static Optional<Integer> findNumber(boolean found) {
        return found ? Optional.of(42) : Optional.empty();
    }
}
