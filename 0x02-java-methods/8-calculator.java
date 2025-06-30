import java.util.Scanner;

public class Calculator {
    // Addition method
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication method
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division method with error handling
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    // Power method
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator!");

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Exit");
            System.out.print("Enter choice (1-6): ");

            try {
                int choice = scanner.nextInt();
                if (choice == 6) {
                    System.out.println("Goodbye!");
                    break;
                }

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = 0;
                int exponent = 0;

                switch (choice) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                        break;
                    case 4:
                        try {
                            System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.print("Enter exponent: ");
                        exponent = scanner.nextInt();
                        System.out.println(num1 + " ^ " + exponent + " = " + power(num1, exponent));
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
