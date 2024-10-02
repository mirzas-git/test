package com.rizz.servletTask4;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import java.util.*;

@WebServlet("/employee")
public class EmployeeServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException { 

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		int eid = Integer.parseInt(arg0.getParameter("empid"));
		String ename = arg0.getParameter("empname");
		double esal = Double.parseDouble(arg0.getParameter("empsal"));
		String gender = arg0.getParameter("gender");
		String profile = arg0.getParameter("profile");
		String hoby = "";
		String state = arg0.getParameter("st");
		String eaddress = arg0.getParameter("empaddress");
		String[] hobbies = arg0.getParameterValues("hobby");
		PrintWriter pw = arg1.getWriter();
		EmployeeBean eb = new EmployeeBean();
		eb.setEmployeeId(eid);
		eb.setEmployeeName(ename);
		eb.setEmployeeSalary(esal);
		eb.setEmployeeGender(gender);
		eb.setEmployeeProfile(profile);
		eb.setEmployeeState(state);
		eb.setEmployeeAddress(eaddress);
		for (String s : hobbies) {
			hoby += s + " ";
		}
		eb.setEmployeehobbies(hoby);  
//		pw.println(eb);
		

		int k = new EmployeeDAO().registerEmployee(eb);
		if (k > 0) {
			pw.println("Employee Registered");
		}

		List<EmployeeBean> l = new EmployeeDAO().retrieveEmployee();
		for (EmployeeBean e : l) {
			pw.println(e);
		}

	}

}
