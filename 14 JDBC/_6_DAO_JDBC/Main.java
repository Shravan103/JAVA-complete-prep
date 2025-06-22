import dao.UserDAO;
import dao.UserDAOImpl;
import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import model.User;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            UserDAO userDAO = new UserDAOImpl(conn);

            // 1. Add user
            User user1 = new User(1, "Shravan", "shravan@example.com");
            userDAO.addUser(user1);

            // 2. Get user
            User fetchedUser = userDAO.getUserById(1);
            System.out.println("User fetched: " + fetchedUser.getName());

            // 3. Update user
            fetchedUser.setEmail("shravan.new@example.com");
            userDAO.updateUser(fetchedUser);

            // 4. Get all users
            List<User> users = userDAO.getAllUsers();
            for (User u : users) {
                System.out.println(u.getId() + " " + u.getName() + " " + u.getEmail());
            }

            // // 5. Delete user
            // userDAO.deleteUser(1);
            // System.out.println("User deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
