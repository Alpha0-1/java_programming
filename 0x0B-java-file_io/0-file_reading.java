/**
 * 0-file_reading.java - Demonstrates reading text from a file using FileReader.
 * This example reads a simple text file character by character.
 */

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        // Path to the input file
        String filePath = "input.txt";

        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.println("Reading file content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
