import java.sql.*;
import java.util.Scanner;

public class DynamicInsertJDBC {
    public static void main(String[] args)
    {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";  // Your MySQL username
        String password = "";  // Your MySQL password

        // SQL query with placeholders maeked as (?)
        String query = "INSERT INTO employees (name, email) VALUES (?, ?)";

        try {
            // Load driver and connect
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create PreparedStatement
            PreparedStatement ps = conn.prepareStatement(query);

            // Take dynamic input from user
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of employees to insert: ");
            int count = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            for (int i = 1; i <= count; i++) {
                System.out.println("Enter details for employee #" + i);

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                // Set values in the PreparedStatement
                // 1 specifies 1st ?, 2 specifies 2nd ?
                ps.setString(1, name);
                ps.setString(2, email);

                // Execute insert
                ps.executeUpdate();
                System.out.println("Inserted successfully.\n");
            }

            // Close resources
            ps.close();
            conn.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
