/**
 * Demonstrates string parsing techniques in Java.
 */
public class StringParsing {

    public static void main(String[] args) {
        // Parsing a comma-separated string
        String csv = "Java,Programming,Is,Fun";
        String[] parts = csv.split(",");
        System.out.println("Comma-separated values:");
        for (String part : parts) {
            System.out.println(part);
        }
        
        // Parsing a date string
        String dateString = "2023-12-31";
        String[] dateParts = dateString.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        
        System.out.println("\nParsed Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        
        // Parsing a number from a string
        String numStr = "12345";
        int number = Integer.parseInt(numStr);
        System.out.println("\nParsed Number: " + number);
        
        // Parsing a double
        String priceStr = "49.99";
        double price = Double.parseDouble(priceStr);
        System.out.println("Parsed Price: " + price);
    }
}
