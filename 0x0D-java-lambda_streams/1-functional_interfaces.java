import java.util.function.*;

/**
 * Demonstrates built-in functional interfaces in Java.
 */
public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Predicate<T>: returns boolean
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Function<T, R>: transforms T to R
        Function<String, Integer> strToInt = Integer::valueOf;
        System.out.println("String to int: " + strToInt.apply("123"));

        // Consumer<T>: performs an action
        Consumer<String> printMessage = msg -> System.out.println("Message: " + msg);
        printMessage.accept("Hello World");

        // Supplier<T>: provides a value
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Random number: " + randomSupplier.get());
    }
}
