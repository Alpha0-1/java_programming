import java.util.ArrayList;

/**
 * Demonstrates the use of generics in collections to ensure type safety.
 */
public class GenericsBasics {
    public static void main(String[] args) {
        // Without generics (legacy code)
        ArrayList legacyList = new ArrayList();
        legacyList.add("Hello");
        legacyList.add(100); // Allowed but risky

        String str = (String) legacyList.get(0); // Safe cast
        // String num = (String) legacyList.get(1); // ClassCastException at runtime

        // With generics (type-safe)
        ArrayList<String> safeList = new ArrayList<>();
        safeList.add("Java");
        // safeList.add(200); // Compile-time error!

        // No need for casting
        String item = safeList.get(0);
        System.out.println("Generic list item: " + item);
    }
}
