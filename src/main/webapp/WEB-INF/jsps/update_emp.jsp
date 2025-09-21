<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Update</title>

</head>
<body bgcolor=#f6f6f6>
	<h2>Update Employee Details</h2>
	<hr color="red">
	<form action="updateOneEmp" method="post">
		<pre>
		<input type="hidden" name="id" value ="${employee.id}">
Employee First Name			:	<input type="text" name="firstName" value ="${employee.firstName}">
 
Employee Last Name			:	<input type="text" name="lastName" value ="${employee.lastName}">

Employee Email				:	<input type="text" name="email" value ="${employee.email}">

Employee Mobile				:	<input type="number" name="mobile" value ="${employee.mobile}">

Employee Date Of Joining		:	<input type="Date" name="doj" value ="${employee.doj}">

Employee Salary				:	<input type="number" name="salary" value ="${employee.salary}">

Employee Department			:	<input type="text" name="dept" value ="${employee.dept}">


     		   <input type="submit" value="Update Employee">


</pre>
	</form>
</body>
</html>