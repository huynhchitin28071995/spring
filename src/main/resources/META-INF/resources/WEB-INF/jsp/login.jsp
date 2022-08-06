<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.ionicframework.com/1.0.0/css/ionic.css" />
<script src="http://code.ionicframework.com/1.0.0/js/ionic.bundle.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 500; align-content: center">
		<form method="post" id="login">
			<label class="item item-input"> <span class="input-label">Username:</span>
				<input placeholder="Text" type="text" name="userName" />
			</label> <label class="item item-input"> <span class="input-label">Password:</span>
				<input placeholder="Text" type="password" name="password" />
			</label>
			<div class="ui-input-btn ui-btn ui-corner-all center">
				Submit <input data-enhanced="true" type="submit" value="Submit"
					id="button-1" />
			</div>
		</form>
	</div>
	${userName }
	<br> ${password }
</body>
</html>