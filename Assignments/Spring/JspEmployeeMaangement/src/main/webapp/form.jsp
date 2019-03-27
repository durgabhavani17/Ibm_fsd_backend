
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="home.jsp"></jsp:include>
<jsp:include page="listEmp.jsp"></jsp:include>

</head>
<body>
<%
String uname=request.getParameter("user");

String pass=request.getParameter("pass");

out.println("welcome "+uname);
%>

<a href="addemployee.jsp">add one employee</a>

</body>
</html>