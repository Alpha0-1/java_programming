import java.util.LinkedList;
import java.util.ArrayList;

/**
 * Compares LinkedList and ArrayList performance in terms of add/remove operations.
 */
public class LinkedListVsArrayList {
    public static void main(String[] args) {
        int iterations = 100000;

        // Test inserting at beginning of ArrayList
        long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(0, i); // Insert at front
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add time: " + (end - start) + " ms");

        // Test inserting at beginning of LinkedList
        start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            linkedList.addFirst(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add time: " + (end - start) + " ms");
    }
}
