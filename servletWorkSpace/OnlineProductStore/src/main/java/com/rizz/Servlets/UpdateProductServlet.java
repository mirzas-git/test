package com.rizz.Servlets;
import java.io.*;

import com.rizz.Beans.ProductBean;
import com.rizz.DAOs.UpdateProductDAO;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/UpdateProduct")

public class UpdateProductServlet extends HttpServlet {
 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired !!");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			ProductBean pb=new ProductBean();
			pb.setpCode(req.getParameter("pcode"));
			pb.setpName(req.getParameter("pname"));
			pb.setPrice(Double.parseDouble(req.getParameter("price")));
			pb.setPqty(Integer.parseInt(req.getParameter("pqty")));
			int k=new UpdateProductDAO().update(pb);
			if(k>0) {
				req.setAttribute("msg", "Product Updated Successfully");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}
		}
		
	}
}
