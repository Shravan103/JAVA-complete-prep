import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Register")
public class RegisterServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String ucity = request.getParameter("ucity");
        
        System.out.println("Name: "+ name + " City: "+ ucity);	// Printed in console
        
        response.sendRedirect("/ServletAppwithSeparateJSPandHTML/success.jsp");
	}

}
