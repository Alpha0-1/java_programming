/**
 * 9-type_casting.java
 * Purpose: Demonstrates implicit and explicit type casting in Java
 */
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int intValue = 100;
        double doubleValue = intValue; // Automatic conversion
        System.out.println("Implicit Casting: int to double -> " + doubleValue);

        // Explicit casting (narrowing)
        double anotherDouble = 123.45;
        int narrowedInt = (int) anotherDouble; // Manual conversion
        System.out.println("Explicit Casting: double to int -> " + narrowedInt);

        // Casting between incompatible types
        char charValue = 'B';
        int asciiValue = (int) charValue;
        System.out.println("Char to ASCII: " + asciiValue);
    }
}
