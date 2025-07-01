// 9-database_metadata.java
// Purpose: Retrieve metadata about the database and tables

import java.sql.*;

public class DatabaseMetadata {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            DatabaseMetaData dbMeta = conn.getMetaData();

            System.out.println("Database Product Name: " + dbMeta.getDatabaseProductName());
            System.out.println("Database Version: " + dbMeta.getDatabaseProductVersion());
            System.out.println("JDBC Driver Version: " + dbMeta.getDriverVersion());

            // Get table metadata
            try (ResultSet tables = dbMeta.getTables(null, null, "%", new String[]{"TABLE"})) {
                System.out.println("\nAvailable Tables:");
                while (tables.next()) {
                    System.out.println(tables.getString("TABLE_NAME"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
