/**
 * Demonstrates the basics of regular expressions in Java.
 */
public class RegexBasics {

    public static void main(String[] args) {
        // Example: Checking if a string contains digits
        String text = "There are 123 apples.";
        boolean hasNumbers = text.matches(".*\\d+.*");
        System.out.println("Does the text contain numbers? " + hasNumbers);
        
        // Example: Validating an email format
        String email = "user@example.com";
        boolean isValidEmail = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
        System.out.println("Is the email valid? " + isValidEmail);
        
        // Example: Extracting all words starting with 'a'
        String sentence = "Aardvark apples are amazing.";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\b[aA]\\w+");
        java.util.regex.Matcher matcher = pattern.matcher(sentence);
        
        System.out.println("\nWords starting with 'a' or 'A':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
        // Example: Replacing patterns
        String textWithNumbers = "Hello! This is 123 Test String 456.";
        String replacedText = textWithNumbers.replaceAll("\\d+", "");
        System.out.println("\nText after removing numbers: " + replacedText);
    }
}
