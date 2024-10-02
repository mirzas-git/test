package com.rizz.servletTask1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/user")
  
public class UserInfoServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		String uid=arg0.getParameter("user_id");
		String fname=arg0.getParameter("f_name");
		String lname=arg0.getParameter("l_name");
		String mailid=arg0.getParameter("email_id");
		String phno=arg0.getParameter("phno");
		  
		PrintWriter pw = arg1.getWriter();
		arg1.setContentType("text/html");
		pw.println("UserId: "+uid+"<br>");
		pw.println("FName: "+fname+"<br>");
		pw.println("LName: "+lname+"<br>");
		pw.println("MailId: "+mailid+"<br>");
		pw.println("Phno: "+phno+"<br>");
	}

}
