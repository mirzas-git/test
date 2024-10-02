package com.rizz.servletTask5;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/fact")
@SuppressWarnings("serial")

public class FactorialServlet extends GenericServlet {
	
	public int getFactorial(int num) {
		int fact=1;
		if (num == 0 || num == 1) {
			fact = 1;
		} else {
			for (int i = num; i > 0; i--) {
				fact *= i;
			}
		}
		return fact;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		int val1 = Integer.parseInt(req.getParameter("val1"));
		int val2 = Integer.parseInt(req.getParameter("val2"));
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println(val1 + "! = " + getFactorial(val1)+"<br>");
		pw.println(val2 + "! = " + getFactorial(val2)+"<br>");
		RequestDispatcher rd = req.getRequestDispatcher("home.html");
		rd.include(req, res);
	}

}
