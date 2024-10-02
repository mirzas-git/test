<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.rizz.UserApp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fName=(String)request.getAttribute("fname");
out.println("Welcome "+fName+"<br>");
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println(ub.getfName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"+ub.getAddress()+"&nbsp&nbsp"+ub.getMailId()+"&nbsp&nbsp"+ub.getPhNo());
%>  
<a href="edit">Edit</a> <br>
<a href="logout">Logout</a>

</body>
</html>