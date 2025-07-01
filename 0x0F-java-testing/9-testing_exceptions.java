import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates how to test for exceptions in JUnit.
 */
class DivisionCalculator {
    int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}

public class ExceptionTest {

    @Test
    void testDivideByZero() {
        DivisionCalculator calc = new DivisionCalculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });

        assertEquals("Division by zero", exception.getMessage());
    }
}
