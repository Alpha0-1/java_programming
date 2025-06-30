/**
 * 5-array_sorting.java
 * 
 * This file demonstrates various sorting algorithms and techniques in Java.
 * Topics covered:
 * - Built-in Arrays.sort() method
 * - Bubble Sort implementation
 * - Selection Sort implementation
 * - Insertion Sort implementation
 * - Quick Sort implementation
 * - Sorting with custom comparators
 * - Performance comparison
 * 
 * @author Alpha0-1
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArraySorting {
    
    /**
     * Main method to demonstrate various sorting techniques
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Array Sorting Demonstration ===\n");
        
        // Test with different array sizes and types
        int[] smallArray = {64, 34, 25, 12, 22, 11, 90};
        int[] mediumArray = generateRandomArray(20, 1, 100);
        
        // 1. Built-in sorting
        System.out.println("1. Built-in Arrays.sort():");
        demonstrateBuiltInSort(smallArray.clone());
        
        // 2. Bubble Sort
        System.out.println("\n2. Bubble Sort:");
        demonstrateBubbleSort(smallArray.clone());
        
        // 3. Selection Sort
        System.out.println("\n3. Selection Sort:");
        demonstrateSelectionSort(smallArray.clone());
        
        // 4. Insertion Sort
        System.out.println("\n4. Insertion Sort:");
        demonstrateInsertionSort(smallArray.clone());
        
        // 5. Quick Sort
        System.out.println("\n5. Quick Sort:");
        demonstrateQuickSort(smallArray.clone());
        
        // 6. Sorting with custom comparator (descending order)
        System.out.println("\n6. Custom Sorting (Descending):");
        demonstrateCustomSort(smallArray.clone());
        
        // 7. Performance comparison
        System.out.println("\n7. Performance Comparison:");
        performanceComparison(mediumArray);
        
        // 8. Sorting strings
        System.out.println("\n8. String Sorting:");
        demonstrateStringSorting();
    }
    
    /**
     * Demonstrates built-in Arrays.sort() method
     * 
     * @param array The array to sort
     */
    public static void demonstrateBuiltInSort(int[] array) {
        System.out.println("Original: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted:   " + Arrays.toString(array));
    }
    
    /**
     * Demonstrates Bubble Sort algorithm
     * Time Complexity: O(n²), Space Complexity: O(1)
     * 
     * @param array The array to sort
     */
    public static void demonstrateBubbleSort(int[] array) {
        System.out.println("Original: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted:   " + Arrays.toString(array));
    }
    
    /**
     * Implements Bubble Sort algorithm
     * Repeatedly steps through the list, compares adjacent elements and swaps them if wrong order
     * 
     * @param array The array to sort
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            
            // If no swapping occurred, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    /**
     * Demonstrates Selection Sort algorithm
     * Time Complexity: O(n²), Space Complexity: O(1)
     * 
     * @param array The array to sort
     */
    public static void demonstrateSelectionSort(int[] array) {
        System.out.println("Original: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Sorted:   " + Arrays.toString(array));
    }
    
    /**
     * Implements Selection Sort algorithm
     * Finds the minimum element and places it at the beginning
     * 
     * @param array The array to sort
     */
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }
    
    /**
     * Demonstrates Insertion Sort algorithm
     * Time Complexity: O(n²), Space Complexity: O(1)
     * 
     * @param array The array to sort
     */
    public static void demonstrateInsertionSort(int[] array) {
        System.out.println("Original: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Sorted:   " + Arrays.toString(array));
    }
    
    /**
     * Implements Insertion Sort algorithm
     * Builds the final sorted array one item at a time
     * 
     * @param array The array to sort
     */
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            
            // Move elements greater than key one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
        }
    }
    
    /**
     * Demonstrates Quick Sort algorithm
     * Time Complexity: O(n log n) average, O(n²) worst case
     * 
     * @param array The array to sort
     */
    public static void demonstrateQuickSort(int[] array) {
        System.out.println("Original: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted:   " + Arrays.toString(array));
    }
    
    /**
     * Implements Quick Sort algorithm (recursive)
     * Divides array into smaller sub-arrays around a pivot
     * 
     * @param array The array to sort
     * @param low Starting index
     * @param high Ending index
     */
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(array, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    /**
     * Partitions the array for Quick Sort
     * Places pivot element at correct position
     * 
     * @param array The array to partition
     * @param low Starting index
     * @param high Ending index
     * @return The index of pivot element
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose last element as pivot
        int i = low - 1; // Index of smaller element
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        
        swap(array, i + 1, high);
        return i + 1;
    }
    
    /**
     * Demonstrates custom sorting with Comparator (descending order)
     * 
     * @param array The array to sort
     */
    public static void demonstrateCustomSort(int[] array) {
        System.out.println("Original: " + Arrays.toString(array));
        
        // Convert to Integer array for custom comparator
        Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        
        // Sort in descending order
        Arrays.sort(integerArray, Comparator.reverseOrder());
        
        System.out.println("Descending: " + Arrays.toString(integerArray));
    }
    
    /**
     * Demonstrates string sorting with different criteria
     */
    public static void demonstrateStringSorting() {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String[] fruits = {"apple", "Banana", "cherry", "Date"};
        
        System.out.println("Names (default): " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Names (sorted): " + Arrays.toString(names));
        
        System.out.println("Fruits (original): " + Arrays.toString(fruits));
        Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Fruits (case-insensitive): " + Arrays.toString(fruits));
        
        // Sort by length
        String[] words = {"elephant", "cat", "dog", "butterfly", "ant"};
        System.out.println("Words (original): " + Arrays.toString(words));
        Arrays.sort(words, Comparator.comparing(String::length));
        System.out.println("Words (by length): " + Arrays.toString(words));
    }
    
    /**
     * Compares performance of different sorting algorithms
     * 
     * @param testArray The array to test with
     */
    public static void performanceComparison(int[] testArray) {
        System.out.println("Testing with array size: " + testArray.length);
        
        // Test each algorithm
        testSortingPerformance("Built-in Sort", testArray.clone(), ArraySorting::builtInSort);
        testSortingPerformance("Bubble Sort", testArray.clone(), ArraySorting::bubbleSort);
        testSortingPerformance("Selection Sort", testArray.clone(), ArraySorting::selectionSort);
        testSortingPerformance("Insertion Sort", testArray.clone(), ArraySorting::insertionSort);
        testSortingPerformance("Quick Sort", testArray.clone(), ArraySorting::quickSortWrapper);
    }
    
    /**
     * Tests performance of a sorting algorithm
     * 
     * @param algorithmName Name of the algorithm
     * @param array Array to sort
     * @param sortFunction Sorting function to test
     */
    private static void testSortingPerformance(String algorithmName, int[] array, SortFunction sortFunction) {
        long startTime = System.nanoTime();
        sortFunction.sort(array);
        long endTime = System.nanoTime();
        
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds
        System.out.printf("%-15s: %.2f ms%n", algorithmName, duration);
    }
    
    /**
     * Functional interface for sorting algorithms
     */
    @FunctionalInterface
    private interface SortFunction {
        void sort(int[] array);
    }
    
    // Wrapper methods for performance testing
    private static void builtInSort(int[] array) {
        Arrays.sort(array);
    }
    
    private static void quickSortWrapper(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    
    /**
     * Utility method to swap two elements in an array
     * 
     * @param array The array
     * @param i First index
     * @param j Second index
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /**
     * Generates a random array for testing
     * 
     * @param size Size of the array
     * @param min Minimum value
     * @param max Maximum value
     * @return Random integer array
     */
    private static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        
        return array;
    }
}
