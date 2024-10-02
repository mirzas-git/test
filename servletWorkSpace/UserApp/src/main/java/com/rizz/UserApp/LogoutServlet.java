package com.rizz.UserApp;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		Cookie[] c = req.getCookies();
		if(c[0]==null) {
			
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			ServletContext sct = req.getServletContext();
			sct.removeAttribute("ubean");
			c[0].setMaxAge(0);
			res.addCookie(c[0]);
			req.setAttribute("msg", "Logout successfully..<br>");
			req.getRequestDispatcher("Logout.jsp").forward(req, res);
		}
	}
}
