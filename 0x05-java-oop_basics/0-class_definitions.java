/**
 * File: 0-class_definition.java
 * Description: Demonstrates how to define a simple class in Java.
 */

public class Animal {
    // Instance variable
    String name;

    // Method to set the animal name
    public void setName(String animalName) {
        name = animalName;
    }

    // Method to print the animal name
    public void speak() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Bingo");
        dog.speak();  // Output: My name is Bingo
    }
}

