/**
 * This class demonstrates the use of varargs (variable arguments) in Java methods.
 * Varargs allow a method to accept any number of arguments of the same type.
 */
public class VariableArguments {

    public static void main(String[] args) {
        System.out.println("Demonstrating varargs");

        // Example 1: Sum of multiple integers
        int sum1 = sum(1, 2, 3); // Sum of 3 numbers
        System.out.println("Sum of 1, 2, 3: " + sum1);

        int sum2 = sum(4, 5, 6, 7); // Sum of 4 numbers
        System.out.println("Sum of 4, 5, 6, 7: " + sum2);

        int sum3 = sum(); // Sum with no arguments
        System.out.println("Sum with no arguments: " + sum3);

        // Example 2: Displaying names
        displayNames("Alice", "Bob", "Charlie"); // Multiple names
        displayNames(); // No names
    }

    /**
     * Sums all the provided integers.
     * @param numbers Variable number of integers to sum
     * @return Sum of all integers
     */
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    /**
     * Displays all provided names.
     * @param names Variable number of names
     */
    public static void displayNames(String... names) {
        if (names.length == 0) {
            System.out.println("No names provided.");
            return;
        }

        System.out.println("Names: ");
        for (String name : names) {
            System.out.println("- " + name);
        }
    }
}
