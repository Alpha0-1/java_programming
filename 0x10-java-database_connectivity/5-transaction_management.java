// 5-transaction_management.java
// Purpose: Manage transactions using JDBC

import java.sql.*;

public class TransactionManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            conn.setAutoCommit(false); // Start transaction

            try (PreparedStatement pstmt1 = conn.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)");
                 PreparedStatement pstmt2 = conn.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)")) {

                // First insert
                pstmt1.setString(1, "John");
                pstmt1.setString(2, "john@example.com");
                pstmt1.executeUpdate();

                // Second insert
                pstmt2.setString(1, "Jane");
                pstmt2.setString(2, "jane@example.com");
                pstmt2.executeUpdate();

                conn.commit(); // Commit transaction
                System.out.println("Transaction committed successfully.");

            } catch (SQLException e) {
                conn.rollback(); // Rollback on failure
                System.err.println("Transaction rolled back.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
