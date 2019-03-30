
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="home.jsp"></jsp:include>
<style type="text/css">
.btn2 {
	background-color: blue;
	color: white;
	border: none;
	cursor: pointer;
}
</style>

</head>
<body>
	<%
String uname=request.getParameter("user");

String pass=request.getParameter("pass");

out.println("welcome "+uname);
%>

	<a class="btn2" href="addemployee.jsp">add one employee</a>
	<jsp:include page="listEmp.jsp"></jsp:include>
</body>
</html>