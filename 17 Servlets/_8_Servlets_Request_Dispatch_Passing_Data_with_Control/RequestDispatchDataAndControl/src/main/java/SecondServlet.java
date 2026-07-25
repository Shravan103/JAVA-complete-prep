import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        System.out.println("Control in second servlet");

        // request.getSession(false) does one of two things:
        // 1. Return existing session.
        // 2. Don't create a new one.
        HttpSession session = request.getSession(false);

        // Retrieve the name:
        // getAttribute() returns an Object, Since we know it's actually a String, we cast it:
        String name = (String) session.getAttribute("name");

        PrintWriter writer = response.getWriter();

        writer.println("<h1>Response from Second Servlet</h1>" + "<h1>" + name + "</h1>");

        writer.close();
	}

}
