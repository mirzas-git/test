package com.rizz.Servlets;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet {
 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	 HttpSession hs = req.getSession(false);
	 if(hs==null) {
		 req.setAttribute("msg", "Session Expired !!");
		 req.getRequestDispatcher("Msg.jsp").forward(req, res);
	 }else {
		
		 hs.removeAttribute("abean");
		 hs.removeAttribute("plist");
		 hs.invalidate();
		 req.setAttribute("msg", "Logged Out Successfully !!<br>");
		 req.getRequestDispatcher("Msg.jsp").forward(req, res);
		 
	 }
	 
	 
 }
}
