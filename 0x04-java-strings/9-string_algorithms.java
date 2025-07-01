/**
 * Demonstrates string manipulation algorithms.
 */
public class StringAlgorithms {

    public static void main(String[] args) {
        String str = "Hello";
        
        // Example: Reverse a string
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
        
        // Example: Check if a string has all unique characters
        boolean unique = hasAllUniqueCharacters("abcdef");
        System.out.println("Does the string have all unique characters? " + unique);
        
        // Example: Find the first non-repeating character
        char firstNonRepeating = findFirstNonRepeatingCharacter("abba");
        System.out.println("First non-repeating character: " + firstNonRepeating);
        
        // Example: Check if two strings are anagrams
        boolean areAnagrams = areAnagrams("listen", "silent");
        System.out.println("Are the strings anagrams? " + areAnagrams);
    }
    
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    private static boolean hasAllUniqueCharacters(String str) {
        java.util.HashSet<Character> seen = new java.util.HashSet<>();
        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return false;
            }
            seen.add(c);
        }
        return true;
    }
    
    private static char findFirstNonRepeatingCharacter(String str) {
        java.util.HashMap<Character, Integer> countMap = new java.util.HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (countMap.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }
    
    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        java.util.Arrays.sort(s1Arr);
        java.util.Arrays.sort(s2Arr);
        return java.util.Arrays.equals(s1Arr, s2Arr);
    }
}
