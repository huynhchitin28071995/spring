<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
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
					<td><a href="update-todo?id=${todo.id }"
						class="btn btn-success">UPDATE ${todo.id }</a></td>
					<td><a href="delete-todo?id=${todo.id }"
						class="btn btn-warning">DELETE ${todo.id }</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<%@ include file="common/footer.jspf"%>