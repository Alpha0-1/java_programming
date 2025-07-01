import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of wildcard generics in Java.
 * Wildcards represent unknown types and are useful for reading from collections.
 */
public class WildcardGenerics {

    /**
     * Prints list elements using an unbounded wildcard.
     * @param list List of any type
     */
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    /**
     * Adds numbers to a list with upper bounded wildcard.
     * @param list List of Numbers or its subtypes
     */
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        printList(intList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        printList(doubleList);

        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        printList(numberList);
    }
}
