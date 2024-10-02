package com.rizz.Servlets;

import java.io.*;

import com.rizz.Beans.ProductBean;
import com.rizz.DAOs.AddProductDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/AddProduct")

public class AddProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ProductBean pb = new ProductBean();
		pb.setpCode(req.getParameter("pcode"));
		pb.setpName(req.getParameter("pname"));
		pb.setPrice(Double.parseDouble(req.getParameter("price")));
		pb.setPqty(Integer.parseInt(req.getParameter("pqty")));

		int k = new AddProductDAO().addproduct(pb);
		if (k == 0) {
			req.setAttribute("msg", "invalid Product");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);

		} else {
			req.setAttribute("msg", "Product Added Successfully !! <br>");
			req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
		}
	}
}
