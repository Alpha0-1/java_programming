/**
 * File: 1-array_access.java
 * Topic: Accessing Array Elements
 * 
 * This file demonstrates how to access, modify, and safely handle array elements.
 * Learn about indexing, bounds checking, and common access patterns.
 * 
 * Author: Alpha0-1
 */

public class ArrayAccess {
    
    /**
     * Main method to demonstrate array element access
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Array Element Access Examples ===\n");
        
        // Example 1: Basic element access
        demonstrateBasicAccess();
        
        // Example 2: Modifying array elements
        demonstrateElementModification();
        
        // Example 3: Safe access with bounds checking
        demonstrateSafeAccess();
        
        // Example 4: Working with array properties
        demonstrateArrayProperties();
        
        // Example 5: Real-world access patterns
        demonstrateRealWorldPatterns();
    }
    
    /**
     * Demonstrates basic array element access
     */
    public static void demonstrateBasicAccess() {
        System.out.println("1. Basic Array Element Access:");
        
        // Create and initialize an array
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        
        // Access elements using zero-based indexing
        System.out.println("   - First planet (index 0): " + planets[0]);
        System.out.println("   - Third planet (index 2): " + planets[2]);
        System.out.println("   - Last planet (index " + (planets.length - 1) + "): " + planets[planets.length - 1]);
        
        // Access using variables as indices
        int homeIndex = 2;
        System.out.println("   - Our home planet: " + planets[homeIndex]);
        System.out.println();
    }
    
