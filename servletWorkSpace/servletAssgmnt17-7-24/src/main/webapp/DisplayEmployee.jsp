<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String empId = request.getParameter("eid");
	String empName = request.getParameter("ename");
	String empDesg = request.getParameter("edsg");
	float empSal = Float.parseFloat(request.getParameter("esal"));
	String empEmail = request.getParameter("emid");
	long empPhno = Long.parseLong(request.getParameter("ephno"));

	out.println("<br>====BookDetails====");
	out.println("<br>Employee-Id " + empId);
	out.println("<br>Employee Name " + empName);
	out.println("<br>Employee Designation " + empDesg);
	out.println("<br>Employee Salary " + empSal);
	out.println("<br>Employee Email-Id " + empEmail);
	out.println("<br>Employee Phno " + empPhno);
	%>

</body>
</html>