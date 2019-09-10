<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fill Student Details</title>
</head>
<body>
<form:form action="processform" modelAttribute="student">
<table>
<tr>
<td>First Name: </td>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<td>Last Name: </td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<tr>
<td>Email: </td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td>Country:</td>
<td><form:select path="country">
<form:options items="${student.countryOptions}"></form:options>
</form:select>
</td>
<tr>
<td>
favorite Language:</td>
<td>
java<form:radiobutton path="favoriteLanguage" value="Java"/>
Python<form:radiobutton path="favoriteLanguage" value="Python"/>
C#<form:radiobutton path="favoriteLanguage" value="C#"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
</td>
</tr>

<tr>
<td>
Oprating System:</td>
<td>
Linux<form:checkbox path="os" value="Linux"/>
Windows<form:checkbox path="os" value="windows"/>
Mac<form:checkbox path="os" value="Mac"/>
MS-DOS<form:checkbox path="os" value="MS-DOS"/>
Android<form:checkbox path="os" value="Android"/>
</td>
</tr>

</table>
<input type="submit" value="submit">
</form:form>
</body>
</html>