package com.rizz.UserApp;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		UserBean ub = new UserBean(); //loading the bean object 
		ub.setuName(req.getParameter("uname"));
		ub.setpWord(req.getParameter("pword"));
		ub.setfName(req.getParameter("fname"));
		ub.setlName(req.getParameter("lname"));
		ub.setAddress(req.getParameter("addr"));
		ub.setMailId(req.getParameter("eid"));
		ub.setPhNo(Long.parseLong(req.getParameter("phno")));

		RegisterDAO ob = new RegisterDAO();

		int k = ob.insert(ub);   // inserting bean object into DB using DAO class
		if (k > 0) {			
			req.setAttribute("msg", "User Registered Successfully !!!");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}

	}
}
