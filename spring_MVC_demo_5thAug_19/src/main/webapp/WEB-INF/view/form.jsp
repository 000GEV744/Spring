<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fill Form</title>
</head>
<body>
<form action="processForm" method="post">
  First name:<br>
  <input type="text" required="true"  name="firstname"><br>
  Last name:<br>
  <input type="text" required="true" name="lastname">
  Email:<br>
  <input type="text" required="true"  name="email">
 <input type="submit" value="Submit">
</form>
</body>
</html>