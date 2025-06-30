/**
 * 4-array_methods.java
 * 
 * This file demonstrates useful array operations and methods in Java.
 * Topics covered:
 * - Arrays.toString() for printing arrays
 * - Arrays.equals() for comparing arrays
 * - Arrays.copyOf() for copying arrays
 * - Arrays.fill() for filling arrays with values
 * - Finding min/max values in arrays
 * - Calculating sum and average
 * 
 * @author Alpha0-1
 */

import java.util.Arrays;

public class ArrayMethods {
    
    /**
     * Main method to demonstrate various array operations
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Array Methods Demonstration ===\n");
        
        // Initialize sample arrays for demonstration
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int[] copy1, copy2;
        
        // 1. Printing arrays using Arrays.toString()
        System.out.println("1. Array Printing:");
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        // 2. Copying arrays
        System.out.println("\n2. Array Copying:");
        copy1 = Arrays.copyOf(numbers, numbers.length);
        copy2 = Arrays.copyOf(numbers, 10); // Copy with extended length
        
        System.out.println("Exact copy: " + Arrays.toString(copy1));
        System.out.println("Extended copy: " + Arrays.toString(copy2));
        
        // 3. Comparing arrays
        System.out.println("\n3. Array Comparison:");
        System.out.println("Original equals copy1: " + Arrays.equals(numbers, copy1));
        System.out.println("Original equals copy2: " + Arrays.equals(numbers, copy2));
        
        // 4. Filling arrays
        System.out.println("\n4. Array Filling:");
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 7);
        System.out.println("Filled array: " + Arrays.toString(fillArray));
        
        // Partial fill
        Arrays.fill(fillArray, 1, 4, 99);
        System.out.println("Partially filled: " + Arrays.toString(fillArray));
        
        // 5. Finding minimum and maximum values
        System.out.println("\n5. Min/Max Operations:");
        int min = findMin(numbers);
        int max = findMax(numbers);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
        // 6. Sum and average calculations
        System.out.println("\n6. Statistical Operations:");
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + String.format("%.2f", average));
        
        // 7. Reversing an array
        System.out.println("\n7. Array Reversal:");
        int[] reversed = reverseArray(numbers);
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Reversed: " + Arrays.toString(reversed));
        
        // 8. Checking if array contains a value
        System.out.println("\n8. Value Search:");
        int searchValue = 8;
        boolean contains = containsValue(numbers, searchValue);
        System.out.println("Array contains " + searchValue + ": " + contains);
        
        // 9. Removing duplicates
        System.out.println("\n9. Duplicate Removal:");
        int[] withDuplicates = {1, 2, 2, 3, 4, 4, 5};
        int[] unique = removeDuplicates(withDuplicates);
        System.out.println("With duplicates: " + Arrays.toString(withDuplicates));
        System.out.println("Without duplicates: " + Arrays.toString(unique));
    }
    
    /**
     * Finds the minimum value in an integer array
     * 
     * @param array The input array
     * @return The minimum value
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
     * Finds the maximum value in an integer array
     * 
     * @param array The input array
     * @return The maximum value
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
     * Calculates the sum of all elements in an integer array
     * 
     * @param array The input array
     * @return The sum of all elements
     */
    public static int calculateSum(int[] array) {
        if (array == null) return 0;
        
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
    
    /**
     * Calculates the average of all elements in an integer array
     * 
     * @param array The input array
     * @return The average value
     * @throws IllegalArgumentException if array is null or empty
     */
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        return (double) calculateSum(array) / array.length;
    }
    
    /**
     * Creates a reversed copy of the input array
     * 
     * @param array The input array
     * @return A new array with elements in reverse order
     */
    public static int[] reverseArray(int[] array) {
        if (array == null) return null;
        
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    
    /**
     * Checks if an array contains a specific value
     * 
     * @param array The input array
     * @param value The value to search for
     * @return true if the value is found, false otherwise
     */
    public static boolean containsValue(int[] array, int value) {
        if (array == null) return false;
        
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Removes duplicate elements from a sorted array
     * Note: This method assumes the input array is sorted
     * 
     * @param array The input sorted array
     * @return A new array without duplicates
     */
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        
        // First, count unique elements
        int uniqueCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }
        
        // Create new array with unique elements
        int[] unique = new int[uniqueCount];
        unique[0] = array[0];
        int index = 1;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                unique[index++] = array[i];
            }
        }
        
        return unique;
    }
}
