/**
 * 6-comparator_interface.java
 * Demonstrates the use of Comparator for custom sorting logic.
 */

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + " - " + score;
    }

    public int getScore() {
        return score;
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 88));
        students.add(new Student("Alice", 95));

        // Sort by descending score using Comparator
        students.sort((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));

        for (Student s : students) {
            System.out.println(s);  // Sorted by score descending
        }
    }
}
