<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Add Todo Page</title>
</head>
<body>
	<%@ include file="common/navigation.jspf"%>
	<div class="container">
		<h1>Enter todo detail</h1>
		<form:form method="post" modelAttribute="todo">
			<!-- Description:  -->
			<%-- 			<form:input type="text" path="description" required="required" />
			<form:errors path="description" cssClass="text-warning" /> --%>
			<form:input type="hidden" path="id" />
			<%-- 			<form:input type="text" path="targetDate" />
 --%>
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="targetDate">Target Date</form:label>
				<form:input type="text" path="targetDate" required="required" />
				<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="done">Done</form:label>
				<form:checkbox path="done" />
				<form:errors path="done" cssClass="text-warning" />
			</fieldset>
			<%-- <form:input type="text" path="done" /> --%>
			<input type="submit" class="btn btn-success" />
		</form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script
		src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'yyyy-mm-dd'
		});
	</script>
</body>
</html>