/**
 * Demonstrates handling multiple exceptions in separate catch blocks.
 */
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length()); // NullPointerException

            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (NullPointerException e) {
            System.out.println("Caught Null Pointer Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught Number Format Exception: " + e.getMessage());
        }
    }
}
