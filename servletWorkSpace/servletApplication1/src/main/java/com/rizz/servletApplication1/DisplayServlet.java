package com.rizz.servletApplication1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/dis")

public class DisplayServlet implements Servlet {

	
	@Override
	public void init(ServletConfig scf) throws ServletException{
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		String uName = req.getParameter("uname");
		String mId = req.getParameter("mailid");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("UserName: "+uName+"<br>");
		pw.println("MailId: "+mId+"<br>");
	}
	
	@Override
	public void destroy() {
		
	}
	
	
	@Override
	public String getServletInfo() {
		return "";
	}
	
	
	@Override    
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}
}
