<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Register</title>
</head>
<body>
	<div align="center">
	<h1>Register Customer</h1>
	</div>
	<table>
		<s:form commandName="customerData" 
		action="${pageContext.request.contextPath }/customer/register" method="post">
		<tr>
		<td>Customer name:</td>
		<td><s:input path="c_name"/></td>
		<td><s:errors path="c_name" cssStyle="color:red;"/></td>
		</tr>
		<tr>
		<td>Customer mobile:</td>
		<td><s:input path="c_mobile"/></td>
		<td><s:errors path="c_mobile" cssStyle="color:red;"/></td>
		</tr>
		<tr>
		<td>Customer email:</td>
		<td><s:input path="c_email"/></td>
		<td><s:errors path="c_email" cssStyle="color:red;"/></td>
		</tr>
		<tr>
		<td>Customer password:</td>
		<td><s:input path="c_password"/></td>
		<td><s:errors path="c_password" cssStyle="color:red;"/></td>
		</tr>
		</s:form>
	</table>
</body>
</html>