<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.rizz.Beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ProductBean pb=(ProductBean)request.getAttribute("pb");



%>
<form action="UpdateProduct" method="post">
ProductCode: <input type="text" value=<%=pb.getpCode() %> name="pcode"> <br>
ProductName: <input type="text" value=<%=pb.getpName() %> name="pname"> <br>
ProductPrice: <input type="text" value=<%=pb.getPrice() %> name="price"> <br>
ProductQty: <input type="text" value=<%=pb.getPqty() %> name="pqty"> <br>
<input type="submit" value="Update">




</form>











</body>
</html>