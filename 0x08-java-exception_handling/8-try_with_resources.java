import java.io.*;

/**
 * Demonstrates try-with-resources statement for automatic resource management.
 */
public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Using try-with-resources to ensure file reader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
