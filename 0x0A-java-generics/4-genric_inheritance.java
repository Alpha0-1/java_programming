/**
 * Demonstrates how generics interact with inheritance in Java.
 * Shows that generic type information is not inherited directly.
 */
class Parent<T> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Child extends Parent<String> {
    // Inherits Parent<String>
}

public class GenericInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.setValue("Generic Inheritance Example");
        System.out.println("Child Value: " + child.getValue());
    }
}
