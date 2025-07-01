/**
 * Demonstrates string formatting techniques in Java.
 */
public class StringFormatting {

    public static void main(String[] args) {
        int num = 100;
        double price = 49.99;
        
        // Basic formatting with String.format()
        String formatted1 = String.format("Number: %d, Price: %.2f", num, price);
        System.out.println(formatted1);
        
        // Using placeholders with different data types
        String formatted2 = String.format(
            "Item: %s, Quantity: %d, Total: %.2f",
            "Apple",
            5,
            5 * 2.99
        );
        System.out.println(formatted2);
        
        // Using MessageFormat for localization
        java.text.MessageFormat messageFormat = new java.text.MessageFormat(
            "There are {0} apples for {1} dollars."
        );
        String formatted3 = messageFormat.format(new Object[]{3, 10});
        System.out.println(formatted3);
        
        // Formatting currency
        String formatted4 = String.format("Amount: %,d", 1234567890);
        System.out.println("Formatted number: " + formatted4);
    }
}
