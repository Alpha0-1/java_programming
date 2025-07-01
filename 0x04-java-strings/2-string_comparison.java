/**
 * Demonstrates proper string comparison in Java.
 */
public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        // Using equals() method
        boolean equalCheck = str1.equals(str2);
        
        // Using ==
        boolean referenceCheck = (str1 == str2);
        boolean referenceCheck2 = (str1 == str3);
        
        // Using compareTo()
        int comparison = str1.compareTo(str3);
        
        System.out.println("String Comparison Example:");
        System.out.println("Are str1 and str2 equal? " + equalCheck);
        System.out.println("Are str1 and str2 references same? " + referenceCheck);
        System.out.println("Are str1 and str3 references same? " + referenceCheck2);
        System.out.println("Comparison result (str1 vs str3): " + comparison);
        
        // Case-insensitive comparison
        String case1 = "HELLO";
        String case2 = "hello";
        boolean caseInsensitiveEqual = case1.equalsIgnoreCase(case2);
        
        System.out.println("\nCase-insensitive comparison: " + caseInsensitiveEqual);
    }
}
