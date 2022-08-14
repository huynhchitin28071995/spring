<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Add Todo Page</title>
</head>
<body>
	<div class="container">
		<h1>Enter todo detail</h1>
		<form:form action="add-todo" method="post" modelAttribute="todo">
			Description: 
			<form:input type="text" path="description" required="required" />
			<form:errors path="description" cssClass="text-warning"/>
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			<input type="submit" class="btn btn-success" />
		</form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>