    /**
     * Demonstrates modifying array elements
     */
    public static void demonstrateElementModification() {
        System.out.println("2. Modifying Array Elements:");
        
        // Create array of student scores
        int[] scores = {85, 92, 78, 88, 95};
        System.out.println("   - Original scores: " + java.util.Arrays.toString(scores));
        
        // Modify individual elements
        scores[2] = 82;  // Update third student's score
        scores[4] = 98;  // Update fifth student's score
        System.out.println("   - Updated scores:  " + java.util.Arrays.toString(scores));
        
        // Increment/decrement operations
        scores[0] += 5;  // Bonus points for first student
        scores[1] -= 2;  // Penalty for second student
        System.out.println("   - After adjustments: " + java.util.Arrays.toString(scores));
        
        // Bulk modification example
        System.out.println("   - Applying grade curve (+3 points to all):");
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 3;
            System.out.println("     Student " + (i + 1) + ": " + scores[i]);
        }
        System.out.println();
    }
    
    /**
     * Demonstrates safe array access with bounds checking
     */
    public static void demonstrateSafeAccess() {
        System.out.println("3. Safe Array Access (Bounds Checking):");
        
        double[] temperatures = {23.5, 25.0, 22.8, 26.2, 24.1};
        
        // Safe access method
        System.out.println("   - Temperature readings:");
        for (int day = 0; day < 7; day++) {  // Intentionally go beyond array bounds
            double temp = getSafeTemperature(temperatures, day);
            if (temp != -999.0) {
                System.out.println("     Day " + (day + 1) + ": " + temp + "°C");
            } else {
                System.out.println("     Day " + (day + 1) + ": No data available");
            }
        }
        
        // Demonstrate exception handling
        demonstrateExceptionHandling(temperatures);
        System.out.println();
    }
    
    /**
     * Safe method to access array elements
     * @param arr The array to access
     * @param index The index to access
     * @return The element at index, or -999.0 if index is invalid
     */
    public static double getSafeTemperature(double[] arr, int index) {
        if (arr == null) {
            System.out.println("     Warning: Array is null");
            return -999.0;
        }
        
        if (index < 0 || index >= arr.length) {
            return -999.0;  // Return sentinel value for invalid index
        }
        
        return arr[index];
    }
    
    /**
     * Demonstrates exception handling for array access
     * @param temperatures Array of temperatures
     */
    public static void demonstrateExceptionHandling(double[] temperatures) {
        System.out.println("   - Exception handling example:");
        
        int[] testIndices = {0, 2, 5, -1, 10};
        
        for (int index : testIndices) {
            try {
                double temp = temperatures[index];
                System.out.println("     Index " + index + ": " + temp + "°C");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("     Index " + index + ": Invalid index (out of bounds)");
            }
        }
    }
    
    /**
     * Demonstrates array properties and useful methods
     */
    public static void demonstrateArrayProperties() {
        System.out.println("4. Array Properties and Information:");
        
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        
        // Array length property
        System.out.println("   - Array length: " + alphabet.length);
        System.out.println("   - Valid indices: 0 to " + (alphabet.length - 1));
        System.out.println("   - First element: " + alphabet[0]);
        System.out.println("   - Last element: " + alphabet[alphabet.length - 1]);
        
        // Check if array is empty
        int[] emptyArray = new int[0];
        System.out.println("   - Empty array length: " + emptyArray.length);
        System.out.println("   - Is empty: " + (emptyArray.length == 0));
        
        // Array reference vs null
        int[] nullArray = null;
        System.out.println("   - Null array comparison:");
        System.out.println("     emptyArray == null: " + (emptyArray == null));
        System.out.println("     nullArray == null: " + (nullArray == null));
        System.out.println();
    }
    
    /**
     * Demonstrates real-world array access patterns
     */
    public static void demonstrateRealWorldPatterns() {
        System.out.println("5. Real-World Access Patterns:");
        
        // Student management system example
        String[] students = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Wilson", "Eva Brown"};
        int[] grades = {88, 92, 85, 78, 95};
        
        // Pattern 1: Finding specific elements
        String searchName = "Carol Davis";
        int studentIndex = findStudentIndex(students, searchName);
        if (studentIndex != -1) {
            System.out.println("   - " + searchName + " found at index " + studentIndex);
            System.out.println("   - Grade: " + grades[studentIndex]);
        } else {
            System.out.println("   - Student not found: " + searchName);
        }
        
        // Pattern 2: Conditional access and modification
        System.out.println("   - Students with grades above 90:");
        for (int i = 0; i < students.length; i++) {
            if (grades[i] > 90) {
                System.out.println("     " + students[i] + ": " + grades[i]);
            }
        }
        
        // Pattern 3: Accessing array segments
        System.out.println("   - Top 3 students by index:");
        int topCount = Math.min(3, students.length);
        for (int i = 0; i < topCount; i++) {
            System.out.println("     " + (i + 1) + ". " + students[i] + " (" + grades[i] + ")");
        }
        
        // Pattern 4: Reverse access
        System.out.println("   - Students in reverse order:");
        for (int i = students.length - 1; i >= 0; i--) {
            System.out.println("     " + students[i]);
        }
        System.out.println();
        
        // Pattern 5: Statistical access
        calculateAndDisplayStats(grades);
    }
    
    /**
     * Finds the index of a student in the array
     * @param students Array of student names
     * @param name Name to search for
     * @return Index of the student, or -1 if not found
     */
    public static int findStudentIndex(String[] students, String name) {
        if (students == null || name == null) {
            return -1;
        }
        
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Calculates and displays statistics from an array of grades
     * @param grades Array of student grades
     */
    public static void calculateAndDisplayStats(int[] grades) {
        if (grades == null || grades.length == 0) {
            System.out.println("   - No grades to analyze");
            return;
        }
        
        System.out.println("   - Grade Statistics:");
        
        // Find min and max
        int min = grades[0];
        int max = grades[0];
        int sum = grades[0];
        
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) min = grades[i];
            if (grades[i] > max) max = grades[i];
            sum += grades[i];
        }
        
        double average = (double) sum / grades.length;
        
        System.out.println("     Minimum: " + min);
        System.out.println("     Maximum: " + max);
        System.out.println("     Average: " + String.format("%.2f", average));
        System.out.println("     Range: " + (max - min));
    }
}
