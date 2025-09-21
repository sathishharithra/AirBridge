<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>

</head>
<body bgcolor=#f6f6f6>
	<h2>Employee Registration</h2>
	<hr color="red">
	<form action="saveemp" method="post">
		<pre>
Employee First Name			:	<input type="text" name="firstName">
 
Employee Last Name			:	<input type="text" name="lastName">

Employee Email				:	<input type="text" name="email">

Employee Mobile				:	<input type="number" name="mobile">

Employee Date Of Joining		:	<input type="Date" name="doj">

Employee Salary				:	<input type="number" name="salary">

Employee Department			:	<input type="text" name="dept">


     		   <input type="submit" value="Save Employee">


</pre>
	</form>
</body>
</html>