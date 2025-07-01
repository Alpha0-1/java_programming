/**
 * File: 10-student_class.java
 * Description: Full student class demonstrating constructors, access modifiers,
 * encapsulation, static members, and overridden methods.
 */

public class Student {
    private String name;
    private int age;
    private static String school = "Tech Academy";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setters
    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public static String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + school;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alpha", 22);
        Student s2 = new Student("Beta", 25);

        System.out.println(s1);  // Alpha (22) - Tech Academy
        System.out.println(s2);  // Beta (25) - Tech Academy
    }
}

