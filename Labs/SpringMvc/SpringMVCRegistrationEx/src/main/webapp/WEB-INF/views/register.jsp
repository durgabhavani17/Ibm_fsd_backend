<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Registration</title>
</head>
<body>
<form:form target="/SpringMVCRegistrationEx/register/" modelAttribute="user" method="POST">
	<p>Enter user name: <form:input path="username" />   </p>
	<p>Enter pass word: <form:input path="password" />   </p>
	<p><button type="submit" value="Submit">Submit</button>  </p>
</form:form>
<a href="SpringREG/login">login here</a>
</body>
</html>
