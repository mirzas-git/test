package com.rizz.servletTask5;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/choice")
@SuppressWarnings("serial")
public class ChoiceServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		String choice = req.getParameter("calculate");
		switch(choice) {
		case "ADD":
			RequestDispatcher rd1=req.getRequestDispatcher("add");
			rd1.forward(req, res);
			break;
		case "SUB":
			RequestDispatcher rd2=req.getRequestDispatcher("sub");
			rd2.forward(req, res);
			break;
		case "MUL":
			RequestDispatcher rd3=req.getRequestDispatcher("mul");
			rd3.forward(req, res);
			break;  
		case "DIV":
			RequestDispatcher rd4=req.getRequestDispatcher("div");
			rd4.forward(req, res);
			break;
		case "MOD":
			RequestDispatcher rd5=req.getRequestDispatcher("mod");
			rd5.forward(req, res);
			break;
		case "FACTORIAL":
			RequestDispatcher rd6=req.getRequestDispatcher("fact");
			rd6.forward(req, res);
			break;	
			
		case "PRIME":
			RequestDispatcher rd7=req.getRequestDispatcher("prime");
			rd7.forward(req, res);
			break;
		    
		}  
	}
}
