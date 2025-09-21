<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List All Passenger</title>
</head>
<body>
	<h2>List Of All Passenger's</h2>
	<hr color="red">

	<table border="2">
		<tr>
			<th>Ticket Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Date Of Travel</th>
			<th>From Airport</th>
			<th>To Airport</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach var="allPassData" items="${allPassData}">
			<tr>
				<td>${allPassData.id}</td>
				<td>${allPassData.firstName}</td>
				<td>${allPassData.lastName}</td>
				<td>${allPassData.email}</td>
				<td>${allPassData.mobile}</td>
				<td>${allPassData.dot}</td>
				<td>${allPassData.fromAirport}</td>
				<td>${allPassData.destAirport}</td>
				<td><a href="deletepass?id=${allPassData.id}">delete</a></td>
				<td><a href="updatepass?id=${allPassData.id}">update</a></td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>