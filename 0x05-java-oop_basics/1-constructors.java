/**
 * File: 1-constructors.java
 * Description: Demonstrates default and parameterized constructors.
 */

public class Book {
    String title;
    String author;

    // Default constructor
    public Book() {
        title = "Untitled";
        author = "Unknown";
    }

    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("1984", "George Orwell");

        defaultBook.displayInfo();  // Book: Untitled, Author: Unknown
        customBook.displayInfo();   // Book: 1984, Author: George Orwell
    }
}

