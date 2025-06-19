import java.sql.*;

public class createDBandTable {
    public static void main(String[] args) {
        String rootUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "companydb";
        String dbUrl = rootUrl + dbName;
        String user = "root"; // your MySQL username
        String password = ""; // your MySQL password

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 1: Connect to MySQL (no database yet)
            Connection conn1 = DriverManager.getConnection(rootUrl, user, password);
            Statement stmt1 = conn1.createStatement();

            // 📦 Step 2: Create database
            String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt1.executeUpdate(createDB);
            System.out.println("Database created or already exists.");

            stmt1.close();
            conn1.close();

            // Step 3: Connect to the newly created database
            Connection conn2 = DriverManager.getConnection(dbUrl, user, password);
            Statement stmt2 = conn2.createStatement();

            // 📦 Step 4: Create table
            String createTable = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "email VARCHAR(100)" +
                    ")";
            stmt2.executeUpdate(createTable);
            System.out.println("Table created or already exists.");

            // 📦 Step 5: Insert 1 entry
            String insertData = "INSERT INTO employees (name, email) VALUES " +
                "('Shravan', 'Shravan@gmail.com'), " +
                "('Ravi', 'ravi@gmail.com'), " +
                "('Anita', 'anita@gmail.com'), " +
                "('Raj', 'raj@gmail.com')";
            stmt2.executeUpdate(insertData);
            System.out.println("Data inserted successfully.");

            // 📦 Step 6 (optional): Display data
            ResultSet rs = stmt2.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Email: " + rs.getString("email"));
            }

            // Close everything
            rs.close();
            stmt2.close();
            conn2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
