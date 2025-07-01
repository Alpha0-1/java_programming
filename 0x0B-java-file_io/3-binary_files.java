/**
 * 3-binary_files.java - Demonstrates reading and writing binary files using FileInputStream and FileOutputStream.
 * Suitable for non-text files like images or serialized objects.
 */

import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) {
        String sourceFile = "source.bin";
        String copyFile = "copy.bin";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(copyFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Binary file copied successfully.");

        } catch (IOException e) {
            System.err.println("Error handling binary files: " + e.getMessage());
        }
    }
}
