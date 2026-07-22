import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in the First Servlet.");
		
		// creates a RequestDispatcher object that knows where to send the request.
		RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");
		reqDispatch.forward(request, response);
		
		
		// Not executed at all: The "response" has already been forwarded and may already contain data from SecondServlet.
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response form First Servlet.</h1>");
		writer.close();
		
		// But, this will be executed:
		System.out.println("Control in the First Servlet after forward().");
	}

}

// 	WHAT IS FORWARD():
// 	I am done. Let the other servlet handle the rest of the request.

//	WORKFLOW:
// 	Browser
//     |
//     v
// 	FirstServlet
//     |
//     | forward()
//     v
// 	SecondServlet
//     |
//     v
// 	Browser

//	REAL WORLD USE CASE:
// 	Suppose you're building an online shopping website.
// 	LoginServlet
//       |
//       | forward()
//       v
// 	HomeServlet
// 	LoginServlet checks the username/password.
// 	If login succeeds, it forwards to HomeServlet.
// 	HomeServlet displays the home page.

// --------------------------------------------------------------------------------------------------------------------

// What is RequestDispatcher?
// RequestDispatcher is used when one servlet wants to pass control to another servlet, JSP, 
// or HTML resource on the server side.

// What will execute after forward()?
// 1. Normal Java code:
//	  System.out.println("After forward");
// 2. Variable assignments:
//	  int x = 10;
// 3. Calculations:
//	  int sum = 5 + 6;
// 4. Logging:
//    logger.info("Done");