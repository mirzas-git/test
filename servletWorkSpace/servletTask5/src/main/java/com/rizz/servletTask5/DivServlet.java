package com.rizz.servletTask5;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/div")

public class DivServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		int val1 = Integer.parseInt(req.getParameter("val1"));
		int val2 = Integer.parseInt(req.getParameter("val2"));
		int result = val1 / val2; 
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println(val1+" / "+val2+" = "+result);
		RequestDispatcher rd = req.getRequestDispatcher("home.html");
		rd.include(req, res);
	}

}
