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


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in the First Servlet.");
		
		// creates a RequestDispatcher object that knows where to send the request.
		RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");
		reqDispatch.include(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response form First Servlet.</h1>");
		writer.close();
		
		System.out.println("Control in the First Servlet after forward().");
	}

}

// 	OUTPUT:
// 	Control in the First Servlet.
//	Control in the Second Servlet.
// 	Control in the First Servlet after forward().

// 	WHAT IS INCLUDE():
//	Execute the second servlet, then come back and continue executing me.

// 	WORKFLOW:
//	Browser
//	   |
//	   v
//	FirstServlet
//	   |
//	   | include()
//	   v
//	SecondServlet
//	   |
//	   | returns
//	   v
//	FirstServlet
//	   |
//	   v
//	Browser

//	REAL WORLD USE CASE:
//	Suppose every page needs the same header and footer.
//	HomeServlet
//		|
//		| include()
//		|
//		+------> HeaderServlet
//		|
//		+------> FooterServlet
