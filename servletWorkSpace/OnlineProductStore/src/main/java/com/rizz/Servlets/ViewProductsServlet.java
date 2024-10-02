package com.rizz.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.rizz.Beans.ProductBean;
import com.rizz.DAOs.ViewProductsDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/View")
public class ViewProductsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		HttpSession hs = req.getSession(false);

		if (hs == null) {
			req.setAttribute("msg", "Session Expired !!");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		} else {
			ArrayList<ProductBean> pl = new ViewProductsDAO().getProducts();
			if (pl == null) {
				req.setAttribute("msg", "Products not available !!");
				req.getRequestDispatcher("Msg.jsp").forward(req, res);
			} else {
				hs.setAttribute("plist", pl);
				req.getRequestDispatcher("ViewProducts.jsp").forward(req, res);
			}

		}

	}

}
