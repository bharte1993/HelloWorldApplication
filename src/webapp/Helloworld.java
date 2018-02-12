package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/helloworld")
public class Helloworld extends HttpServlet {
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException {
		request.setAttribute("message", "Hello World");
		request.getRequestDispatcher("/showhelloWorld").forward(request,response);
		
	}
	

}
