import java.io.*;
import java.util.Scanner;

/**
 * Demonstrates file operations with proper exception handling.
 */
public class FileExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the filename to read: ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        } catch (IOException e) {
            System.out.println("Error reading from the file.");
        } finally {
            scanner.close();
        }
    }
}
