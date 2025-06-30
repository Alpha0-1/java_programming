/**
 * ArrayAlgorithms - Common algorithms implemented with arrays
 * 
 * This class demonstrates various algorithms that are commonly implemented
 * using arrays. These algorithms are fundamental in computer science and
 * appear frequently in technical interviews and competitive programming.
 * Each algorithm includes detailed explanations and complexity analysis.
 * 
 * @author Alpha0-1
 */
public class ArrayAlgorithms {
    
    /**
     * Two Pointer Technique: Find pair with given sum
     * Time Complexity: O(n log n) due to sorting
     * Space Complexity: O(1)
     * 
     * @param array the input array
     * @param targetSum the target sum to find
     * @return array containing the pair indices, or null if not found
     */
    public static int[] findPairWithSum(int[] array, int targetSum) {
        if (array == null || array.length < 2) {
            return null;
        }
        
        // Create array of indices to track original positions
        Integer[] indices = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            indices[i] = i;
        }
        
        // Sort indices based on array values
        java.util.Arrays.sort(indices, (a, b) -> Integer.compare(array[a], array[b]));
        
        int left = 0, right = array.length - 1;
        
        while (left < right) {
            int currentSum = array[indices[left]] + array[indices[right]];
            
            if (currentSum == targetSum) {
                return new int[]{indices[left], indices[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        
        return null; // No pair found
    }
    
    /**
     * Sliding Window Technique: Find maximum sum of k consecutive elements
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param array the input array
     * @param k the window size
     * @return the maximum sum of k consecutive elements
     * @throws IllegalArgumentException if invalid parameters
     */
    public static int maxSumSubarrayOfSizeK(int[] array, int k) {
        if (array == null || k <= 0 || k > array.length) {
            throw new IllegalArgumentException("Invalid array or window size");
        }
        
        // Calculate sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }
        
        int maxSum = windowSum;
        
        // Slide the window and update maximum
        for (int i = k; i < array.length; i++) {
            windowSum = windowSum - array[i - k] + array[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }
    
    /**
     * Kadane's Algorithm: Maximum sum contiguous subarray
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param array the input array
     * @return the maximum sum of contiguous subarray
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int maxSubarraySum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int maxSoFar = array[0];
        int maxEndingHere = array[0];
        
        for (int i = 1; i < array.length; i++) {
            // Either extend existing subarray or start new one
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
    
    /**
     * Dutch National Flag Algorithm: Sort array of 0s, 1s, and 2s
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param array array containing only 0s, 1s, and 2s
     * @throws IllegalArgumentException if array is null or contains invalid values
     */
    public static void sortColors(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        int low = 0, mid = 0, high = array.length - 1;
        
        while (mid <= high) {
            switch (array[mid]) {
                case 0:
                    swap(array, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(array, mid, high--);
                    break;
                default:
                    throw new IllegalArgumentException("Array must contain only 0s, 1s, and 2s");
            }
        }
    }
    
    /**
     * Boyer-Moore Majority Vote Algorithm: Find majority element
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param array the input array
     * @return the majority element (appears more than n/2 times)
     * @throws IllegalArgumentException if no majority element exists
     */
    public static int findMajorityElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int candidate = 0;
        int count = 0;
        
        // Phase 1: Find potential candidate
        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        // Phase 2: Verify the candidate
        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }
        
        if (count > array.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }
    
    /**
     * Next Greater Element: Find next greater element for each element
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * @param array the input array
     * @return array where each element is the next greater element, -1 if none
     */
    public static int[] nextGreaterElement(int[] array) {
        if (array == null) {
            return null;
        }
        
        int[] result = new int[array.length];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        
        // Initialize result with -1
        java.util.Arrays.fill(result, -1);
        
        for (int i = 0; i < array.length; i++) {
            // Pop elements from stack that are smaller than current element
            while (!stack.isEmpty() && array[stack.peek()] < array[i]) {
                result[stack.pop()] = array[i];
            }
            
            stack.push(i);
        }
        
        return result;
    }
    
    /**
     * Rotate Array: Rotate array to the right by k steps
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param array the array to rotate
     * @param k number of steps to rotate right
     * @throws IllegalArgumentException if array is null
     */
    public static void rotateArray(int[] array, int k) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        if (array.length == 0) return;
        
        k = k % array.length; // Handle k > array.length
        if (k == 0) return;
        
        // Reverse entire array
        reverse(array, 0, array.length - 1);
        // Reverse first k elements
        reverse(array, 0, k - 1);
        // Reverse remaining elements
        reverse(array, k, array.length - 1);
    }
    
    /**
     * Trapping Rain Water: Calculate water trapped after raining
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param heights array representing elevation heights
     * @return total water trapped
     */
    public static int trapRainWater(int[] heights) {
        if (heights == null || heights.length < 3) {
            return 0;
        }
        
        int left = 0, right = heights.length - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;
        
        while (left < right) {
            if (heights[left] < heights[right]) {
                if (heights[left] >= leftMax) {
                    leftMax = heights[left];
                } else {
                    totalWater += leftMax - heights[left];
                }
                left++;
            } else {
                if (heights[right] >= rightMax) {
                    rightMax = heights[right];
                } else {
                    totalWater += rightMax - heights[right];
                }
                right--;
            }
        }
        
        return totalWater;
    }
    
    /**
     * Product of Array Except Self: Calculate product except current element
     * Time Complexity: O(n)
     * Space Complexity: O(1) excluding output array
     * 
     * @param array the input array
     * @return array where each element is product of all others
     */
    public static int[] productExceptSelf(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        
        int[] result = new int[array.length];
        
        // Calculate left products
        result[0] = 1;
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] * array[i - 1];
        }
        
        // Calculate right products and multiply with left products
        int rightProduct = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= array[i];
        }
        
        return result;
    }
    
    /**
     * Longest Increasing Subsequence Length (using patience sorting approach)
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     * 
     * @param array the input array
     * @return length of longest increasing subsequence
     */
    public static int lengthOfLIS(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        
        java.util.List<Integer> tails = new java.util.ArrayList<>();
        
        for (int num : array) {
            int pos = binarySearchForLIS(tails, num);
            
            if (pos == tails.size()) {
                tails.add(num);
            } else {
                tails.set(pos, num);
            }
        }
        
        return tails.size();
    }
    
    /**
     * Binary search helper for LIS algorithm
     */
    private static int binarySearchForLIS(java.util.List<Integer> tails, int target) {
        int left = 0, right = tails.size();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (tails.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    
    /**
     * Helper method to swap two elements in an array
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /**
     * Helper method to reverse a portion of an array
     */
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start++, end--);
        }
    }
    
