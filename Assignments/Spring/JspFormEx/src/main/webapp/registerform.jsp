
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String pass=request.getParameter("pass");
String mno=request.getParameter("pno");
out.println("<h1>name is:"+fname+""+lname+"</h1>");
out.println("mobile no is"+mno);
%>

</body>
</html>