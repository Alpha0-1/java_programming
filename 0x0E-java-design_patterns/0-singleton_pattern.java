/**
 * @file 0-singleton_pattern.java
 * @brief Singleton Pattern Implementation
 *
 * Ensures a class has only one instance and provides a global point of access to it.
 */

class Database {
    // Static reference to itself
    private static Database instance;

    // Private constructor to prevent instantiation from outside
    private Database() {
        System.out.println("Database instance created.");
    }

    /**
     * Provides access to the single instance of the Database class.
     *
     * @return The singleton instance of Database
     */
    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    /**
     * Simulates connecting to the database.
     */
    public void connect() {
        System.out.println("Connected to the database.");
    }
}

public class MainSingleton {
    public static void main(String[] args) {
        // Get the single instance of Database
        Database db1 = Database.getInstance();
        db1.connect();

        // Attempting to get another instance returns the same object
        Database db2 = Database.getInstance();
        db2.connect();

        // Verify both instances are the same
        System.out.println("Same instance? " + (db1 == db2));
    }
}
