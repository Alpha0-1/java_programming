// 7-stored_procedures.java
// Purpose: Call stored procedures using CallableStatement

import java.sql.*;

public class StoredProcedures {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        String callSQL = "{CALL get_user_by_id(?)}"; // Assume this SP exists
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             CallableStatement cstmt = conn.prepareCall(callSQL)) {

            cstmt.setInt(1, 1);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                System.out.println("User: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
