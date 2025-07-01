/**
 * 10-file_utilities.java - Demonstrates common utility methods for file operations.
 * Includes checking existence, copying, moving, and deleting files.
 */

import java.nio.file.*;
import java.io.IOException;

public class FileUtilities {
    public static void main(String[] args) {
        Path source = Paths.get("source.txt");
        Path target = Paths.get("target.txt");

        try {
            if (!Files.exists(source)) {
                Files.createFile(source);
                System.out.println("Created source.txt");
            }

            // Copy file
            if (Files.exists(source)) {
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Copied to target.txt");
            }

            // Move file
            Path moved = Paths.get("moved.txt");
            Files.move(target, moved);
            System.out.println("Moved target.txt to moved.txt");

            // Delete file
            Files.deleteIfExists(moved);
            System.out.println("Deleted moved.txt");

        } catch (IOException e) {
            System.err.println("Error during file utilities: " + e.getMessage());
        }
    }
}
