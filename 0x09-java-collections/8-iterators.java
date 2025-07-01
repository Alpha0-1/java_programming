import java.util.*;

/**
 * Demonstrates Iterator and ListIterator for traversing collections.
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue");

        // Using Iterator
        Iterator<String> iterator = colors.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
            if (color.equals("Green")) {
                iterator.remove(); // Safely remove during iteration
            }
        }

        // Using ListIterator (bidirectional)
        ListIterator<String> listIterator = colors.listIterator();
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
