import java.util.*;

/**
 * Demonstrates the use of generic collections in Java.
 * Generics provide type safety when working with collections.
 */
public class GenericCollections {
    public static void main(String[] args) {
        // Before Generics - casting needed
        List oldList = new ArrayList();
        oldList.add("Apple");
        oldList.add(123); // Compiles but may cause ClassCastException at runtime
        String fruit = (String) oldList.get(0); // Safe
        // String num = (String) oldList.get(1); // Unsafe cast - runtime error

        // With Generics
        List<String> safeList = new ArrayList<>();
        safeList.add("Banana");
        // safeList.add(456); // Compile-time error!

        System.out.println("Safe list contents:");
        for (String item : safeList) {
            System.out.println(item);
        }
    }
}
