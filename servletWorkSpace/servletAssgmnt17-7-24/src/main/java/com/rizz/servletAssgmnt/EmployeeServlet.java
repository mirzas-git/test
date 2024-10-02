package com.rizz.servletAssgmnt;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/emp")
@SuppressWarnings("serial")
public class EmployeeServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("DisplayEmployee.jsp");
		rd.forward(req, res);
	
	}
}
