/**
 * File: 5-static_members.java
 * Description: Demonstrates static variables and static methods.
 */

public class Student {
    static String school = "Tech Academy";  // Shared among all instances
    String name;

    public Student(String name) {
        this.name = name;
    }

    public static void printSchool() {
        System.out.println("School: " + school);
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", School: " + school);
    }

    public static void main(String[] args) {
        Student.printSchool();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.printInfo();  // Name: Alice, School: Tech Academy
        s2.printInfo();  // Name: Bob, School: Tech Academy
    }
}

