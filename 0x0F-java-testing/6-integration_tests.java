import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration test example involving multiple components.
 */
class Database {
    public boolean connect() {
        // Simulate connection logic
        return true; // Assume success
    }

    public int query(String sql) {
        // Simulate database query
        return 100; // Fake row count
    }
}

class ReportGenerator {
    private Database db;

    public ReportGenerator(Database db) {
        this.db = db;
    }

    public String generateReport() {
        if (!db.connect()) {
            return "Database connection failed";
        }

        int rows = db.query("SELECT * FROM users");
        return "Generated report with " + rows + " entries.";
    }
}

public class IntegrationTests {

    @Test
    void testReportGeneration() {
        Database mockDb = mock(Database.class);
        when(mockDb.connect()).thenReturn(true);
        when(mockDb.query("SELECT * FROM users")).thenReturn(50);

        ReportGenerator generator = new ReportGenerator(mockDb);
        String result = generator.generateReport();

        assertEquals("Generated report with 50 entries.", result);
    }
}
