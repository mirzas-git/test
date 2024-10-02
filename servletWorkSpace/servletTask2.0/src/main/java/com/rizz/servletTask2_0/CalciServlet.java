package com.rizz.servletTask2_0;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/calcutate")
public class CalciServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

		int num1 = Integer.parseInt(arg0.getParameter("fn"));
		int num2 = Integer.parseInt(arg0.getParameter("sn"));
		String operator = arg0.getParameter("op");
		int res = 0;

		arg1.setContentType("text/html");
		PrintWriter pw = arg1.getWriter();

		switch (operator) {
		case "+":
			res = num1 + num2;
			pw.println(res);
			break;
		case "-":
			res = num1 - num2;
			pw.println(res);
			break;
		case "*":
			res = num1 * num2;
			pw.println(res);
			break;
		case "/":
			res = num1 / num2;
			pw.println(res);
			break;
		}

	}

}
