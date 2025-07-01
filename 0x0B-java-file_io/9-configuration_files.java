/**
 * 9-configuration_files.java - Demonstrates reading key-value pairs from a properties file.
 * Uses Java's built-in Properties class.
 */

import java.io.*;
import java.util.Properties;

public class ConfigurationFiles {
    public static void main(String[] args) {
        String filePath = "config.properties";
        Properties props = new Properties();

        try (InputStream input = new FileInputStream(filePath)) {
            props.load(input);

            System.out.println("Loaded configuration:");
            props.forEach((key, value) -> System.out.println(key + " = " + value));

        } catch (IOException e) {
            System.err.println("Error loading config file: " + e.getMessage());
        }
    }
}
