/**
 * 6-array_searching.java
 * 
 * This file demonstrates various searching algorithms and techniques in Java.
 * Topics covered:
 * - Linear Search algorithm
 * - Binary Search algorithm (iterative and recursive)
 * - Built-in Arrays.binarySearch() method
 * - Search for multiple occurrences
 * - Search in 2D arrays
 * - Performance comparison between search algorithms
 * 
 * @author Alpha0-1
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArraySearching {
    
    /**
     * Main method to demonstrate various searching techniques
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Array Searching Demonstration ===\n");
        
        // Test arrays
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90, 25, 34};
        int[] sortedArray = {11, 12, 22, 25, 25, 34, 34, 64, 90};
        
        int searchValue = 25;
        
        // 1. Linear Search
        System.out.println("1. Linear Search:");
        demonstrateLinearSearch(unsortedArray, searchValue);
        
        // 2. Binary Search (Iterative)
        System.out.println("\n2. Binary Search (Iterative):");
        demonstrateBinarySearchIterative(sortedArray, searchValue);
        
        // 3. Binary Search (Recursive)
        System.out.println("\n3. Binary Search (Recursive):");
        demonstrateBinarySearchRecursive(sortedArray, searchValue);
        
        // 4. Built-in Binary Search
        System.out.println("\n4. Built-in Arrays.binarySearch():");
        demonstrateBuiltInBinarySearch(sortedArray, searchValue);
        
        // 5. Find all occurrences
        System.out.println("\n5. Find All Occurrences:");
        demonstrateFindAllOccurrences(sortedArray, searchValue);
        
        // 6. Search in 2D array
        System.out.println("\n6. Search in 2D Array:");
        demonstrate2DArraySearch();
        
        // 7. Performance comparison
        System.out.println("\n7. Performance Comparison:");
        performanceComparison();
        
        // 8. Advanced searching techniques
        System.out.println("\n8. Additional Search Operations:");
        demonstrateAdvancedSearching();
    }
    
    /**
     * Demonstrates Linear Search algorithm
     * Time Complexity: O(n), Space Complexity: O(1)
     * 
     * @param array The array to search
     * @param target The value to find
     */
    public static void demonstrateLinearSearch(int[] array, int target) {
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Searching for: " + target);
        
        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
    
    /**
     * Implements Linear Search algorithm
     * Searches through array sequentially until target is found
     * 
     * @param array The array to search
     * @param target The value to find
     * @return Index of target if found, -1 otherwise
     */
    public static int linearSearch(int[] array, int target) {
        if (array == null) return -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Demonstrates Binary Search (Iterative) algorithm
     * Time Complexity: O(log n), Space Complexity: O(1)
     * Note: Array must be sorted
     * 
     * @param array The sorted array to search
     * @param target The value to find
     */
    public static void demonstrateBinarySearchIterative(int[] array, int target) {
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Searching for: " + target);
        
        int index = binarySearchIterative(array, target);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
    
    /**
     * Implements Binary Search algorithm (iterative version)
     * Repeatedly divides search interval in half
     * 
     * @param array The sorted array to search
     * @param target The value to find
     * @return Index of target if found, -1 otherwise
     */
    public static int binarySearchIterative(int[] array, int target) {
        if (array == null) return -1;
        
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow
            
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    /**
     * Demonstrates Binary Search (Recursive) algorithm
     * 
     * @param array The sorted array to search
     * @param target The value to find
     */
    public static void demonstrateBinarySearchRecursive(int[] array, int target) {
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Searching for: " + target);
        
        int index = binarySearchRecursive(array, target, 0, array.length - 1);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
    
    /**
     * Implements Binary Search algorithm (recursive version)
     * 
     * @param array The sorted array to search
     * @param target The value to find
     * @param left Left boundary
     * @param right Right boundary
     * @return Index of target if found, -1 otherwise
     */
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (array == null || left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return binarySearchRecursive(array, target, mid + 1, right);
        } else {
            return binarySearchRecursive(array, target, left, mid - 1);
        }
    }
    
    /**
     * Demonstrates built-in Arrays.binarySearch() method
     * 
     * @param array The sorted array to search
     * @param target The value to find
     */
    public static void demonstrateBuiltInBinarySearch(int[] array, int target) {
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Searching for: " + target);
        
        int result = Arrays.binarySearch(array, target);
        if (result >= 0) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found. Insertion point: " + (-result - 1));
        }
    }
    
    /**
     * Demonstrates finding all occurrences of a value
     * 
     * @param array The array to search
     * @param target The value to find
     */
    public static void demonstrateFindAllOccurrences(int[] array, int target) {
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Searching for all occurrences of: " + target);
        
        List<Integer> indices = findAllOccurrences(array, target);
        if (!indices.isEmpty()) {
            System.out.println("Found at indices: " + indices);
        } else {
            System.out.println("Not found");
        }
    }
    
    /**
     * Finds all occurrences of a target value in an array
     * 
     * @param array The array to search
     * @param target The value to find
     * @return List of indices where target is found
     */
    public static List<Integer> findAllOccurrences(int[] array, int target) {
        List<Integer> indices = new ArrayList<>();
        
        if (array == null) return indices;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indices.add(i);
            }
        }
        
        return indices;
    }
    
    /**
     * Demonstrates searching in a 2D array
     */
    public static void demonstrate2DArraySearch() {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        
        int target = 5;
        
        System.out.println("2D Array:");
        print2DArray(matrix);
        System.out.println("Searching for: " + target);
        
        int[] position = search2D(matrix, target);
        if (position != null) {
            System.out.println("Found at position: [" + position[0] + ", " + position[1] + "]");
        } else {
            System.out.println("Not found");
        }
        
        // Search in sorted 2D array (optimized)
        System.out.println("Optimized search in sorted matrix:");
        int[] optimizedPosition = searchSorted2D(matrix, target);
        if (optimizedPosition != null) {
            System.out.println("Found at position: [" + optimizedPosition[0] + ", " + optimizedPosition[1] + "]");
        } else {
            System.out.println("Not found");
        }
    }
    
    /**
     * Searches for a value in a 2D array (brute force)
     * Time Complexity: O(m*n)
     * 
     * @param matrix The 2D array to search
     * @param target The value to find
     * @return Array containing [row, col] if found, null otherwise
     */
    public static int[] search2D(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return null;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        
        return null;
    }
    
    /**
     * Searches for a value in a sorted 2D array (optimized)
     * Time Complexity: O(m+n) for row-wise and column-wise sorted matrix
     * 
     * @param matrix The sorted 2D array to search
     * @param target The value to find
     * @return Array containing [row, col] if found, null otherwise
     */
    public static int[] searchSorted2D(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return null;
        
        int row = 0;
        int col = matrix[0].length - 1; // Start from top-right corner
        
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        
        return null;
    }
    
    /**
     * Compares performance of different searching algorithms
     */
    public static void performanceComparison() {
        int[] largeArray = generateSortedArray(100000);
        int target = largeArray[75000]; // Target exists in array
        
        System.out.println("Testing with array size: " + largeArray.length);
        
        // Linear Search
        long startTime = System.nanoTime();
        int linearResult = linearSearch(largeArray, target);
        long linearTime = System.nanoTime() - startTime;
        
        // Binary Search (Iterative)
        startTime = System.nanoTime();
        int binaryResult = binarySearchIterative(largeArray, target);
        long binaryTime = System.nanoTime() - startTime;
        
        // Built-in Binary Search
        startTime = System.nanoTime();
        int builtInResult = Arrays.binarySearch(largeArray, target);
        long builtInTime = System.nanoTime() - startTime;
        
        System.out.printf("Linear Search:    %.2f ms (index: %d)%n", linearTime / 1_000_000.0, linearResult);
        System.out.printf("Binary Search:    %.2f ms (index: %d)%n", binaryTime / 1_000_000.0, binaryResult);
        System.out.printf("Built-in Search:  %.2f ms (index: %d)%n", builtInTime / 1_000_000.0, builtInResult);
    }
    
    /**
     * Demonstrates additional advanced searching techniques
     */
    public static void demonstrateAdvancedSearching() {
        int[] array = {3, 7, 12, 15, 22, 28, 35, 42, 51, 67};
        
        System.out.println("Array: " + Arrays.toString(array));
        
        // Find first occurrence in sorted array with duplicates
        int[] arrayWithDuplicates = {1, 2, 2, 2, 3, 4, 4, 5};
        System.out.println("Array with duplicates: " + Arrays.toString(arrayWithDuplicates));
        
        int target = 2;
        int firstOccurrence = findFirstOccurrence(arrayWithDuplicates, target);
        int lastOccurrence = findLastOccurrence(arrayWithDuplicates, target);
        
        System.out.println("First occurrence of " + target + ": " + firstOccurrence);
        System.out.println("Last occurrence of " + target + ": " + lastOccurrence);
        
        // Find closest element
        int value = 20;
        int closest = findClosestElement(array, value);
        System.out.println("Closest element to " + value + ": " + array[closest] + " at index " + closest);
        
        // Search for range
        int min = 15, max = 35;
        List<Integer> range = findElementsInRange(array, min, max);
        System.out.println("Elements between " + min + " and " + max + ": " + range);
    }
    
    /**
     * Finds the first occurrence of target in a sorted array
     * 
     * @param array Sorted array
     * @param target Value to find
     * @return Index of first occurrence, -1 if not found
     */
    public static int findFirstOccurrence(int[] array, int target) {
        int left = 0, right = array.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching in left half
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    /**
     * Finds the last occurrence of target in a sorted array
     * 
     * @param array Sorted array
     * @param target Value to find
     * @return Index of last occurrence, -1 if not found
     */
    public static int findLastOccurrence(int[] array, int target) {
        int left = 0, right = array.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching in right half
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    /**
     * Finds the element closest to the given value
     * 
     * @param array Sorted array
     * @param target Target value
     * @return Index of closest element
     */
    public static int findClosestElement(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        
        int left = 0, right = array.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        // Check if the previous element is closer
        if (left > 0 && Math.abs(array[left - 1] - target) < Math.abs(array[left] - target)) {
            return left - 1;
        }
        
        return left;
    }
    
    /**
     * Finds all elements within a given range
     * 
     * @param array Sorted array
     * @param min Minimum value (inclusive)
     * @param max Maximum value (inclusive)
     * @return List of elements in range
     */
    public static List<Integer> findElementsInRange(int[] array, int min, int max) {
        List<Integer> result = new ArrayList<>();
        
        if (array == null) return result;
        
        for (int value : array) {
            if (value >= min && value <= max) {
                result.add(value);
            } else if (value > max) {
                break; // Array is sorted, no more elements will be in range
            }
        }
        
        return result;
    }
    
    /**
     * Utility method to print a 2D array
     * 
     * @param matrix The 2D array to print
     */
    private static void print2DArray(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    /**
     * Generates a sorted array for testing
     * 
     * @param size Size of the array
     * @return Sorted integer array
     */
    private static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i * 2; // Generate sorted array with even numbers
        }
        return array;
    }
}
