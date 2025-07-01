import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates the basics of writing a JUnit 5 test case.
 */
public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtraction() {
        int result = subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    // Simple methods under test
    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }
}