    /**
     * Utility method to print arrays with labels
     */
    private static void printArray(int[] array, String label) {
        System.out.print(label + ": [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    /**
     * Main method to demonstrate all algorithms
     */
    public static void main(String[] args) {
        System.out.println("=== Array Algorithms Demonstration ===\n");
        
        // Test Two Pointer Technique
        System.out.println("--- Two Pointer: Find Pair with Sum ---");
        int[] array1 = {2, 7, 11, 15, 3, 6};
        int targetSum = 9;
        printArray(array1, "Array");
        System.out.println("Target sum: " + targetSum);
        
        int[] pair = findPairWithSum(array1, targetSum);
        if (pair != null) {
            System.out.println("Pair found at indices: " + pair[0] + ", " + pair[1]);
            System.out.println("Values: " + array1[pair[0]] + " + " + array1[pair[1]] + " = " + targetSum);
        } else {
            System.out.println("No pair found");
        }
        
        // Test Sliding Window
        System.out.println("\n--- Sliding Window: Max Sum of K Elements ---");
        int[] array2 = {2, 1, 5, 1, 3, 2};
        int k = 3;
        printArray(array2, "Array");
        System.out.println("Window size: " + k);
        System.out.println("Maximum sum: " + maxSumSubarrayOfSizeK(array2, k));
        
        // Test Kadane's Algorithm
        System.out.println("\n--- Kadane's Algorithm: Maximum Subarray Sum ---");
        int[] array3 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printArray(array3, "Array");
        System.out.println("Maximum contiguous sum: " + maxSubarraySum(array3));
        
        // Test Dutch National Flag
        System.out.println("\n--- Dutch National Flag: Sort Colors ---");
        int[] colors = {2, 0, 2, 1, 1, 0};
        printArray(colors, "Before sorting");
        sortColors(colors);
        printArray(colors, "After sorting");
        
        // Test Boyer-Moore Majority Vote
        System.out.println("\n--- Boyer-Moore: Find Majority Element ---");
        int[] array4 = {3, 2, 3};
        printArray(array4, "Array");
        try {
            int majority = findMajorityElement(array4);
            System.out.println("Majority element: " + majority);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test Next Greater Element
        System.out.println("\n--- Next Greater Element ---");
        int[] array5 = {4, 5, 2, 25};
        printArray(array5, "Original array");
        int[] nextGreater = nextGreaterElement(array5);
        printArray(nextGreater, "Next greater elements");
        
        // Test Array Rotation
        System.out.println("\n--- Array Rotation ---");
        int[] array6 = {1, 2, 3, 4, 5, 6, 7};
        int rotateSteps = 3;
        printArray(array6, "Before rotation");
        rotateArray(array6, rotateSteps);
        printArray(array6, "After rotating right by " + rotateSteps);
        
        // Test Trapping Rain Water
        System.out.println("\n--- Trapping Rain Water ---");
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        printArray(heights, "Heights");
        System.out.println("Water trapped: " + trapRainWater(heights) + " units");
        
        // Test Product Except Self
        System.out.println("\n--- Product of Array Except Self ---");
        int[] array7 = {1, 2, 3, 4};
        printArray(array7, "Original array");
        int[] products = productExceptSelf(array7);
        printArray(products, "Product except self");
        
        // Test Longest Increasing Subsequence
        System.out.println("\n--- Longest Increasing Subsequence ---");
        int[] array8 = {10, 9, 2, 5, 3, 7, 101, 18};
        printArray(array8, "Array");
        System.out.println("Length of LIS: " + lengthOfLIS(array8));
        
        // Performance comparison demonstration
        System.out.println("\n--- Algorithm Complexity Demonstration ---");
        System.out.println("Two Pointer Technique: O(n log n) - due to sorting");
        System.out.println("Sliding Window: O(n) - single pass");
        System.out.println("Kadane's Algorithm: O(n) - single pass");
        System.out.println("Dutch National Flag: O(n) - single pass, O(1) space");
        System.out.println("Boyer-Moore Majority: O(n) - two passes, O(1) space");
        System.out.println("Next Greater Element: O(n) - using stack");
        System.out.println("Array Rotation: O(n) - three reversals");
        System.out.println("Trapping Rain Water: O(n) - two pointers");
        System.out.println("Product Except Self: O(n) - two passes");
        System.out.println("Longest Increasing Subsequence: O(n log n) - binary search");
    }
}
