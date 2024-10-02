package com.rizz.Servlets;
import java.io.*;
import java.util.*;
import com.rizz.Beans.ProductBean;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/EditProduct")
public class EditProductServlet extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired !!!");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String pCode = req.getParameter("pcode");
			@SuppressWarnings("unchecked")
			ArrayList<ProductBean> pl=(ArrayList<ProductBean>)hs.getAttribute("plist");
			Iterator<ProductBean> itr=pl.iterator();
			while(itr.hasNext()) {
				ProductBean p=(ProductBean) itr.next();
				if(pCode.equals(p.getpCode())) {
					req.setAttribute("pb", p);
					req.getRequestDispatcher("EditProduct.jsp").forward(req, res);
					break;
				}
			}  
		}
		
		
		
	}
}    
