import java.sql.*;

public class InsertJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee"; // Your link/DB_name
        String user = "root"; // Your username
        String password = ""; // Your password

        // INSERT and SELECT queries
        String query1 = "INSERT INTO users(username, email) VALUES('Rakesh','Rakesh@gmail.com')";
        String query2 = "SELECT * FROM users";

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create statement
            Statement stmt = conn.createStatement();

            // Insert data
            int rowsInserted = stmt.executeUpdate(query1);
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully.\n");
            }

            // Fetch and display data
            ResultSet rs = stmt.executeQuery(query2);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("username");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
