/**
 * File: 2-instance_variables.java
 * Description: Shows how instance variables behave differently across objects.
 */

public class Counter {
    int count = 0;  // Instance variable

    public void increment() {
        count++;
    }

    public void printCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();

        a.increment();
        a.increment();

        b.increment();

        a.printCount(); // Count: 2
        b.printCount(); // Count: 1
    }
}

