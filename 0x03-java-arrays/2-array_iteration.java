/**
 * File: 2-array_iteration.java
 * Topic: Iterating Through Arrays
 * 
 * This file demonstrates various ways to iterate through arrays in Java.
 * Learn different loop types, iteration patterns, and performance considerations.
 * 
 * Author: Alpha0-1
 */

public class ArrayIteration {
    
    /**
     * Main method to demonstrate array iteration techniques
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Array Iteration Examples ===\n");
        
        // Example 1: Traditional for loop
        demonstrateTraditionalForLoop();
        
        // Example 2: Enhanced for loop (for-each)
        demonstrateEnhancedForLoop();
        
        // Example 3: While and do-while loops
        demonstrateWhileLoops();
        
        // Example 4: Specialized iteration patterns
        demonstrateSpecialPatterns();
        
        // Example 5: Performance comparison and best practices
        demonstratePerformanceConsiderations();
    }
    
    /**
     * Demonstrates traditional for loop iteration
     */
    public static void demonstrateTraditionalForLoop() {
        System.out.println("1. Traditional For Loop Iteration:");
        
        int[] numbers = {10, 25, 30, 45, 50, 65, 70, 85, 90, 100};
        
        // Basic forward iteration
        System.out.println("   - Forward iteration:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("     numbers[" + i + "] = " + numbers[i]);
            if (i < numbers.length - 1) System.out.print(", ");
        }
        System.out.println();
        
        // Backward iteration
        System.out.println("   - Backward iteration:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print("     " + numbers[i]);
            if (i > 0) System.out.print(" <- ");
        }
        System.out.println();
        
        // Step iteration (every other element)
        System.out.println("   - Every other element (step = 2):");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print("     " + numbers[i] + " ");
        }
        System.out.println();
        
