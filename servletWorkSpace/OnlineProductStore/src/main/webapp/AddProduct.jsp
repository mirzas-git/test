<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.rizz.Beans.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("This page belongs to "+ab.getfName()+"<br>");
String msg=(String)request.getAttribute("msg");
out.println(msg+"<br>");


%>
<a href="Product.html">AddProduct</a>
<a href="View">ViewAllProducts</a>
<a href="Logout">Logout</a>

</body>
</html>