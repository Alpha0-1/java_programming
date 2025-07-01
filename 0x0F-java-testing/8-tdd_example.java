import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TDD Example: Implementing a simple calculator using Test-Driven Development.
 */
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class TddExampleTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        Calculator calc = new Calculator();
        assertEquals(-1, calc.add(2, -3));
    }
}
