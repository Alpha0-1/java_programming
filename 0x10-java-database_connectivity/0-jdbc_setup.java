// 0-jdbc_setup.java
// Purpose: Load and register JDBC driver

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class JDBCDriverSetup {
    public static void main(String[] args) {
        // Ensure MySQL JDBC driver is available in classpath
        try {
            // Load the driver class dynamically
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully.");

            // Optional: List all registered drivers
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                System.out.println("Registered driver: " + drivers.nextElement().getClass().getName());
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load JDBC driver.");
            e.printStackTrace();
        }
    }
}
