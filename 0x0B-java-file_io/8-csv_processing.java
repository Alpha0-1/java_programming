/**
 * 8-csv_processing.java - Demonstrates reading and parsing CSV files.
 * Parses each line into fields separated by commas.
 */

import java.io.*;
import java.util.Arrays;

public class CSVProcessing {
    public static void main(String[] args) {
        String filePath = "data.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Parsing CSV file:");

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                System.out.println("Row: " + Arrays.toString(fields));
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
