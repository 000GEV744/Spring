<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>All Student details: </h4>

 <table>
 <tr>
      <th>First name</th>
      <th>Last name</th>
      <th>Email</th>
      <th>Country</th>
      <th>Favourite Language</th>
      <th>Operating System</th>
      </tr>
      
<c:forEach var="s" items="${list}">

      <tr>
      <td><c:out value="${s.firstName}"></c:out></td>
      <td><c:out value="${s.lastName}"></c:out></td>
      <td><c:out value="${s.email}"></c:out></td>
      <td><c:out value="${s.country}"></c:out></td>
      <td><c:out value="${s.favoriteLanguage}"></c:out></td>
      <td><c:out value="${s.setOStr}"></c:out></td>
      <td><a href="delete?id=${s.id}">Delete</a></td>
      <td><a href="update?id=${s.id}">Update</a></td>
      </tr>
      
</c:forEach>

    </table>
</body>
</html>