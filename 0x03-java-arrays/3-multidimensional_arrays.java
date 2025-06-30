/**
 * File: 3-multidimensional_arrays.java
 * Topic: Multidimensional Arrays (2D and 3D)
 * 
 * This file demonstrates working with multidimensional arrays in Java.
 * Learn about 2D arrays (matrices), 3D arrays, and their practical applications.
 * 
 * Author: Alpha0-1
 */

public class MultidimensionalArrays {
    
    /**
     * Main method to demonstrate multidimensional array operations
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Multidimensional Arrays Examples ===\n");
        
        // Example 1: 2D Array basics
        demonstrate2DArrayBasics();
        
        // Example 2: 2D Array practical applications
        demonstrate2DArrayApplications();
        
        // Example 3: Jagged arrays
        demonstrateJaggedArrays();
        
        // Example 4: 3D Arrays
        demonstrate3DArrays();
        
        // Example 5: Advanced operations
        demonstrateAdvancedOperations();
    }
    
    /**
     * Demonstrates 2D array declaration, initialization, and basic operations
     */
    public static void demonstrate2DArrayBasics() {
        System.out.println("1. 2D Array Basics:");
        
        // Declaration and initialization methods
        System.out.println("   - Declaration and Initialization:");
        
        // Method 1: Declare and allocate
        int[][] matrix1 = new int[3][4]; // 3 rows, 4 columns
        System.out.println("     Empty 3x4 matrix created");
        
        // Method 2: Initialize with values
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println("     Initialized 3x4 matrix:");
        print2DArray(matrix2);
        
        // Method 3: Mixed initialization
        int[][] matrix3 = new int[2][3];
        matrix3[0] = new int[]{10, 20, 30};
        matrix3[1] = new int[]{40, 50, 60};
        System.out.println("     Mixed initialization 2x3 matrix:");
        print2DArray(matrix3);
        
        // Basic access and modification
        System.out.println("   - Element Access and Modification:");
        System.out.println("     Original element [1][2]: " + matrix2[1][2]);
        matrix2[1][2] = 99;
        System.out.println("     Modified element [1][2]: " + matrix2[1][2]);
        
        // Array dimensions
        System.out.println("   - Array Dimensions:");
        System.out.println("     Rows (length): " + matrix2.length);
        System.out.println("     Columns (length of first row): " + matrix2[0].length);
        System.out.println();
    }
    
    /**
     * Demonstrates practical applications of 2D arrays
     */
    public static void demonstrate2DArrayApplications() {
        System.out.println("2. 2D Array Practical Applications:");
        
        // Application 1: Grade book
        System.out.println("   - Application 1: Student Grade Book");
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        String[] subjects = {"Math", "Science", "English", "History"};
        int[][] grades = {
            {88, 92, 85, 90},  // Alice's grades
            {75, 88, 92, 80},  // Bob's grades
            {95, 87, 88, 93},  // Charlie's grades
            {82, 90, 86, 88}   // Diana's grades
        };
        
        displayGradeBook(students, subjects, grades);
        
        // Application 2: Tic-tac-toe board
        System.out.println("   - Application 2: Tic-Tac-Toe Board");
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {' ', 'X', 'O'}
        };
        displayTicTacToeBoard(board);
        
