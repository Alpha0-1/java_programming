/**
 * MatrixOperations - Working with 2D arrays as matrices
 * 
 * This class demonstrates common matrix operations using 2D arrays.
 * It covers matrix creation, basic arithmetic operations, and utility
 * functions that are commonly used in mathematical computations and
 * computer graphics applications.
 * 
 * @author Alpha0-1
 */
public class MatrixOperations {
    
    /**
     * Creates a matrix filled with zeros
     * 
     * @param rows number of rows
     * @param cols number of columns
     * @return a new matrix filled with zeros
     * @throws IllegalArgumentException if dimensions are invalid
     */
    public static int[][] createZeroMatrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }
        
        return new int[rows][cols]; // Java initializes with zeros by default
    }
    
    /**
     * Creates an identity matrix (square matrix with 1s on diagonal)
     * 
     * @param size the size of the square matrix
     * @return an identity matrix
     * @throws IllegalArgumentException if size is invalid
     */
    public static int[][] createIdentityMatrix(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Matrix size must be positive");
        }
        
        int[][] identity = new int[size][size];
        for (int i = 0; i < size; i++) {
            identity[i][i] = 1; // Set diagonal elements to 1
        }
        
        return identity;
    }
    
    /**
     * Adds two matrices
     * 
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return the result of matrix addition
     * @throws IllegalArgumentException if matrices are null or dimensions don't match
     */
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        validateMatricesForOperation(matrix1, matrix2);
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return result;
    }
    
    /**
     * Subtracts two matrices
     * 
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return the result of matrix subtraction
     * @throws IllegalArgumentException if matrices are null or dimensions don't match
     */
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        validateMatricesForOperation(matrix1, matrix2);
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        return result;
    }
    
    /**
     * Multiplies two matrices
     * 
     * @param matrix1 first matrix (m x n)
     * @param matrix2 second matrix (n x p)
     * @return the result of matrix multiplication (m x p)
     * @throws IllegalArgumentException if matrices cannot be multiplied
     */
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("Matrices cannot be null");
        }
        
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException(
                "Cannot multiply: columns of first matrix must equal rows of second matrix");
        }
        
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    
    /**
     * Transposes a matrix (swaps rows and columns)
     * 
     * @param matrix the matrix to transpose
     * @return the transposed matrix
     * @throws IllegalArgumentException if matrix is null
     */
    public static int[][] transposeMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }
    
    /**
     * Multiplies a matrix by a scalar value
     * 
     * @param matrix the matrix to multiply
     * @param scalar the scalar value
     * @return the result of scalar multiplication
     * @throws IllegalArgumentException if matrix is null
     */
    public static int[][] scalarMultiply(int[][] matrix, int scalar) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        
        return result;
    }
    
    /**
     * Finds the maximum element in a matrix
     * 
     * @param matrix the matrix to search
     * @return the maximum value
     * @throws IllegalArgumentException if matrix is null or empty
     */
    public static int findMaxInMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix cannot be null or empty");
        }
        
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
     * Calculates the sum of all elements in a matrix
     * 
     * @param matrix the matrix to sum
     * @return the sum of all elements
     * @throws IllegalArgumentException if matrix is null
     */
    public static long sumMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        
        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        
        return sum;
    }
    
    /**
     * Checks if a matrix is square (same number of rows and columns)
     * 
     * @param matrix the matrix to check
     * @return true if matrix is square, false otherwise
     */
    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        
        return matrix.length == matrix[0].length;
    }
    
    /**
     * Validates that two matrices can be used in addition/subtraction operations
     * 
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @throws IllegalArgumentException if validation fails
     */
    private static void validateMatricesForOperation(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("Matrices cannot be null");
        }
        
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
    }
    
    /**
     * Prints a matrix in a formatted way
     * 
     * @param matrix the matrix to print
     * @param matrixName the name to display for the matrix
     */
    public static void printMatrix(int[][] matrix, String matrixName) {
        if (matrix == null) {
            System.out.println(matrixName + ": null");
            return;
        }
        
        System.out.println(matrixName + ":");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println("]");
        }
        System.out.println();
    }
    
    /**
     * Main method to demonstrate matrix operations
     */
    public static void main(String[] args) {
        System.out.println("=== Matrix Operations Demonstration ===\n");
        
        // Create sample matrices for testing
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] matrix3 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        int[][] matrix4 = {
            {7, 8, 9},
            {10, 11, 12}
        };
        
        // Display original matrices
        printMatrix(matrix1, "Matrix 1");
        printMatrix(matrix2, "Matrix 2");
        
        // Test matrix addition
        System.out.println("--- Matrix Addition ---");
        int[][] sum = addMatrices(matrix1, matrix2);
        printMatrix(sum, "Matrix 1 + Matrix 2");
        
        // Test matrix subtraction
        System.out.println("--- Matrix Subtraction ---");
        int[][] difference = subtractMatrices(matrix1, matrix2);
        printMatrix(difference, "Matrix 1 - Matrix 2");
        
        // Test matrix multiplication
        System.out.println("--- Matrix Multiplication ---");
        printMatrix(matrix3, "Matrix 3 (3x2)");
        printMatrix(matrix4, "Matrix 4 (2x3)");
        
        int[][] product = multiplyMatrices(matrix3, matrix4);
        printMatrix(product, "Matrix 3 × Matrix 4");
        
        // Test transpose
        System.out.println("--- Matrix Transpose ---");
        int[][] transposed = transposeMatrix(matrix1);
        printMatrix(transposed, "Matrix 1 Transposed");
        
        // Test scalar multiplication
        System.out.println("--- Scalar Multiplication ---");
        int scalar = 3;
        int[][] scaledMatrix = scalarMultiply(matrix1, scalar);
        printMatrix(scaledMatrix, "Matrix 1 × " + scalar);
        
        // Test identity matrix creation
        System.out.println("--- Identity Matrix ---");
        int[][] identity = createIdentityMatrix(4);
        printMatrix(identity, "4x4 Identity Matrix");
        
        // Test matrix properties
        System.out.println("--- Matrix Properties ---");
        System.out.println("Matrix 1 is square: " + isSquareMatrix(matrix1));
        System.out.println("Matrix 3 is square: " + isSquareMatrix(matrix3));
        System.out.println("Sum of Matrix 1 elements: " + sumMatrix(matrix1));
        System.out.println("Maximum element in Matrix 1: " + findMaxInMatrix(matrix1));
        
        // Test zero matrix creation
        System.out.println("\n--- Zero Matrix ---");
        int[][] zeroMatrix = createZeroMatrix(2, 4);
        printMatrix(zeroMatrix, "2x4 Zero Matrix");
        
        // Error handling demonstration
        System.out.println("--- Error Handling Demo ---");
        try {
            int[][] incompatible1 = {{1, 2}};
            int[][] incompatible2 = {{1}, {2}, {3}};
            multiplyMatrices(incompatible1, incompatible2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
