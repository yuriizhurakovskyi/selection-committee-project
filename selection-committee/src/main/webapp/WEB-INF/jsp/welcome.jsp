<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<title>Welcome page</title>

</head>
<body>
	<h1>Hello:</h1>
	<h2>${loggedUser}</h2>
	<h1>-------------------------</h1>
	<h1>Log out:</h1>
	<form action="<c:url value="/logout"/>" method="POST">
		<input type="submit" value="Log out" name="">
	</form>

</body>

</html>