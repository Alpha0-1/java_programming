/**
 * Demonstrates how to create generic classes in Java.
 * A generic class allows us to reuse logic for different data types.
 */
public class GenericBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        // Using GenericBox with Integer
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(123);
        System.out.println("Integer Box Item: " + intBox.getItem());

        // Using GenericBox with String
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setItem("Hello");
        System.out.println("String Box Item: " + stringBox.getItem());
    }
}
