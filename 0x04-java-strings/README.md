# Java Strings - Handling & Best Practices

This collection demonstrates best practices and essential techniques for working with strings in Java.

## Topics Covered:

| File | Topic |
|------|-------|
| `0-string_basics.java` | Creating and manipulating basic strings |
| `1-string_methods.java` | Commonly used string methods |
| `2-string_comparison.java` | Proper string comparison |
| `3-string_builder.java` | Efficient string manipulation with `StringBuilder` |
| `4-string_formatting.java` | Formatting strings using `String.format()` and `System.out.printf()` |
| `5-regex_basics.java` | Introduction to regular expressions |
| `6-string_parsing.java` | Extracting meaningful data from strings |
| `7-string_validation.java` | Validating user inputs |
| `8-text_processing.java` | Advanced text processing like word frequency |
| `9-string_algorithms.java` | Basic string manipulation algorithms |
| `10-palindrome_checker.java` | Detecting palindromes |

## Best Practices

- Always use `.equals()` instead of `==` to compare strings.
- Prefer `StringBuilder` when performing many concatenations.
- Validate inputs before parsing or processing.
- Use regex for complex pattern matching but keep it readable.
- Handle exceptions when parsing numeric or date values.
- Normalize strings (lowercase, trim, sanitize) before comparison or processing.

## Running Instructions

To compile and run any file:
```bash
javac [filename].java
java [ClassName]
