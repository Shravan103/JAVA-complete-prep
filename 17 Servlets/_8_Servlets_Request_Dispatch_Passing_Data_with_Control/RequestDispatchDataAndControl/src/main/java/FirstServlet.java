import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Control in first Servlet");

        // These lines read the values submitted from the HTML form:
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        // Creates an object that knows how to transfer the request to SecondServlet:
        RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");

        // request.getSession() does one of two things:
        // 1. If a session already exists, it returns it.
        // 2. If no session exists, it creates a new one.
        HttpSession session = request.getSession();
        
        // Store data in the session:
        session.setAttribute("name", name);

        // Now control goes to "SecondServlet", The browser URL does not change:
        reqDispatch.forward(request, response);
        // The URL changes when you use sendRedirect(), not forward().

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Response from Servlet One</h1>");
        writer.close();

        // System.out.println("Control again in first servlet");
	}

}

//	OUTPUT:
//	Control in first Servlet
//	Control in second servlet

//	Why use setAttribute()?
//	→ Suppose another servlet needs the username.
//	→ Instead of sending it again through the URL,
//	→ store it in the session.
//	→ Any servlet can later retrieve it.