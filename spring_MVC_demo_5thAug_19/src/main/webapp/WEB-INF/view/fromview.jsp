<%@page import="comm.example.controller.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Form</title>
</head>
<body>
<h5>Employee details:</h5>
<hr>
table style="width:100%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Email</th>
  </tr>
 
  <c:forEach var="listValue" items="${Employees}">
  <tr>
        <li>${listValue.firstName}</li>
        <li>${listValue.lastName}</li>
        <li>${listValue.email}</li>
  </tr>
    </c:forEach>
 
  
</table>

</body>
</html>