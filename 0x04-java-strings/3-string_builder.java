/**
 * Demonstrates the use of StringBuilder and its comparison with String.
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        // String appending (inefficient for multiple changes)
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += "a";
        }
        System.out.println("String result: " + str);
        
        // StringBuilder appending (efficient)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("a");
        }
        String sbResult = sb.toString();
        System.out.println("StringBuilder result: " + sbResult);
        
        // Other StringBuilder methods
        sb.append(" ");
        sb.append("example");
        sb.insert(5, "b"); // Insert at position 5
        sb.deleteCharAt(5); // Delete at position 5
        
        System.out.println("\nStringBuilder methods example: " + sb);
    }
}
