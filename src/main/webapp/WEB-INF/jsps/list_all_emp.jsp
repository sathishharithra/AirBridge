<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List All Employee</title>
</head>
<body>
	<h2>List Of All Employee's Data</h2>
	<hr color="red">

	<table border="2">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Department</th>
			<th>Salary</th>
			<th>Date Of Joining</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach var="allEmpData" items="${allEmpData}">
			<tr>
				<td>${allEmpData.id}</td>
				<td>${allEmpData.firstName}</td>
				<td>${allEmpData.lastName}</td>
				<td>${allEmpData.email}</td>
				<td>${allEmpData.mobile}</td>
				<td>${allEmpData.dept}</td>
				<td>${allEmpData.salary}</td>
				<td>${allEmpData.doj}</td>
				<td><a href="deleteemp?id=${allEmpData.id}">delete</a></td>
				<td><a href="updateemp?id=${allEmpData.id}">update</a></td>


			</tr>
		</c:forEach>

	</table>

</body>
</html>