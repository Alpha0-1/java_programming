import java.util.function.*;

/**
 * Demonstrates method references in Java.
 */
public class MethodReferences {
    public static void main(String[] args) {
        // Static method reference
        Function<Integer, Double> squareStatic = MathOperations::square;
        System.out.println("Square via static method: " + squareStatic.apply(5));

        // Instance method reference
        MathOperations ops = new MathOperations();
        Function<Integer, Double> cubeInstance = ops::cube;
        System.out.println("Cube via instance method: " + cubeInstance.apply(3));

        // Constructor reference
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Alice");
        System.out.println("Created person: " + person.getName());
    }

    // Functional interface for constructor reference
    @FunctionalInterface
    interface PersonFactory<P extends Person> {
        P create(String name);
    }

    static class Person {
        private String name;
        public Person(String name) { this.name = name; }
        public String getName() { return name; }
    }

    static class MathOperations {
        static double square(int x) { return x * x; }
        double cube(int x) { return x * x * x; }
    }
}
