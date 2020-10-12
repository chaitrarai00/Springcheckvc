<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Profile</title>
</head>
<body>
	<form action="getcandidate">
		<input type="text" name="cid">
		<input type="submit">
	</form>
	<form action="addcandidate">
		Candidate id: <input type="text" name="cid">
		Candidate name:<input type="text" name="name">
		Candidate phone number:<input type="text" name="phoneno">
		Candidate emailid:<input type="text" name="emailid">
		Candidate latest_education:<input type="text" name="latest_education">
		Candidate role:<input type="text" name="role">
		<input type="submit">
	</form>
</body>
</html>