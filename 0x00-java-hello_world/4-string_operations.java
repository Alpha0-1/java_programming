/**
 * 4-string_operations.java
 * Purpose: Demonstrates basic string manipulation in Java
 */
public class StringOperations {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        // Concatenate strings
        String fullName = firstName + " " + lastName;

        // Find length of full name
        int length = fullName.length();

        // Convert to uppercase
        String upperCaseName = fullName.toUpperCase();

        // Output results
        System.out.println("Full Name: " + fullName);
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + upperCaseName);
    }
}
