/**
 * 7-dynamic_arrays.java
 * 
 * This file demonstrates dynamic arrays in Java using ArrayList and other collections.
 * Topics covered:
 * - Introduction to ArrayList
 * - Basic ArrayList operations (add, remove, get, set)
 * - ArrayList vs Arrays comparison
 * - ArrayList methods and utilities
 * - Generic types with ArrayList
 * - Performance considerations
 * - ArrayList with custom objects
 * - Other dynamic collections (Vector, LinkedList)
 * 
 * @author Alpha0-1
 */

import java.util.*;

public class DynamicArrays {
    
    /**
     * Main method to demonstrate dynamic array operations
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Dynamic Arrays (ArrayList) Demonstration ===\n");
        
        // 1. Basic ArrayList operations
        System.out.println("1. Basic ArrayList Operations:");
        demonstrateBasicOperations();
        
        // 2. ArrayList vs Arrays comparison
        System.out.println("\n2. ArrayList vs Arrays Comparison:");
        compareArrayListVsArrays();
        
        // 3. ArrayList with different data types
        System.out.println("\n3. ArrayList with Different Data Types:");
        demonstrateGenericTypes();
        
        // 4. ArrayList utility methods
        System.out.println("\n4. ArrayList Utility Methods:");
        demonstrateUtilityMethods();
        
        // 5. ArrayList with custom objects
        System.out.println("\n5. ArrayList with Custom Objects:");
        demonstrateCustomObjects();
        
        // 6. Performance analysis
        System.out.println("\n6. Performance Analysis:");
        performanceAnalysis();
        
        // 7. Other dynamic collections
        System.out.println("\n7. Other Dynamic Collections:");
        demonstrateOtherCollections();
        
        // 8. Advanced ArrayList operations
        System.out.println("\n8. Advanced Operations:");
        demonstrateAdvancedOperations();
    }
    
    /**
     * Demonstrates basic ArrayList operations
     */
    public static void demonstrateBasicOperations() {
        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Initial ArrayList: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Is empty: " + numbers.isEmpty());
        
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 15); // Insert at index 1
        
        System.out.println("After adding elements: " + numbers);
        System.out.println("Size: " + numbers.size());
        
        // Accessing elements
        System.out.println("Element at index 0: " + numbers.get(0));
        System.out.println("Element at index 2: " + numbers.get(2));
        
        // Modifying elements
        numbers.set(0, 5);
        System.out.println("After setting index 0 to 5: " + numbers);
        
        // Removing elements
        numbers.remove(1); // Remove by index
        System.out.println("After removing index 1: " + numbers);
        
        numbers.remove(Integer.valueOf(30)); // Remove by value
        System.out.println("After removing value 30: " + numbers);
        
