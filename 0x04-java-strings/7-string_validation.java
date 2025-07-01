/**
 * Demonstrates string validation techniques in Java.
 */
public class StringValidation {

    public static void main(String[] args) {
        // Example: Validate a username (only letters and numbers, 5-10 characters)
        String username = "User123";
        boolean isValidUsername = username.matches("^[a-zA-Z0-9]{5,10}$");
        System.out.println("Is the username valid? " + isValidUsername);
        
        // Example: Validate a password (must contain at least one uppercase, one lowercase, and one digit)
        String password = "Passw0rd";
        boolean isStrongPassword = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
        System.out.println("Is the password strong? " + isStrongPassword);
        
        // Example: Validate an IP address
        String ipAddress = "192.168.1.1";
        boolean isValidIP = ipAddress.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");
        System.out.println("Is the IP address valid? " + isValidIP);
        
        // Example: Check if a string contains only letters
        String text = "HelloWorld";
        boolean isLettersOnly = text.matches("^[a-zA-Z]+$");
        System.out.println("Does the text contain only letters? " + isLettersOnly);
    }
}
