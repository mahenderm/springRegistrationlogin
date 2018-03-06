<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg }</h1>
	<div>
		<div align="right">
			<a href="${PageContext.request.contextPath}/customer/logout"><b>LogOut</b></a>
		</div>
		<div align="left">
			Welcome<b style="color:red;">${customer.c_name}</b>
		</div>
		<div align="center">	
		<table>
			<tr>
				<td>Customer name:</td>
				<td>${customer.c_name }</td>
			</tr>
			<tr>
				<td>Customer mobile:</td>
				<td>${customer.c_mobile }</td>
			</tr>
			<tr>
				<td>Customer Gender:</td>
				<td>${customer.c_gender }</td>
			</tr>
			<tr>
				<td>Customer email:</td>
				<td>${customer.c_email }</td>
			</tr>
			<tr>
				<td>Customer password:</td>
				<td>${customer.c_password }</td>
			</tr>
		</table>
	
	</div>
	</div>
</body>
</html>