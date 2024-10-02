<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.rizz.Beans.*"
    import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");

String fName=(String)ab.getfName();
ArrayList<ProductBean> pl=(ArrayList<ProductBean>) session.getAttribute("plist");
out.println("This page belongs to "+ fName+"<br>");
out.println("<br>"+"List Of Products...."+"<br>");
for(int i=0;i<pl.size();i++){
	ProductBean p=(ProductBean)pl.get(i); // URL RE-Writing
	out.println(p.getpCode()+"&nbsp&nbsp"+p.getpName()+"&nbsp&nbsp"+p.getPrice()+"&nbsp&nbsp"+p.getPqty()+"<a href='EditProduct?pcode="+p.getpCode()+"'>Edit</a>"+"&nbsp&nbsp"+"<a href='DeleteProduct?pcode="+p.getpCode()+"'>Delete</a>"+"<br>");
}
%>
<a href="Product.html">AddProduct</a>
<a href="Logout">Logout</a>
</body>
</html>