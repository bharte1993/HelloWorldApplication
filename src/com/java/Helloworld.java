package com.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helloworld extends HttpServlet {
   protected void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException {
	    String Message=request.getParameter("message");
		request.setAttribute("message",Message);
		request.getRequestDispatcher("/showhelloWorld.jsp").forward(request,response);
		}
}
