// 4-result_set_handling.java
// Purpose: Process query results from a ResultSet

import java.sql.*;

public class ResultSetHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        String sql = "SELECT * FROM users";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.printf("ID: %d | Name: %s | Email: %s\n", id, name, email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
