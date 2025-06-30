/**
 * 8-primitive_types.java
 * Purpose: Demonstrates all eight primitive data types in Java
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        byte b = 10;          // 8-bit signed integer
        short s = 20;         // 16-bit signed integer
        int i = 30;           // 32-bit signed integer
        long l = 40L;         // 64-bit signed integer (use L suffix)

        float f = 5.5f;       // 32-bit floating point (use F suffix)
        double d = 6.6;       // 64-bit floating point

        char c = 'A';         // 16-bit Unicode character
        boolean bool = true;  // Boolean value (true or false)

        // Print out each variable
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
