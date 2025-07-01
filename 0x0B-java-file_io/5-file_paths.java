/**
 * 5-file_paths.java - Demonstrates working with file paths using java.nio.file.Path.
 * Shows how to manipulate and resolve file paths programmatically.
 */

import java.nio.file.*;

public classFilePaths {
    public static void main(String[] args) {
        // Creating paths
        Path path1 = Paths.get("data", "files", "example.txt");
        Path path2 = Paths.get("/home/user/docs/report.pdf");

        System.out.println("Path 1: " + path1);
        System.out.println("Path 2: " + path2);

        // Resolving relative paths
        Path basePath = Paths.get("/home/user");
        Path resolved = basePath.resolve("projects/app.log");
        System.out.println("Resolved path: " + resolved);

        // Normalizing paths
        Path messyPath = Paths.get("/home/user/./docs/../projects/./file.txt");
        System.out.println("Normalized path: " + messyPath.normalize());
    }
}
