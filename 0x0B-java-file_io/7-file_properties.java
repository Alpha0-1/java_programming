/**
 * 7-file_properties.java - Demonstrates retrieving metadata about a file.
 * Includes size, last modified time, and whether it's readable/writable.
 */

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

public class FileProperties {
    public static void main(String[] args) {
        Path filePath = Paths.get("input.txt");

        try {
            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("File exists: " + Files.exists(filePath));
            System.out.println("Is directory: " + attrs.isDirectory());
            System.out.println("Size: " + attrs.size() + " bytes");
            System.out.println("Last modified: " + attrs.lastModifiedTime());
            System.out.println("Readable: " + Files.isReadable(filePath));
            System.out.println("Writable: " + Files.isWritable(filePath));

        } catch (IOException e) {
            System.err.println("Error reading file attributes: " + e.getMessage());
        }
    }
}
