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
String msg=(String)request.getAttribute("msg");
out.println("<bold>"+msg+"</bold><br>");
%>
<header id="ribbon">
		<a href="CreateAccount.html"><button class="ribbonbutton">New Account</button></a>
		 <a href="CheckBalance.html"><button class="ribbonbutton">Balance</button></a>
		<a href="ValidateLogin?url='DepositAmount'"><button class="ribbonbutton">Deposit</button></a>
		<a href="WithdrawAmount"><button class="ribbonbutton">Withdraw</button></a>
		<a href="TransferAmount"><button class="ribbonbutton">Transfer</button></a>
		<a href="CloseAccount"><button class="ribbonbutton">CloseAccount</button></a>
		<a href="AccountLogin.html"><button class="ribbonbutton">Login</button></a>
	</header>


	<section id="forms">

		<div class="sub-forms">

			<p>In Java, static import concept is introduced in 1.5 version.
				With the help of static import, we can access the static members of
				a class directly without class name or any object. For Example: we
				always use sqrt() method of Math class by using Math class i.e.
				Math.sqrt(), but by using static import we can access sqrt() method
				directly. According to SUN microSystem, it will improve the code
				readability and enhance coding. But according to the programming
				experts, it will lead to confusion and not good for programming. If
				there is no specific requirement then we should not go for static
				import. Advantage of static import: If user wants to access any
				static member of class then less coding is required. Disadvantage of
				static import:</p>

		</div>


		<div class="sub-forms"
			style="border-right: 1px solid; border-left-color: black; border-left: 1px solid; border-left-color: black;">
		
		</div>

		<div class="sub-forms">

			<p>In Java, static import concept is introduced in 1.5 version.
				With the help of static import, we can access the static members of
				a class directly without class name or any object. For Example: we
				always use sqrt() method of Math class by using Math class i.e.
				Math.sqrt(), but by using static import we can access sqrt() method
				directly. According to SUN microSystem, it will improve the code
				readability and enhance coding. But according to the programming
				experts, it will lead to confusion and not good for programming. If
				there is no specific requirement then we should not go for static
				import. Advantage of static import: If user wants to access any
				static member of class then less coding is required. Disadvantage of
				static import:</p>
				
		</div>



	</section>
</body>
</html>