        // Checking if element exists
        System.out.println("Contains 20: " + numbers.contains(20));
        System.out.println("Index of 20: " + numbers.indexOf(20));
    }
    
    /**
     * Compares ArrayList with traditional arrays
     */
    public static void compareArrayListVsArrays() {
        System.out.println("=== Arrays vs ArrayList Comparison ===");
        
        // Traditional Array
        System.out.println("Traditional Array:");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Fixed size: " + array.length);
        
        // ArrayList
        System.out.println("\nArrayList:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4); // Can add more elements dynamically
        System.out.println("ArrayList: " + list);
        System.out.println("Dynamic size: " + list.size());
        
        // Advantages of ArrayList
        System.out.println("\nArrayList Advantages:");
        System.out.println("- Dynamic resizing");
        System.out.println("- Built-in methods (add, remove, contains, etc.)");
        System.out.println("- Type safety with generics");
        System.out.println("- No need to manage size manually");
        
        // Advantages of Arrays
        System.out.println("\nArray Advantages:");
        System.out.println("- Faster access (no method call overhead)");
        System.out.println("- Less memory overhead");
        System.out.println("- Can store primitives directly");
        System.out.println("- Multi-dimensional support");
    }
    
    /**
     * Demonstrates ArrayList with different generic types
     */
    public static void demonstrateGenericTypes() {
        // String ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("String ArrayList: " + names);
        
        // Double ArrayList
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(19.99);
        prices.add(29.99);
        prices.add(39.99);
        System.out.println("Double ArrayList: " + prices);
        
        // Boolean ArrayList
        ArrayList<Boolean> flags = new ArrayList<>();
        flags.add(true);
        flags.add(false);
        flags.add(true);
        System.out.println("Boolean ArrayList: " + flags);
        
        // ArrayList of ArrayLists (2D dynamic array)
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(7, 8, 9));
        
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        
        System.out.println("2D ArrayList: " + matrix);
        System.out.println("Element at [1][2]: " + matrix.get(1).get(2));
    }
    
    /**
     * Demonstrates various ArrayList utility methods
     */
    public static void demonstrateUtilityMethods() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6));
        
        System.out.println("Original list: " + numbers);
        
        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted ascending: " + numbers);
        
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted descending: " + numbers);
        
        // Shuffling
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        
        // Finding min and max
        System.out.println("Minimum: " + Collections.min(numbers));
        System.out.println("Maximum: " + Collections.max(numbers));
        
        // Reversing
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        
        // Filling
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Collections.fill(words, "X");
        System.out.println("Filled with 'X': " + words);
        
        // Converting to array
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Converted to array: " + Arrays.toString(fruitArray));
        
        // Creating from array
        Integer[] intArray = {10, 20, 30, 40, 50};
        ArrayList<Integer> fromArray = new ArrayList<>(Arrays.asList(intArray));
        System.out.println("Created from array: " + fromArray);
    }
    
    /**
     * Demonstrates ArrayList with custom objects
     */
    public static void demonstrateCustomObjects() {
        ArrayList<Student> students = new ArrayList<>();
        
        // Adding student objects
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 22, 3.2));
        students.add(new Student("Charlie", 21, 3.9));
        students.add(new Student("Diana", 19, 3.7));
        
        System.out.println("Students list:");
        for (Student student : students) {
            System.out.println("  " + student);
        }
        
        // Sorting by different criteria
        System.out.println("\nSorted by name:");
        Collections.sort(students, Comparator.comparing(Student::getName));
        students.forEach(s -> System.out.println("  " + s));
        
        System.out.println("\nSorted by age:");
        Collections.sort(students, Comparator.comparing(Student::getAge));
        students.forEach(s -> System.out.println("  " + s));
        
        System.out.println("\nSorted by GPA (descending):");
        Collections.sort(students, Comparator.comparing(Student::getGpa).reversed());
        students.forEach(s -> System.out.println("  " + s));
        
        // Filtering (using streams)
        System.out.println("\nStudents with GPA > 3.5:");
        students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .forEach(s -> System.out.println("  " + s));
    }
    
    /**
     * Analyzes performance of ArrayList operations
     */
    public static void performanceAnalysis() {
        int size = 100000;
        
        // Test ArrayList performance
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long addTime = System.nanoTime() - startTime;
        
        // Accessing elements
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        long accessTime = System.nanoTime() - startTime;
        
        // Inserting at beginning (worst case)
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);
        }
        long insertTime = System.nanoTime() - startTime;
        
        System.out.println("ArrayList Performance (size: " + size + "):");
        System.out.printf("Add at end: %.2f ms%n", addTime / 1_000_000.0);
        System.out.printf("Access: %.2f ms%n", accessTime / 1_000_000.0);
        System.out.printf("Insert at beginning (1000 ops): %.2f ms%n", insertTime / 1_000_000.0);
        
        // Memory usage info
        System.out.println("Initial capacity: 10 (default)");
        System.out.println("Growth factor: 1.5x when capacity exceeded");
        System.out.println("Current size: " + arrayList.size());
    }
    
    /**
     * Demonstrates other dynamic collection types
     */
    public static void demonstrateOtherCollections() {
        // Vector (synchronized ArrayList)
        System.out.println("=== Vector ===");
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Vector: " + vector);
        System.out.println("Capacity: " + vector.capacity());
        
        // LinkedList (doubly-linked list)
        System.out.println("\n=== LinkedList ===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.addFirst("New First");
        linkedList.addLast("New Last");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        
        // Performance comparison
        System.out.println("\n=== Performance Comparison ===");
        System.out.println("ArrayList: Fast random access, slow insertion/deletion in middle");
        System.out.println("LinkedList: Slow random access, fast insertion/deletion anywhere");
        System.out.println("Vector: Like ArrayList but synchronized (thread-safe)");
    }
    
    /**
     * Demonstrates advanced ArrayList operations
     */
    public static void demonstrateAdvancedOperations() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        
        // Set operations
        ArrayList<Integer> union = new ArrayList<>(list1);
        union.addAll(list2);
        System.out.println("Union (with duplicates): " + union);
        
        // Remove duplicates from union
        ArrayList<Integer> uniqueUnion = new ArrayList<>(new LinkedHashSet<>(union));
        System.out.println("Union (unique): " + uniqueUnion);
        
        // Intersection
        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection: " + intersection);
        
        // Difference
        ArrayList<Integer> difference = new ArrayList<>(list1);
        difference.removeAll(list2);
        System.out.println("Difference (list1 - list2): " + difference);
        
        // Sublist
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> sublist = numbers.subList(2, 7);
        System.out.println("Original: " + numbers);
        System.out.println("Sublist [2, 7): " + sublist);
        
        // Bulk operations
        ArrayList<Integer> bulk = new ArrayList<>();
        Collections.addAll(bulk, 10, 20, 30, 40, 50);
        System.out.println("Bulk added: " + bulk);
        
        // Clear and check
        bulk.clear();
        System.out.println("After clear: " + bulk + " (empty: " + bulk.isEmpty() + ")");
    }
    
    /**
     * Custom Student class for demonstration
     */
    static class Student {
        private String name;
        private int age;
        private double gpa;
        
        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }
        
        // Getters
        public String getName() { return name; }
        public int getAge() { return age; }
        public double getGpa() { return gpa; }
        
        @Override
        public String toString() {
            return String.format("Student{name='%s', age=%d, gpa=%.1f}", name, age, gpa);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student student = (Student) obj;
            return age == student.age &&
                   Double.compare(student.gpa, gpa) == 0 &&
                   Objects.equals(name, student.name);
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(name, age, gpa);
        }
    }
}
