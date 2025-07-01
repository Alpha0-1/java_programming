import org.junit.jupiter.api.*;

/**
 * Demonstrates common JUnit 5 annotations.
 */
public class AnnotationDemoTest {

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("Runs once before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Runs before each test");
    }

    @Test
    void testOne() {
        System.out.println("Running testOne");
        assertTrue(true);
    }

    @Test
    void testTwo() {
        System.out.println("Running testTwo");
        assertFalse(false);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Runs after each test");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("Runs once after all tests");
    }
}
