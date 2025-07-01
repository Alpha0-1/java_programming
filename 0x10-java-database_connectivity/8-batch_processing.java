// 8-batch_processing.java
// Purpose: Execute batch operations efficiently

import java.sql.*;

public class BatchProcessing {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            conn.setAutoCommit(false); // Turn off auto-commit

            // Add multiple batches
            for (int i = 1; i <= 5; i++) {
                pstmt.setString(1, "User" + i);
                pstmt.setString(2, "user" + i + "@example.com");
                pstmt.addBatch();
            }

            int[] result = pstmt.executeBatch();
            conn.commit();

            System.out.println(result.length + " records inserted in batch.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
