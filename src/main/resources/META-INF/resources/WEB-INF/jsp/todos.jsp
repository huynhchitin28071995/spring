<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<pre>Welcome ${userName }</pre>
	<div class="container table-striped">
		<table class="table">
			<thead>
				<tr>
					<th class="text-uppercase align-center">description</th>
					<th class="text-uppercase align-center">target date</th>
					<th class="text-uppercase align-center">completed</th>
					<th class="text-uppercase align-center">Update</th>
					<th class="text-uppercase align-center">delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos }" var="todo">
					<tr>
						<td>${todo.description}</td>
						<td>${todo.targetDate }</td>
						<td>${todo.done }</td>
						<td>
							<a href="update-todo?id=${todo.id }" class="btn btn-success">UPDATE ${todo.id }</a>
						</td>
						<td>
							<a href="delete-todo?id=${todo.id }" class="btn btn-warning">DELETE ${todo.id }</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>