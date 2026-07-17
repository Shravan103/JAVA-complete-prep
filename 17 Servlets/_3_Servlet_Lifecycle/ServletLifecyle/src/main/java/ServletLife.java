import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {
	// This is used for Java Serialization.
	private static final long serialVersionUID = 1L;

	// This runs only once when the class is loaded into memory.
	// It is executed before the servlet object is created.
	static
	{
		System.out.println("1. Servlet is Loaded.");
	}
	
	// After loading the class, Tomcat creates one servlet object.
	// The constructor executes once.
	public ServletLife()
	{
		System.out.println("2. Servlet object is created.");
	}
	
	// This method is called immediately after the constructor.
	// It is also called only once.
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("3. Servlet Initialised.");
	}

	// When Tomcat is shutting down, redeploying the application, or unloading the servlet, it calls destroy() once.
	public void destroy() 
	{
		System.out.println("5. Servlet Destroyed");
	}

	// Every time the browser sends a request, Tomcat calls service().
	// If you refresh the page 10 times, this method executes 10 times.
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("4. Service method to handle HTTP Requests and to Respond back.");
	}

}

// URL to Run: http://localhost:8083/ServletLifecyle/ServletLife
