
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="home.jsp"></jsp:include>
</head>
<body>
<%
String uname=request.getParameter("user");

String pass=request.getParameter("pass");

out.println("welcome "+uname);
%>

</body>
</html>