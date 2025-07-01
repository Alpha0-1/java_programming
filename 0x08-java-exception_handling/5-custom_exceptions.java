/**
 * Demonstrates creation and usage of custom exception classes.
 */
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class CustomExceptionsExample {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email address: missing '@'");
        } else {
            System.out.println("Email is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateEmail("not-an-email");
        } catch (InvalidEmailException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
