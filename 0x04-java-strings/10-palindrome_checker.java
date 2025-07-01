/**
 * Demonstrates palindrome checking for strings.
 */
public class PalindromeChecker {

    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = "hello";
        String test3 = "racecar";
        
        System.out.println("Is " + test1 + " a palindrome? " + isPalindrome(test1));
        System.out.println("Is " + test2 + " a palindrome? " + isPalindrome(test2));
        System.out.println("Is " + test3 + " a palindrome? " + isPalindrome(test3));
    }
    
    /**
     * Checks if a string is a palindrome (reads the same forwards and backwards).
     * @param str The input string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
