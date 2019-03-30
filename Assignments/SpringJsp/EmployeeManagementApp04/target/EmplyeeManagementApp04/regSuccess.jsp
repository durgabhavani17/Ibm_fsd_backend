
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String pass=request.getParameter("pass");
String mno=request.getParameter("pno");

out.println("<h1>"+fname+""+lname+" "+"registered successfully"+"</h1>");
%>
<a href="login.jsp">Go to Login</a>
</body>
</html>