/**
 * File: 0-array_declaration.java
 * Topic: Array Declaration and Initialization
 * 
 * This file demonstrates various ways to declare and initialize arrays in Java.
 * Arrays are fundamental data structures that store multiple elements of the same type.
 * 
 * Author: Alpha0-1
 */

public class ArrayDeclaration {
    
    /**
     * Main method to demonstrate array declaration and initialization
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Array Declaration and Initialization Examples ===\n");
        
        // Example 1: Different ways to declare arrays
        demonstrateArrayDeclaration();
        
        // Example 2: Array initialization with values
        demonstrateArrayInitialization();
        
        // Example 3: Working with different data types
        demonstrateDifferentDataTypes();
        
        // Example 4: Common mistakes and best practices
        demonstrateBestPractices();
    }
    
    /**
     * Demonstrates various ways to declare arrays
     */
    public static void demonstrateArrayDeclaration() {
        System.out.println("1. Array Declaration Methods:");
        
        // Method 1: Declare and allocate memory separately
        int[] numbers1;           // Declaration
        numbers1 = new int[5];    // Memory allocation
        
        // Method 2: Declare and allocate in one line
        int[] numbers2 = new int[5];
        
        // Method 3: Alternative syntax (less common)
        int numbers3[] = new int[5];
        
        System.out.println("   - Declared three integer arrays of size 5");
        System.out.println("   - Default values: " + java.util.Arrays.toString(numbers2));
        System.out.println();
    }
    
    /**
     * Demonstrates array initialization with values
     */
    public static void demonstrateArrayInitialization() {
        System.out.println("2. Array Initialization with Values:");
        
        // Method 1: Initialize with specific values
        int[] scores = {85, 92, 78, 96, 88};
        System.out.println("   - Exam scores: " + java.util.Arrays.toString(scores));
        
        // Method 2: Initialize with new keyword
        String[] names = new String[]{"Alice", "Bob", "Charlie", "Diana"};
        System.out.println("   - Student names: " + java.util.Arrays.toString(names));
        
        // Method 3: Initialize and populate programmatically
        double[] temperatures = new double[7];
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = 20.0 + (Math.random() * 15); // Random temps 20-35°C
        }
        System.out.println("   - Weekly temperatures: " + formatDoubleArray(temperatures));
        System.out.println();
    }
    
    /**
     * Demonstrates arrays with different data types
     */
    public static void demonstrateDifferentDataTypes() {
        System.out.println("3. Arrays with Different Data Types:");
        
        // Primitive types
        boolean[] flags = {true, false, true, false};
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        long[] populations = {1000000L, 2500000L, 850000L};
        
        // Object types
        String[] cities = {"New York", "London", "Tokyo", "Sydney"};
        Integer[] boxedNumbers = {10, 20, 30, 40, 50}; // Wrapper class
        
        System.out.println("   - Boolean flags: " + java.util.Arrays.toString(flags));
        System.out.println("   - Grade letters: " + java.util.Arrays.toString(grades));
        System.out.println("   - City populations: " + java.util.Arrays.toString(populations));
        System.out.println("   - World cities: " + java.util.Arrays.toString(cities));
        System.out.println("   - Boxed integers: " + java.util.Arrays.toString(boxedNumbers));
        System.out.println();
    }
    
    /**
     * Demonstrates best practices and common mistakes
     */
    public static void demonstrateBestPractices() {
        System.out.println("4. Best Practices and Common Mistakes:");
        
        // Best Practice 1: Use meaningful variable names
        int[] studentAges = new int[30];        // Good
        int[] arr = new int[30];                // Poor naming
        
        // Best Practice 2: Initialize arrays properly
        String[] validNames = new String[5];
        for (int i = 0; i < validNames.length; i++) {
            validNames[i] = "Student" + (i + 1);
        }
        
        // Best Practice 3: Check array bounds
        int[] data = {10, 20, 30};
        int index = 2;
        if (index >= 0 && index < data.length) {
            System.out.println("   - Safe access: data[" + index + "] = " + data[index]);
        }
        
        // Best Practice 4: Use final for immutable array references
        final int[] CONSTANTS = {100, 200, 300};
        // CONSTANTS = new int[5]; // This would cause compilation error
        CONSTANTS[0] = 150; // But we can still modify elements
        
        System.out.println("   - Modified constants: " + java.util.Arrays.toString(CONSTANTS));
        System.out.println("   - Always use meaningful names and check bounds!");
        System.out.println();
        
        // Demonstrate null safety
        demonstrateNullSafety();
    }
    
    /**
     * Demonstrates null safety when working with arrays
     */
    public static void demonstrateNullSafety() {
        System.out.println("5. Null Safety Example:");
        
        String[] names = null;
        
        // Safe way to check before using
        if (names != null && names.length > 0) {
            System.out.println("   - Array has " + names.length + " elements");
        } else {
            System.out.println("   - Array is null or empty - initializing...");
            names = new String[]{"Default", "Values"};
            System.out.println("   - Initialized: " + java.util.Arrays.toString(names));
        }
    }
    
    /**
     * Utility method to format double arrays with 2 decimal places
     * @param arr The double array to format
     * @return Formatted string representation
     */
    private static String formatDoubleArray(double[] arr) {
        if (arr == null) return "null";
        
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(String.format("%.1f°C", arr[i]));
        }
        sb.append("]");
        return sb.toString();
    }
}
