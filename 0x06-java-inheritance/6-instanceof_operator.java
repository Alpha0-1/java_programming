/**
 * 6-instanceof_operator.java
 * Demonstrates use of instanceof operator for runtime type checking.
 */

class Person {}
class Student extends Person {}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Student();

        System.out.println(p1 instanceof Person);   // true
        System.out.println(p2 instanceof Student);  // true
        System.out.println(p1 instanceof Student);  // false

        if (p2 instanceof Student) {
            Student s = (Student) p2;
            System.out.println("Cast successful");
        }
    }
}
