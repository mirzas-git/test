<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.rizz.UserApp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub =(UserBean)application.getAttribute("ubean");
String fName=ub.getfName();
out.println("Welcome "+fName+"<br>");
%>

<a href="view">ViewProfile</a>
<a href="logout">Logout</a>


</body>
</html>