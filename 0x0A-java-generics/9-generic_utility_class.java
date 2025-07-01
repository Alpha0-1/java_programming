/**
 * Demonstrates a utility class with generic methods.
 * Utility classes often contain reusable generic helper functions.
 */
public final class GenericUtils {

    private GenericUtils() {
        // Private constructor to prevent instantiation
    }

    /**
     * Returns the larger of two comparable items.
     * @param a First item
     * @param b Second item
     * @return Larger item
     */
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max of 3 and 5: " + max(3, 5));
        System.out.println("Max of 'apple' and 'banana': " + max("apple", "banana"));
    }
}