        // Application 3: Image pixel representation (simplified)
        System.out.println("   - Application 3: Image Pixel Representation (8x8 grayscale)");
        int[][] pixels = generateSampleImage(8, 8);
        displayImage(pixels);
        System.out.println();
    }
    
    /**
     * Demonstrates jagged arrays (arrays of arrays with different lengths)
     */
    public static void demonstrateJaggedArrays() {
        System.out.println("3. Jagged Arrays (Irregular Arrays):");
        
        // Create jagged array
        int[][] jaggedArray = new int[4][];
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5, 6, 7, 8};
        jaggedArray[2] = new int[]{9, 10};
        jaggedArray[3] = new int[]{11, 12, 13, 14};
        
        System.out.println("   - Jagged Array Structure:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("     Row " + i + " (length " + jaggedArray[i].length + "): ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        // Practical example: Monthly sales data (different months have different days)
        System.out.println("   - Practical Example: Monthly Sales Data");
        String[] months = {"January", "February", "March"};
        double[][] monthlySales = {
            {1200.50, 1350.75, 1100.00, 1450.25}, // January (4 weeks)
            {1300.00, 1250.50, 1400.75},          // February (3 weeks)
            {1500.00, 1600.25, 1350.50, 1475.00, 1520.75} // March (5 weeks)
        };
        
        for (int i = 0; i < months.length; i++) {
            double monthTotal = 0;
            System.out.print("     " + months[i] + " sales: ");
            for (int j = 0; j < monthlySales[i].length; j++) {
                System.out.printf("$%.2f ", monthlySales[i][j]);
                monthTotal += monthlySales[i][j];
            }
            System.out.printf("(Total: $%.2f)\n", monthTotal);
        }
        System.out.println();
    }
    
    /**
     * Demonstrates 3D arrays
     */
    public static void demonstrate3DArrays() {
        System.out.println("4. 3D Arrays:");
        
        // Create 3D array: [floors][rows][columns]
        int[][][] building = new int[3][4][5]; // 3 floors, 4 rows, 5 columns per floor
        
        // Initialize with room numbers
        int roomNumber = 101;
        for (int floor = 0; floor < building.length; floor++) {
            for (int row = 0; row < building[floor].length; row++) {
                for (int col = 0; col < building[floor][row].length; col++) {
                    building[floor][row][col] = roomNumber++;
                }
            }
        }
        
        System.out.println("   - 3D Array Example: Office Building Room Numbers");
        for (int floor = 0; floor < building.length; floor++) {
            System.out.println("     Floor " + (floor + 1) + ":");
            for (int row = 0; row < building[floor].length; row++) {
                System.out.print("       Row " + (row + 1) + ": ");
                for (int col = 0; col < building[floor][row].length; col++) {
                    System.out.printf("%4d ", building[floor][row][col]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
        // Practical example: RGB color cube
        System.out.println("   - Practical Example: RGB Color Data (2x2x3 sample)");
        int[][][] colorData = {
            { // Pixel row 1
                {255, 0, 0},    // Red pixel
                {0, 255, 0}     // Green pixel
            },
            { // Pixel row 2
                {0, 0, 255},    // Blue pixel
                {255, 255, 0}   // Yellow pixel
            }
        };
        
        for (int row = 0; row < colorData.length; row++) {
            for (int col = 0; col < colorData[row].length; col++) {
                System.out.printf("     Pixel[%d][%d]: RGB(%d, %d, %d)\n", 
                    row, col, 
                    colorData[row][col][0], 
                    colorData[row][col][1], 
                    colorData[row][col][2]);
            }
        }
        System.out.println();
    }
    
    /**
     * Demonstrates advanced multidimensional array operations
     */
    public static void demonstrateAdvancedOperations() {
        System.out.println("5. Advanced Multidimensional Array Operations:");
        
        // Matrix operations
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };
        
        System.out.println("   - Matrix Addition:");
        System.out.println("     Matrix A:");
        print2DArray(matrixA);
        System.out.println("     Matrix B:");
        print2DArray(matrixB);
        System.out.println("     A + B:");
        int[][] sum = addMatrices(matrixA, matrixB);
        if (sum != null) {
            print2DArray(sum);
        }
        
        // Matrix transpose
        System.out.println("   - Matrix Transpose:");
        System.out.println("     Original Matrix A:");
        print2DArray(matrixA);
        System.out.println("     Transposed Matrix A:");
        int[][] transposed = transposeMatrix(matrixA);
        print2DArray(transposed);
        
        // Finding elements in 2D array
        System.out.println("   - Search Operations:");
        int target = 5;
        int[] position = findElement(matrixA, target);
        if (position != null) {
            System.out.println("     Element " + target + " found at position [" + 
                             position[0] + "][" + position[1] + "]");
        } else {
            System.out.println("     Element " + target + " not found");
        }
        
        // Statistical operations
        System.out.println("   - Statistical Operations:");
        double average = calculateAverage(matrixA);
        int max = findMaxElement(matrixA);
        int min = findMinElement(matrixA);
        System.out.printf("     Average: %.2f, Max: %d, Min: %d\n", average, max, min);
    }
    
    // Utility methods
    
    /**
     * Prints a 2D array in matrix format
     * @param matrix The 2D array to print
     */
    public static void print2DArray(int[][] matrix) {
        if (matrix == null) {
            System.out.println("       Matrix is null");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("       ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
     * Displays a grade book
     * @param students Array of student names
     * @param subjects Array of subject names
     * @param grades 2D array of grades
     */
    public static void displayGradeBook(String[] students, String[] subjects, int[][] grades) {
        System.out.print("       ");
        System.out.printf("%-10s", "Student");
        for (String subject : subjects) {
            System.out.printf("%-8s", subject);
        }
        System.out.println("Average");
        
        for (int i = 0; i < students.length; i++) {
            System.out.print("       ");
            System.out.printf("%-10s", students[i]);
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%-8d", grades[i][j]);
                sum += grades[i][j];
            }
            double average = (double) sum / grades[i].length;
            System.out.printf("%.1f\n", average);
        }
    }
    
    /**
     * Displays a tic-tac-toe board
     * @param board 3x3 character array representing the board
     */
    public static void displayTicTacToeBoard(char[][] board) {
        System.out.println("       +---+---+---+");
        for (int i = 0; i < board.length; i++) {
            System.out.print("       ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("       +---+---+---+");
        }
    }
    
    /**
     * Generates a sample grayscale image
     * @param width Image width
     * @param height Image height
     * @return 2D array representing pixel intensities (0-255)
     */
    public static int[][] generateSampleImage(int width, int height) {
        int[][] image = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Create a gradient pattern
                image[i][j] = (i * 255 / height + j * 255 / width) / 2;
            }
        }
        return image;
    }
    
    /**
     * Displays a grayscale image using ASCII characters
     * @param image 2D array of pixel intensities
     */
    public static void displayImage(int[][] image) {
        String[] chars = {" ", ".", ":", "-", "=", "+", "*", "#", "%", "@"};
        System.out.println("       Image representation:");
        for (int i = 0; i < image.length; i++) {
            System.out.print("       ");
            for (int j = 0; j < image[i].length; j++) {
                int intensity = image[i][j];
                int charIndex = intensity * (chars.length - 1) / 255;
                System.out.print(chars[charIndex] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Adds two matrices
     * @param a First matrix
     * @param b Second matrix
     * @return Sum of matrices, or null if dimensions don't match
     */
    public static int[][] addMatrices(int[][] a, int[][] b) {
        if (a == null || b == null || a.length != b.length || a[0].length != b[0].length) {
            System.out.println("       Error: Matrix dimensions don't match");
            return null;
        }
        
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    
    /**
     * Transposes a matrix
     * @param matrix The matrix to transpose
     * @return Transposed matrix
     */
    public static int[][] transposeMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    
    /**
     * Finds an element in a 2D array
     * @param matrix The matrix to search
     * @param target The value to find
     * @return Array containing [row, column] position, or null if not found
     */
    public static int[] findElement(int[][] matrix, int target) {
        if (matrix == null) return null;
        
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
     * Calculates the average of all elements in a 2D array
     * @param matrix The matrix
     * @return Average value
     */
    public static double calculateAverage(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0.0;
        
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0.0;
    }
    
    /**
     * Finds the maximum element in a 2D array
     * @param matrix The matrix
     * @return Maximum value
     */
    public static int findMaxElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return Integer.MIN_VALUE;
        
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    
    /**
     * Finds the minimum element in a 2D array
     * @param matrix The matrix
     * @return Minimum value
     */
    public static int findMinElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return Integer.MAX_VALUE;
        
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
}
