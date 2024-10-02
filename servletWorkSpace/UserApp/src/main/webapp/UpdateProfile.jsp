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
String msg=(String)request.getAttribute("msg");
out.println(msg+"<br>");

%>

<%@include file="ViewProfile.jsp" %>

</body>
</html>