/**
 * 2-buffered_io.java - Demonstrates buffered I/O operations using BufferedReader and BufferedWriter.
 * This is more efficient than plain readers/writers for large data.
 */

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) {
        String inputPath = "input.txt";
        String outputPath = "buffered_output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Ensures proper line separation
            }
            System.out.println("File copied using buffered IO.");

        } catch (IOException e) {
            System.err.println("Error during buffered IO: " + e.getMessage());
        }
    }
}
