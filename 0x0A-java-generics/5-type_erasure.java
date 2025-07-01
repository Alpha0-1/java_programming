import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates Java's type erasure mechanism.
 * At runtime, generic type information is erased by the compiler.
 */
public class TypeErasureExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();

        // Both will show same raw type at runtime
        System.out.println("stringList class: " + stringList.getClass());
        System.out.println("intList class: " + intList.getClass());

        // This compiles because of type erasure
        try {
            List.class.getMethod("add", Object.class).invoke(stringList, 123);
            System.out.println("Added Integer to String list: " + stringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
