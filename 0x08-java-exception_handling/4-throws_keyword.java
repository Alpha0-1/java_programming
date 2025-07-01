import java.io.FileNotFoundException;

/**
 * Demonstrates the use of throws keyword to declare exceptions in method signature.
 */
public class ThrowsKeywordExample {

    public static void readFile() throws FileNotFoundException {
        // Simulating file not found
        throw new FileNotFoundException("File not found in the specified path.");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
