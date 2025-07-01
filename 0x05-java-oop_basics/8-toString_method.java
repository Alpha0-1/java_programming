/**
 * File: 8-toString_method.java
 * Description: Demonstrates overriding the toString() method.
 */

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }

    public static void main(String[] args) {
        Person p = new Person("John", 30);
        System.out.println(p);  // Implicitly calls toString()
    }
}

