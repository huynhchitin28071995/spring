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
	<pre>Welcome ${userName }</pre>
	<table style="border: solid">
		<thead>
			<tr>
				<th style="border: solid">id</th>
				<th style="border: solid">description</th>
				<th style="border: solid">target date</th>
				<th style="border: solid">completed</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos }" var="todo">
			<tr>
			<td style="border: solid">${todo.id }</td>
			<td style="border: solid">${todo.description}</td>
			<td style="border: solid">${todo.targetDate }</td>
			<td style="border: solid">${todo.done }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>