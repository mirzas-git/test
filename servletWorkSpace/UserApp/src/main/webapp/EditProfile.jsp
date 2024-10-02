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

UserBean ub=(UserBean)application.getAttribute("ubean");
%>

<form action="update" method="post">

FirstName: <input type="text" name="fname" value=<%=ub.getfName()%>> <br>
Mail-Id: <input type="text" name="mid" value=<%=ub.getMailId()%>> <br>
Phone-No <input type="text" name="phno" value=<%= ub.getPhNo()%>>  <br>

<input type="submit" value="Update">


</form>
</body>
</html>