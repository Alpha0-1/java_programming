# Java Generics Concepts and Best Practices

## Overview
Generics in Java allow you to write flexible and reusable code that works across multiple data types while ensuring compile-time type safety.

## Topics Covered
1. [Generic Classes](0-generic_classes.java)
2. [Generic Methods](1-generic_methods.java)
3. [Bounded Generics](2-bounded_generics.java)
4. [Wildcard Generics](3-wildcards.java)
5. [Generics and Inheritance](4-generic_inheritance.java)
6. [Type Erasure](5-type_erasure.java)
7. [Generic Collections](6-generic_collections.java)
8. [Multiple Bounds](7-multiple_bounds.java)
9. [Generic Interfaces](8-generic_interfaces.java)
10. [Generic Utility Class](9-generic_utility_class.java)
11. [Generic Pair Class](10-pair_class.java)

## Best Practices
- Use generics to ensure type safety instead of using `Object` and casting.
- Prefer bounded type parameters (`<T extends SomeClass>`) when restricting input types.
- Use wildcards (`<?>`, `<? extends T>`, `<? super T>`) when reading from collections.
- Avoid raw types (e.g., `List` instead of `List<String>`).
- Understand type erasure – generics are compile-time only.
- Always provide documentation and examples in your generic implementations.

## How to Run
Compile and run each `.java` file individually:
```bash
javac *.java
java 0-generic_classes
