package com.rizz.UserApp;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		LoginDAO ld=new LoginDAO();
		UserBean ub=ld.logIn(req.getParameter("uName"), req.getParameter("pWord"));
		
		if(ub==null) {
			  
		}else {
			ServletContext sc=req.getServletContext();
			sc.setAttribute("ubean", ub);			
			Cookie ck=new Cookie("fname", ub.getfName());		// HTTP Status 500 – Internal Server Error if ub.getfName() used b/c fname contains space which is 
			res.addCookie(ck);
			RequestDispatcher rd=req.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(req, res);
		}			
	}
}
