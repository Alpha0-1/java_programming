import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Demonstrates how to write parameterized tests.
 */
public class ParameterizedTestExample {

    @ParameterizedTest
    @CsvSource({
        "0, 0, 0",
        "1, 1, 2",
        "2, 3, 5",
        "5, 8, 13"
    })
    void testAddition(int a, int b, int expected) {
        assertEquals(expected, add(a, b));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
