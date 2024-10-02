package com.rizz.UserApp;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
 
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet  extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		Cookie[] c = req.getCookies();
		if(c[0]==null) {
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			ServletContext sct=req.getServletContext();
			UserBean ub = (UserBean)sct.getAttribute("ubean");
			
			ub.setfName(req.getParameter("fname"));
			ub.setMailId(req.getParameter("mid"));
			ub.setPhNo(Long.parseLong(req.getParameter("phno")));
			
			UpdateProfileDAO up=new UpdateProfileDAO();
			
			int k=up.update(ub);
			if(k>0) {
				req.setAttribute("msg", "Profile Updated Successfully");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);			
			}
		}
	}
}
