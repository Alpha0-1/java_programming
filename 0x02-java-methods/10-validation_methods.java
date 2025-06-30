import java.util.regex.Pattern;

/**
 * A utility class providing various input validation methods.
 */
public class ValidationMethods {

    /**
     * Checks if a number is positive (greater than zero).
     *
     * @param number the number to validate
     * @throws IllegalArgumentException if the number is not positive
     */
    public static void isPositiveNumber(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("The number must be positive.");
        }
    }

    /**
     * Checks if a number falls within a given range (inclusive).
     *
     * @param number the number to validate
     * @param min the minimum allowed value
     * @param max the maximum allowed value
     * @throws IllegalArgumentException if the number is not within the specified range
     */
    public static void isWithinRange(double number, double min, double max) {
        if (number < min || number > max) {
            throw new IllegalArgumentException("The number must be between " + min + " and " + max + ".");
        }
    }

    /**
     * Checks if a string is non-null and non-empty.
     *
     * @param str the string to validate
     * @throws IllegalArgumentException if the string is null or empty
     */
    public static void isNonEmptyString(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The string must be non-empty.");
        }
    }

    /**
     * Validates that an email address follows a basic correct format.
     *
     * @param email the email address to validate
     * @throws IllegalArgumentException if the email format is invalid
     */
    public static void isValidEmail(String email) {
        isNonEmptyString(email); // Ensure the email is non-null and non-empty

        // Basic email pattern: local-part@domain
        String emailPattern = "^[a-zA-Z0-9_+&.-]+@[a-zA-Z0-9.-]+$";
        if (!Pattern.matches(emailPattern, email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    /**
     * Checks if a string contains only alphanumeric characters (letters and numbers).
     *
     * @param str the string to validate
     * @throws IllegalArgumentException if the string contains non-alphanumeric characters
     */
    public static void isAlphanumeric(String str) {
        isNonEmptyString(str); // Ensure the string is non-null and non-empty

        // Check each character in the string
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                throw new IllegalArgumentException("The string must contain only alphanumeric characters.");
            }
        }
    }

    /**
     * Main method demonstrating the usage of the validation methods.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Example 1: Validate a positive number
        System.out.println("Example 1: Positive number validation");
        try {
            isPositiveNumber(5.0);
            System.out.println("Valid positive number.");
            isPositiveNumber(-3.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Example 2: Validate a number within range
        System.out.println("\nExample 2: Range validation");
        try {
            isWithinRange(15, 10, 20);
            System.out.println("Value is within the range.");
            isWithinRange(25, 10, 20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Example 3: Validate a non-empty string
        System.out.println("\nExample 3: Non-empty string validation");
        try {
            isNonEmptyString("Hello");
            System.out.println("String is non-empty.");
            isNonEmptyString("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Example 4: Validate an email format
        System.out.println("\nExample 4: Email validation");
        try {
            isValidEmail("test@example.com");
            System.out.println("Valid email format.");
            isValidEmail("test@example");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Example 5: Validate an alphanumeric string
        System.out.println("\nExample 5: Alphanumeric validation");
        try {
            isAlphanumeric("Test123");
            System.out.println("Alphanumeric string.");
            isAlphanumeric("Test!23");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
