<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Passenger</title>

</head>
<body bgcolor=#f6f6f6>
	<h2>Update Passenger Details</h2>
	<hr color="red">
	<form action="updateOnePass" method="post">
		<pre>
		<input type="hidden" name="id" value ="${passenger.id}">
Passenger First Name     :	<input type="text" name="firstName" value ="${passenger.firstName}">

Passenger Last Name      :	<input type="text" name="lastName" value ="${passenger.lastName}">

Passenger Email          :	<input type="text" name="email" value ="${passenger.email}">

Passenger Mobile         :	<input type="number" name="mobile" value ="${passenger.mobile}">

Passenger Date Of Travel :	<input type="Date" name="dot" value ="${passenger.dot}">

Passenger From Airport   :	<input type="text" name="fromAirport" value ="${passenger.fromAirport}">

Passenger To Airport     :	<input type="text" name="destAirport" value ="${passenger.destAirport}">


     		   <input type="submit" value="Update Passenger">


</pre>
	</form>
</body>
</html>