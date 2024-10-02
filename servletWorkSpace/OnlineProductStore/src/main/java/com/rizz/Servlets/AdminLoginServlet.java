package com.rizz.Servlets;

import java.io.*;

import com.rizz.Beans.AdminBean;
import com.rizz.DAOs.AdminLoginDAO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/AdminLogin")
public class AdminLoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		AdminBean ab = new AdminLoginDAO().login(req.getParameter("uname"), req.getParameter("pword"));
		if(ab==null) {
			req.setAttribute("msg", "Admin Not Found");
			req.getRequestDispatcher("Msg.jsp").forward(req, res); 
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("abean", ab);
			req.setAttribute("fname", ab.getfName());
			req.getRequestDispatcher("AdminLoginSuccess.jsp").forward(req, res);
		}
		
		
		
		
	}
}