        // Conditional iteration with modification
        System.out.println("   - Doubling even numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] *= 2;
                System.out.print("     Doubled: " + numbers[i] + " ");
            }
        }
        System.out.println("\n");
    }
    
    /**
     * Demonstrates enhanced for loop (for-each) iteration
     */
    public static void demonstrateEnhancedForLoop() {
        System.out.println("2. Enhanced For Loop (For-Each) Iteration:");
        
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        
        // Basic for-each iteration
        System.out.println("   - Simple for-each iteration:");
        for (String fruit : fruits) {
            System.out.println("     - " + fruit);
        }
        
        // For-each with processing
        System.out.println("   - Processing during iteration:");
        int totalLength = 0;
        for (String fruit : fruits) {
            System.out.println("     " + fruit + " (length: " + fruit.length() + ")");
            totalLength += fruit.length();
        }
        System.out.println("     Total characters: " + totalLength);
        
        // For-each limitations example
        System.out.println("   - For-each limitations (cannot modify original array):");
        double[] prices = {1.99, 2.49, 3.75, 4.25, 5.50};
        System.out.println("     Original prices: " + java.util.Arrays.toString(prices));
        
        // This won't modify the original array
        for (double price : prices) {
            price *= 1.1; // Attempting to increase by 10%
        }
        System.out.println("     After for-each 'modification': " + java.util.Arrays.toString(prices));
        System.out.println("     Note: Original array unchanged - for-each works with copies");
        System.out.println();
    }
    
    /**
     * Demonstrates while and do-while loop iteration
     */
    public static void demonstrateWhileLoops() {
        System.out.println("3. While and Do-While Loop Iteration:");
        
        int[] values = {5, 12, 8, 23, 15, 30, 7, 18};
        
        // While loop iteration
        System.out.println("   - While loop - finding first value > 20:");
        int index = 0;
        while (index < values.length) {
            System.out.println("     Checking index " + index + ": " + values[index]);
            if (values[index] > 20) {
                System.out.println("     Found value > 20: " + values[index] + " at index " + index);
                break;
            }
            index++;
        }
        
        // Do-while loop iteration
        System.out.println("   - Do-while loop - processing until condition met:");
        index = 0;
        int sum = 0;
        do {
            sum += values[index];
            System.out.println("     Added " + values[index] + ", running sum: " + sum);
            index++;
        } while (index < values.length && sum < 50);
        
        System.out.println("     Final sum: " + sum);
        System.out.println();
    }
    
    /**
     * Demonstrates specialized iteration patterns
     */
    public static void demonstrateSpecialPatterns() {
        System.out.println("4. Specialized Iteration Patterns:");
        
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        
        // Pattern 1: Nested loops for combinations
        System.out.println("   - Pattern 1: All possible pairs:");
        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                System.out.print("     " + letters[i] + letters[j] + " ");
                if ((j - i) % 4 == 0 && j != i + 1) System.out.println(); // Line break every 4 pairs
            }
        }
        System.out.println();
        
        // Pattern 2: Multiple arrays iteration
        System.out.println("   - Pattern 2: Parallel array iteration:");
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        int[] ages = {25, 30, 35, 28};
        String[] cities = {"NYC", "LA", "Chicago", "Miami"};
        
        for (int i = 0; i < Math.min(Math.min(names.length, ages.length), cities.length); i++) {
            System.out.println("     " + names[i] + " (age " + ages[i] + ") lives in " + cities[i]);
        }
        
        // Pattern 3: Conditional skipping
        System.out.println("   - Pattern 3: Skip even indices:");
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                continue; // Skip even indices
            }
            System.out.println("     Odd index " + i + ": " + data[i]);
        }
        
        // Pattern 4: Early termination
        System.out.println("   - Pattern 4: Early termination on condition:");
        int[] searchArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        boolean found = false;
        
        for (int i = 0; i < searchArray.length; i++) {
            System.out.println("     Checking: " + searchArray[i]);
            if (searchArray[i] == target) {
                System.out.println("     Target " + target + " found at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("     Target " + target + " not found");
        }
        System.out.println();
    }
    
    /**
     * Demonstrates performance considerations and best practices
     */
    public static void demonstratePerformanceConsiderations() {
        System.out.println("5. Performance Considerations and Best Practices:");
        
        // Create a large array for testing
        int[] largeArray = new int[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i * 2;
        }
        
        // Test different iteration methods
        System.out.println("   - Performance comparison (processing 1M elements):");
        
        // Method 1: Traditional for loop
        long startTime = System.nanoTime();
        long sum1 = 0;
        for (int i = 0; i < largeArray.length; i++) {
            sum1 += largeArray[i];
        }
        long endTime = System.nanoTime();
        System.out.println("     Traditional for loop: " + (endTime - startTime) / 1_000_000 + " ms");
        
        // Method 2: Enhanced for loop
        startTime = System.nanoTime();
        long sum2 = 0;
        for (int value : largeArray) {
            sum2 += value;
        }
        endTime = System.nanoTime();
        System.out.println("     Enhanced for loop:    " + (endTime - startTime) / 1_000_000 + " ms");
        
        // Method 3: While loop
        startTime = System.nanoTime();
        long sum3 = 0;
        int index = 0;
        while (index < largeArray.length) {
            sum3 += largeArray[index];
            index++;
        }
        endTime = System.nanoTime();
        System.out.println("     While loop:           " + (endTime - startTime) / 1_000_000 + " ms");
        
        // Verify all methods produce same result
        System.out.println("     Results match: " + (sum1 == sum2 && sum2 == sum3));
        
        // Best practices demonstration
        demonstrateBestPractices();
    }
    
    /**
     * Demonstrates iteration best practices
     */
    public static void demonstrateBestPractices() {
        System.out.println("   - Best Practices:");
        
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Practice 1: Cache array length when modifying the array
        System.out.println("     1. Cache array length for better performance:");
        int length = numbers.length; // Cache length
        for (int i = 0; i < length; i++) {
            numbers[i] *= 2;
        }
        System.out.println("        Result: " + java.util.Arrays.toString(numbers));
        
        // Practice 2: Use enhanced for-loop when index not needed
        System.out.println("     2. Use for-each when index is not needed:");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("        Sum: " + sum);
        
        // Practice 3: Null check before iteration
        System.out.println("     3. Always check for null arrays:");
        int[] nullArray = null;
        safeIteration(nullArray);
        safeIteration(numbers);
        
        // Practice 4: Consider memory usage for very large arrays
        System.out.println("     4. Memory-conscious iteration for large datasets:");
        demonstrateMemoryEfficientIteration();
    }
    
    /**
     * Safely iterates through an array with null checking
     * @param array The array to iterate (may be null)
     */
    public static void safeIteration(int[] array) {
        if (array == null) {
            System.out.println("        Array is null - skipping iteration");
            return;
        }
        
        if (array.length == 0) {
            System.out.println("        Array is empty - no elements to iterate");
            return;
        }
        
        System.out.print("        Safe iteration result: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    /**
     * Demonstrates memory-efficient iteration for large datasets
     */
    public static void demonstrateMemoryEfficientIteration() {
        // Simulate processing large dataset in chunks
        int totalElements = 100;
        int chunkSize = 10;
        
        System.out.println("        Processing " + totalElements + " elements in chunks of " + chunkSize + ":");
        
        for (int start = 0; start < totalElements; start += chunkSize) {
            int end = Math.min(start + chunkSize, totalElements);
            
            // Create smaller array for processing
            int[] chunk = new int[end - start];
            for (int i = 0; i < chunk.length; i++) {
                chunk[i] = start + i + 1; // Simulate data
            }
            
            // Process chunk
            int chunkSum = 0;
            for (int value : chunk) {
                chunkSum += value;
            }
            
            System.out.println("          Chunk " + (start / chunkSize + 1) + 
                             " (elements " + (start + 1) + "-" + end + "): sum = " + chunkSum);
            
            // Chunk goes out of scope and can be garbage collected
        }
    }
}
