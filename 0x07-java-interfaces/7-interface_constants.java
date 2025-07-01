/**
 * 7-interface_constants.java
 * Shows how interfaces can hold constants.
 *
 * Constants in interfaces are implicitly public, static, and final.
 */

interface Constants {
    double PI = 3.14159;
    int MAX_USERS = 100;
}

class Circle implements Constants {
    public void printPI() {
        System.out.println("PI value: " + PI);  // Accessing constant from interface
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.printPI();  // Expected output: PI value: 3.14159
    }
}
