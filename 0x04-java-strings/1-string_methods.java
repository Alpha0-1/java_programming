/**
 * Demonstrates common String methods in Java.
 */
public class StringMethods {

    public static void main(String[] args) {
        String sample = "Java Programming";
        
        // toUpperCase() example
        String upperCase = sample.toUpperCase();
        
        // toLowerCase() example
        String lowerCase = sample.toLowerCase();
        
        // trim() example
        String withSpaces = "   Hello   ";
        String trimmed = withSpaces.trim();
        
        // substring() example
        String substring = sample.substring(5);
        
        // replace() example
        String replaced = sample.replace('a', 'A');
        
        // split() example
        String[] parts = sample.split(" ");
        
        System.out.println("String Methods Example:");
        System.out.println("Original: " + sample);
        System.out.println("Upper Case: " + upperCase);
        System.out.println("Lower Case: " + lowerCase);
        System.out.println("Trimmed: " + trimmed);
        System.out.println("Substring (from 5): " + substring);
        System.out.println("Replaced 'a' with 'A': " + replaced);
        System.out.println("Split into parts:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
