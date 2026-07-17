import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")	// Should match with the 'action' of index.html
public class FirstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//	It runs only once when Tomcat creates the servlet object.
	//	Output appears in the server console, not in the browser.
	public FirstServletApp() {
        System.out.println("Servlet object is created internally by container");
    }
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        String name = request.getParameter("uname");
        String ucity = request.getParameter("ucity");

        // The response object represents the HTTP response that will be sent back to the browser.
        // getWriter() gives you a PrintWriter object that lets you write text into that response.
        // Think of it like opening a pen to write on the web page.
        PrintWriter writer = response.getWriter();
        
        // 1. Directly writing text:
//        writer.println("Hello " + name);
//        writer.println("I know you're from " + ucity);
        
        // 2. In a better UI way:
        writer.println("<html><head><title>Second App</title></head>");
        writer.println("<body bgcolor='cyan'><h1><marquee>Welcome to our dynamic app</marquee></h1>");
        writer.println("<table>");
        writer.println("<tr><th>NAME</th><th>CITY</th></tr>");
        writer.println("<tr><td>" + name + "</td><td>" + ucity + "</td></tr>");

        writer.println("</table></body>");
        writer.println("</html>");

        writer.close();
        
        writer.close();
	}

}
