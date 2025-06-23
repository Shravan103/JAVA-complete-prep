import dao.UserDAO;
import dao.UserDAOImpl;
import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import model.User;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            UserDAO userDAO = new UserDAOImpl(conn);
            int choice;

            do {
                System.out.println("\n===== User Management Menu =====");
                System.out.println("1. Add User");
                System.out.println("2. Get User by ID");
                System.out.println("3. Update User Email");
                System.out.println("4. Delete User");
                System.out.println("5. List All Users");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        User newUser = new User(id, name, email);
                        userDAO.addUser(newUser);
                        System.out.println("User added.");
                        break;

                    case 2:
                        System.out.print("Enter ID to fetch: ");
                        int fetchId = scanner.nextInt();
                        User fetchedUser = userDAO.getUserById(fetchId);
                        if (fetchedUser != null) {
                            System.out.println("User found: " + fetchedUser.getId() + " " +
                                    fetchedUser.getName() + " " + fetchedUser.getEmail());
                        } else {
                            System.out.println("User not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        User userToUpdate = userDAO.getUserById(updateId);
                        if (userToUpdate != null) {
                            System.out.print("Enter new email: ");
                            String newEmail = scanner.nextLine();
                            userToUpdate.setEmail(newEmail);
                            userDAO.updateUser(userToUpdate);
                            System.out.println("User updated.");
                        } else {
                            System.out.println("User not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = scanner.nextInt();
                        userDAO.deleteUser(deleteId);
                        System.out.println("User deleted if existed.");
                        break;

                    case 5:
                        List<User> users = userDAO.getAllUsers();
                        System.out.println("\nAll Users:");
                        for (User u : users) {
                            System.out.println(u.getId() + " " + u.getName() + " " + u.getEmail());
                        }
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 0);

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
    }
}
