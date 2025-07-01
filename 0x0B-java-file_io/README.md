# Java File I/O & Data Persistence Best Practices

This collection demonstrates essential file handling techniques in Java. Here are some best practices:

## General Tips
- Use **try-with-resources** to ensure automatic resource management.
- Prefer **NIO APIs** (`java.nio.file`) for modern and safer file operations.
- Always handle exceptions gracefully when working with files.
- Close streams manually or via try-with-resources to avoid leaks.

## Specific Advice
- For small text files: `FileReader` / `FileWriter`.
- For performance: Use `BufferedReader` / `BufferedWriter`.
- For binary  Use `FileInputStream` / `FileOutputStream`.
- To persist Java objects: Use `ObjectOutputStream` / `ObjectInputStream`.
- For structured  Parse CSV or JSON using libraries like OpenCSV or Jackson.
- For configurations: Use `.properties` files with `Properties` class.

## Tools & Libraries
- [Apache Commons IO](https://commons.apache.org/proper/commons-io/ )
- [OpenCSV](http://opencsv.sourceforge.net/)
- [Jackson](https://github.com/FasterXML/jackson )

Explore each file to understand specific I/O operations and their real-world applications.
