/**
 * Demonstrates variable scope and lifetime in Java methods.
 */
public class Scope {
    // Class-level variable (accessible throughout the class)
    private static int classLevelVar = 10;

    public static void main(String[] args) {
        int mainLevelVar = 20;  // Accessible only inside main

        System.out.println("Class-level variable: " + classLevelVar);
        System.out.println("Main-level variable: " + mainLevelVar);

        someMethod();

        // Uncommenting the next line would cause an error:
        // System.out.println("Inside block variable: " + insideBlock);
    }

    public static void someMethod() {
        int methodLevelVar = 30;  // Accessible only inside this method
        System.out.println("Method-level variable: " + methodLevelVar);

        if (true) {
            int insideBlock = 40;  // Accessible only inside this block
            System.out.println("Inside-block variable: " + insideBlock);
        }

        // Uncommenting the next line would cause an error:
        // System.out.println("Inside block variable outside block: " + insideBlock);
    }
}
