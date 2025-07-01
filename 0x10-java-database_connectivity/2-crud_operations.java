// 2-crud_operations.java
// Purpose: Perform basic CRUD operations

import java.sql.*;

public class CRUDEOperations {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {

            // Create table
            String createSQL = "CREATE TABLE IF NOT EXISTS users (" +
                               "id INT PRIMARY KEY AUTO_INCREMENT, " +
                               "name VARCHAR(50), email VARCHAR(100))";
            stmt.executeUpdate(createSQL);
            System.out.println("Table created or already exists.");

            // Insert data
            String insertSQL = "INSERT INTO users (name, email) VALUES ('Alice', 'alice@example.com')";
            int rowsInserted = stmt.executeUpdate(insertSQL, Statement.RETURN_GENERATED_KEYS);
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted.");
            }

            // Read data
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Update data
            String updateSQL = "UPDATE users SET name = 'Alice Smith' WHERE id = 1";
            int rowsUpdated = stmt.executeUpdate(updateSQL);
            System.out.println(rowsUpdated + " row(s) updated.");

            // Delete data
            String deleteSQL = "DELETE FROM users WHERE id = 1";
            int rowsDeleted = stmt.executeUpdate(deleteSQL);
            System.out.println(rowsDeleted + " row(s) deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
