## Java Methods - Concepts and Best Practices
What Are Methods?
In Java, a method is a block of code that performs a specific task and is reusable. It helps organize code, reduce redundancy, and improve readability.

Key Concepts:
#1. Creating and Calling Methods
A method is defined using a return type, name, and optional parameters. To execute it, we call the method by its name.

#2. Parameters
You can pass values into methods using parameters . These act as local variables inside the method.

#3. Return Values
Methods can return results back to the caller using the return keyword.

#4. Method Overloading
Java allows overloading methods — defining multiple methods with the same name but different parameters

#5. Varargs (Variable Arguments)
Use type... syntax to allow a method to accept any number of arguments.

#6. Scope and Lifetime
Variables declared inside a method or block have limited scope and lifetime .

Local variables: Only accessible within the method/block they're declared.
Static/class variables: Shared across all instances of the class.

#7. Static vs Instance Methods
Static methods : Belong to the class, not an object. Can be called without instantiating the class.
Instance methods : Belong to an object and require an instance.

#8. Recursion
A method that calls itself is known as a recursive method. Useful for problems like factorials, tree traversal, etc

#9. Best Practices
Keep methods short and focused.
Use meaningful names for methods and parameters.
Prefer returning values rather than modifying global state.
Document your methods using Javadoc-style comments.
Handle edge cases and invalid inputs gracefully.
