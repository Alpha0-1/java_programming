import org.junit.jupiter.api.*;

/**
 * Demonstrates setup and teardown lifecycle methods.
 */
public class LifecycleTest {

    private int counter;

    @BeforeEach
    void beforeEach() {
        counter = 0;
        System.out.println("Resetting counter to 0");
    }

    @Test
    void testIncrementOnce() {
        counter++;
        assertEquals(1, counter);
    }

    @Test
    void testIncrementTwice() {
        counter += 2;
        assertEquals(2, counter);
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test finished. Final value: " + counter);
    }
}
