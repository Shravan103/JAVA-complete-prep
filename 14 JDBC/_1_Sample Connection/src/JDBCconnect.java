import java.sql.*;

public class SelectExample {
    public static void main(String[] args) {
        // Database URL, username and password
        String url = "jdbc:mysql://localhost:3306/employee"; // replace with your DB name
        String user = "root"; // replace with your DB username
        String password = ""; // replace with your DB password

        // SQL SELECT query
        String query = "SELECT id, username FROM users"; // replace with your table and columns

        try {
            // Load JDBC driver (for MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create statement
            Statement stmt = conn.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery(query);

            // Process result set
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("username");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
