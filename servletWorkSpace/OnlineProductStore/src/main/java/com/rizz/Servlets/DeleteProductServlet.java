package com.rizz.Servlets;
import java.io.*;

import com.rizz.DAOs.DeleteProductDAO;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/DeleteProduct")
public class DeleteProductServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired !!");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			
			String pCode=req.getParameter("pcode");
			int k=new DeleteProductDAO().delete(pCode);
			if(k>0) {
				req.setAttribute("msg", "Product Deleted Successfully !!");
				req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
			}
		}
		
		
		
	}
}
