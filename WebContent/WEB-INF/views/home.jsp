<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Registration and Login</h1>
<table>
<tr><td><a href="${pageContext.request.contextPath }/customer/register">Register Customer</a></td></tr>

<tr><td><a href="${pageContext.request.contextPath }/customer/login">Login Customer</a></td></tr>
</table>
</div>
</body>
</html>