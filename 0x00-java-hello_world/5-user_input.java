/**
 * 5-user_input.java
 * Purpose: Demonstrates how to read user input using Scanner in Java
 */
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display personalized message
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
