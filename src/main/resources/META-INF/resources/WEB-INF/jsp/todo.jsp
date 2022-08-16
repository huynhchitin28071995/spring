<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Enter todo detail</h1>
	<form:form action="add-todo" method="post" modelAttribute="todo">
			Description: 
			<form:input type="text" path="description" required="required" />
		<form:errors path="description" cssClass="text-warning" />
		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="done" />
		<input type="submit" class="btn btn-success" />
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>