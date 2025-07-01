// 3-prepared_statements.java
// Purpose: Use PreparedStatement to prevent SQL injection

import java.sql.*;

public class PreparedStatements {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "Bob");
            pstmt.setString(2, "bob@example.com");

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " user added securely.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
