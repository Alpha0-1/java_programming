/**
 * @file 10-pattern_comparison.java
 * @brief Comparison of Design Patterns
 *
 * This file gives a brief explanation of when to use which pattern.
 */

public class PatternComparison {
    public static void main(String[] args) {
        System.out.println("Design Pattern Use Cases:\n");

        System.out.println("1. Singleton Pattern:");
        System.out.println("Use when you need exactly one instance of a class (e.g., configuration manager, database connection).");

        System.out.println("\n2. Factory Pattern:");
        System.out.println("Use when the exact type of object isn't known until runtime (e.g., cross-platform UI creation).");

        System.out.println("\n3. Observer Pattern:");
        System.out.println("Use when a change to one object requires changing others (e.g., event handling systems).");

        System.out.println("\n4. Decorator Pattern:");
        System.out.println("Use when you want to add functionality to an object dynamically (e.g., adding toppings to a coffee).");

        System.out.println("\n5. Strategy Pattern:");
        System.out.println("Use when you have multiple algorithms for a task and want to switch between them at runtime (e.g., payment methods).");

        System.out.println("\n6. Builder Pattern:");
        System.out.println("Use when constructing complex objects step-by-step (e.g., building a custom PC).");

        System.out.println("\n7. Adapter Pattern:");
        System.out.println("Use when integrating legacy or third-party code with your system (e.g., old API with new interface).");

        System.out.println("\n8. Facade Pattern:");
        System.out.println("Use when simplifying interaction with a complex subsystem (e.g., boot sequence in OS startup).");

        System.out.println("\n9. Command Pattern:");
        System.out.println("Use when you want to parameterize objects with operations (e.g., transaction rollback, logging commands).");

        System.out.println("\n10. MVC Pattern:");
        System.out.println("Use when separating concerns in UI applications (e.g., web frameworks like Spring MVC).");
    }
}
