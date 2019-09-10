<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empolyees</title>
</head>
<body>
<h5>${student.firstName}</h5>
<h5>${student.lastName}</h5>
<h5>${student.country}</h5>
<h5>${student.favoriteLanguage}</h5>
<h5>${student.email}</h5>
<h5> <c:forEach var="listValue" items="${student.os}">
       ${listValue}, 
    </c:forEach>
 </h5>
</body>
</html>