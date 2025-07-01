// 10-dao_pattern.java
// Purpose: Implement Data Access Object (DAO) pattern

import java.sql.*;

class User {
    private int id;
    private String name;
    private String email;

    // Constructor, getters, setters
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}

interface UserDAO {
    void addUser(User user);
    User getUserById(int id);
}

class UserDAOImpl implements UserDAO {
    private Connection conn;

    public UserDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.name);
            pstmt.setString(2, user.email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUserById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class DAOPatternExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            UserDAO userDAO = new UserDAOImpl(conn);

            User newUser = new User(0, "DAO User", "dao@example.com");
            userDAO.addUser(newUser);
            System.out.println("User added via DAO.");

            User fetchedUser = userDAO.getUserById(1);
            if (fetchedUser != null) {
                System.out.println("Fetched user: " + fetchedUser);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
