/**
 * 1-file_writing.java - Demonstrates writing text to a file using FileWriter.
 * This example writes a sample string into a file, overwriting any existing content.
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "Hello, Java File Writing!";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Content written to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
