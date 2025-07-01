/**
 * 6-directory_operations.java - Demonstrates creating directories and listing contents.
 * Uses NIO Files class for robust and cross-platform operations.
 */

import java.nio.file.*;
import java.io.IOException;

public class DirectoryOperations {
    public static void main(String[] args) {
        Path dirPath = Paths.get("my_directory");
        
        // Create directory
        try {
            if (Files.exists(dirPath)) {
                System.out.println("Directory already exists.");
            } else {
                Files.createDirectory(dirPath);
                System.out.println("Directory created: " + dirPath.toAbsolutePath());
            }

            // List directory contents
            System.out.println("\nListing contents of: " + dirPath.toAbsolutePath());
            if (Files.isDirectory(dirPath)) {
                Files.list(dirPath).forEach(System.out::println);
            }

        } catch (IOException e) {
            System.err.println("Error handling directories: " + e.getMessage());
        }
    }
}
