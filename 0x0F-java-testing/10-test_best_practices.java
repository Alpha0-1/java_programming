import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates best practices in writing clean and maintainable tests.
 */
public class BestPracticesTest {

    /**
     * Best Practice: Write clear and descriptive test names.
     */
    @Test
    void shouldReturnTrueWhenInputIsPositive() {
        assertTrue(isPositive(5));
    }

    /**
     * Best Practice: Keep tests independent and focused.
     */
    @Test
    void shouldReturnFalseWhenInputIsNegative() {
        assertFalse(isPositive(-3));
    }

    /**
     * Best Practice: Use helper methods for repeated logic.
     */
    private boolean isPositive(int number) {
        return number > 0;
    }
}
