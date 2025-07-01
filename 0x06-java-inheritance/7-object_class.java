/**
 * 7-object_class.java
 * Demonstrates the Object class as the root of all Java classes.
 * Overriding toString(), equals(), and hashCode().
 */

class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return title.equals(other.title);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Java Basics");

        System.out.println(b1);               // Uses overridden toString()
        System.out.println(b1.equals(b2));    // Uses overridden equals()
    }
}
