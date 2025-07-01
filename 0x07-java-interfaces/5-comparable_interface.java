/**
 * 5-comparable_interface.java
 * Shows how to implement the Comparable interface to enable natural ordering.
 */

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Anna", 25));

        Collections.sort(people);

        for (Person p : people) {
            System.out.println(p);  // Output ordered by age
        }
    }
}
