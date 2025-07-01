import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates various assertion types in JUnit 5.
 */
public class AssertionsTest {

    @Test
    void testBasicAssertions() {
        assertEquals(4, 2 + 2);
        assertNotEquals(5, 2 + 2);
        assertTrue(3 > 2);
        assertFalse(3 < 2);
    }

    @Test
    void testArrayAssertion() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    void testListEquality() {
        List<String> list = Arrays.asList("apple", "banana");
        assertNotNull(list);
        assertEquals(2, list.size());
        assertTrue(list.contains("banana"));
    }
}
