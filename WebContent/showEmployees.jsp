<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>The Details Are</title>
</head>
<body>
	<table border=5 bgcolor="yellow">
	<tr>
	<th>Name</th>
	<th>Skill</th>
	<th>Company</th>
	</tr>
		<c:forEach var="listItems" items="${emp }">
			<tr>
				<td><c:out value="${listItems[0]}" /></td>
				<td><c:out value="${listItems[1]}" /></td>
				<td><c:out value="${listItems[2]}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>