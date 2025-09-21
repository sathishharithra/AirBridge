<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Booking</title>

</head>
<body bgcolor=#f6f6f6>
	<h2>Flight Booking</h2>
	<hr color="red">
	<form action="savepass" method="post">
		<pre>
Passenger First Name			:	<input type="text" name="firstName">

Passenger Last Name			:	<input type="text" name="lastName">

Passenger Email				:	<input type="text" name="email">

Passenger Mobile			:	<input type="number" name="mobile">

Passenger Date Of Travel		:	<input type="Date" name="dot">

Passenger From Airport			:	<input type="text" name="fromAirport">

Passenger To Airport			:	<input type="text" name="destAirport">


     		   <input type="submit" value="Book Flight">


</pre>
	</form>
</body>
</html>