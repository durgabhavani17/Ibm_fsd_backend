
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<jsp:useBean id="emp" class="com.examples.java.employeeServlet.EmployeeRegisterForm"/>
<jsp:setProperty property="fname" name="name" param="fname"/>
<jsp:setProperty property="lname" name="lname" value="bhavani"/>
<jsp:setProperty property="pass" name="pass" param="pass"/>
<jsp:setProperty property="mno" name="cno" param="pno"/>
<jsp:getProperty property="fname" name="name"/>
<jsp:getProperty property="lname" name="lname"/>
<jsp:getProperty property="mno" name="cno"/>
</body>
</html>