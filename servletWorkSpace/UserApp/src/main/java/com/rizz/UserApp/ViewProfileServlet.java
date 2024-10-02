package com.rizz.UserApp;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		Cookie c[]=req.getCookies();
		if(c[0]==null) {
			req.setAttribute("msg", "Session Expired......");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else {
			String fn=c[0].getValue();
			req.setAttribute("fname",fn);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
		}
	}
	
}
