/**
 * File: 6-this_keyword.java
 * Description: Demonstrates usage of 'this' to reference instance variables.
 */

public class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;     // Resolves conflict with parameter
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area: " + rect.area());  // Output: Area: 50
    }
}

