package com.rizz.servletTask5;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/prime")

public class PrimeServlet extends GenericServlet {
	
	public boolean checkPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)return false;
		}
		return true;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		int val1 = Integer.parseInt(req.getParameter("val1"));
		int val2 = Integer.parseInt(req.getParameter("val2"));					
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println(val1+" is prime "+checkPrime(val1)+"<br>");
		pw.println(val2+" is prime "+checkPrime(val2)+"<br>");		
		RequestDispatcher rd = req.getRequestDispatcher("home.html");
		rd.include(req, res);
	}

}
   