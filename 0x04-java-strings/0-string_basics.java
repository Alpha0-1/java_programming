/**
 * Demonstrates string creation and basic operations in Java.
 */
public class StringBasics {

    public static void main(String[] args) {
        // String creation using string literal
        String greeting = "Hello, World!";
        
        // String concatenation
        String name = "John";
        String fullName = name + " Doe";
        
        // Accessing characters
        char firstChar = greeting.charAt(0); // 'H'
        
        // String length
        int length = greeting.length();
        
        // Multiline string using triple quotes (not directly supported in Java, uses \n)
        String multiline = "Line1\nLine2";
        
        // String creation using new String()
        String anotherGreeting = new String("Hello");
        
        System.out.println("String Basics Example:");
        System.out.println("Greeting: " + greeting);
        System.out.println("Full Name: " + fullName);
        System.out.println("First Character: " + firstChar);
        System.out.println("Length of greeting: " + length);
        System.out.println("Multiline String:");
        System.out.println(multiline);
    }
}
