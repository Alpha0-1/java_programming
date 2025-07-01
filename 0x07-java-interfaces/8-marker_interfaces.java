/**
 * 8-marker_interfaces.java
 * Demonstrates marker interfaces with no methods.
 *
 * Marker interfaces indicate capabilities or metadata about a class.
 */

interface Serializable { /* Marker Interface */ }

class Document implements Serializable {
    // This class is now marked as serializable
}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        if (doc instanceof Serializable) {
            System.out.println("Document is serializable.");  // Expected output
        }
    }
}
