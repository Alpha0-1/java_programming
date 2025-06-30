/**
 * ArrayUtilities - Custom utility methods for array operations
 * 
 * This class demonstrates how to create custom utility methods for common
 * array operations that aren't provided by the standard Java library.
 * These utilities showcase defensive programming, error handling, and
 * efficient algorithms.
 * 
 * @author Alpha0-1
 */
public class ArrayUtilities {
    
    /**
     * Finds the maximum element in an integer array
     * 
     * @param array the array to search
     * @return the maximum value in the array
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    /**
     * Finds the minimum element in an integer array
     * 
     * @param array the array to search
     * @return the minimum value in the array
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    /**
     * Calculates the sum of all elements in an integer array
     * 
     * @param array the array to sum
     * @return the sum of all elements
     * @throws IllegalArgumentException if array is null
     */
    public static long sum(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
    
    /**
     * Calculates the average of all elements in an integer array
     * 
     * @param array the array to calculate average for
     * @return the average value as a double
     * @throws IllegalArgumentException if array is null or empty
     */
    public static double average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        return (double) sum(array) / array.length;
    }
    
    /**
     * Reverses an array in-place
     * 
     * @param array the array to reverse
     * @throws IllegalArgumentException if array is null
     */
    public static void reverse(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            left++;
            right--;
        }
    }
    
    /**
     * Creates a copy of an array with a new size
     * If new size is larger, fills with zeros
     * If new size is smaller, truncates the array
     * 
     * @param array the original array
     * @param newSize the size of the new array
     * @return a new array with the specified size
     * @throws IllegalArgumentException if array is null or newSize is negative
     */
    public static int[] resize(int[] array, int newSize) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (newSize < 0) {
            throw new IllegalArgumentException("New size cannot be negative");
        }
        
        int[] newArray = new int[newSize];
        int copyLength = Math.min(array.length, newSize);
        
        for (int i = 0; i < copyLength; i++) {
            newArray[i] = array[i];
        }
        
        return newArray;
    }
    
    /**
     * Removes duplicates from a sorted array
     * 
     * @param sortedArray the sorted array to remove duplicates from
     * @return a new array with duplicates removed
     * @throws IllegalArgumentException if array is null
     */
    public static int[] removeDuplicates(int[] sortedArray) {
        if (sortedArray == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        if (sortedArray.length <= 1) {
            return sortedArray.clone();
        }
        
        // Count unique elements
        int uniqueCount = 1;
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] != sortedArray[i - 1]) {
                uniqueCount++;
            }
        }
        
        // Create new array with unique elements
        int[] result = new int[uniqueCount];
        result[0] = sortedArray[0];
        int index = 1;
        
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] != sortedArray[i - 1]) {
                result[index++] = sortedArray[i];
            }
        }
        
        return result;
    }
    
    /**
     * Checks if an array contains a specific value
     * 
     * @param array the array to search
     * @param target the value to find
     * @return true if the value is found, false otherwise
     * @throws IllegalArgumentException if array is null
     */
    public static boolean contains(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        for (int value : array) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Prints an array in a formatted way
     * 
     * @param array the array to print
     * @param arrayName the name to display for the array
     */
    public static void printArray(int[] array, String arrayName) {
        if (array == null) {
            System.out.println(arrayName + ": null");
            return;
        }
        
        System.out.print(arrayName + ": [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    /**
     * Main method to demonstrate the utility functions
     */
    public static void main(String[] args) {
        System.out.println("=== Array Utilities Demonstration ===\n");
        
        // Test array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 5, 77, 30};
        printArray(numbers, "Original Array");
        
        // Test find max and min
        System.out.println("\n--- Min/Max Operations ---");
        System.out.println("Maximum value: " + findMax(numbers));
        System.out.println("Minimum value: " + findMin(numbers));
        
        // Test sum and average
        System.out.println("\n--- Sum/Average Operations ---");
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Average: " + String.format("%.2f", average(numbers)));
        
        // Test reverse
        System.out.println("\n--- Reverse Operation ---");
        int[] copyForReverse = numbers.clone();
        reverse(copyForReverse);
        printArray(copyForReverse, "Reversed Array");
        
        // Test resize
        System.out.println("\n--- Resize Operations ---");
        int[] resizedLarger = resize(numbers, 15);
        printArray(resizedLarger, "Resized (larger)");
        
        int[] resizedSmaller = resize(numbers, 5);
        printArray(resizedSmaller, "Resized (smaller)");
        
        // Test remove duplicates
        System.out.println("\n--- Remove Duplicates ---");
        int[] arrayWithDuplicates = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5};
        printArray(arrayWithDuplicates, "Array with duplicates");
        
        int[] uniqueArray = removeDuplicates(arrayWithDuplicates);
        printArray(uniqueArray, "After removing duplicates");
        
        // Test contains
        System.out.println("\n--- Contains Operation ---");
        int searchValue = 25;
        boolean found = contains(numbers, searchValue);
        System.out.println("Array contains " + searchValue + ": " + found);
        
        searchValue = 100;
        found = contains(numbers, searchValue);
        System.out.println("Array contains " + searchValue + ": " + found);
        
        // Test error handling
        System.out.println("\n--- Error Handling Demo ---");
        try {
            findMax(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
        
        try {
            findMax(new int[0]);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
