<%@page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[type=text], input[type=password],input[type=number],input[type=date] {
  width: 30%;
  padding: 15px;
  margin: 5px auto 22px auto;
  display: table;
  border: none;
  background: #f1f1f1;
  
}
input[type=submit]{
background-color:green;
width: 20%;
padding: 15px;
border:none;
}
div{
text-align:center;
}

</style>
</head>
<body>
<h1 style="text-align:center;">Employee Update form</h1>
<form action="update.do">
<div>

<h3>Employee ID:</h3><input type="number" name="id" value="<%=request.getParameter("id")%>"/>
<h3>Employee Name:</h3><input type="text" name="name"  value="<%=request.getParameter("name")%>"/>
<label><h3>Employee Salary:</h3></label><input type="number" name="salary" value="<%=request.getParameter("salary")%>"/>
<label><h3>Select Date of Birth</h3></label><input type="date" name="dob" value="<%=request.getParameter("dob")%>"/>
<label><h3>Gender:</h3></label>
<div>
  <input type="radio" name="gender" value="male"> Male
  <input type="radio" name="gender" value="female">Female<br>
  
</div>
<label><h3>Designation:</h3></label>
<input type="text" name="des" value="<%=request.getParameter("des")%>"/>
<input type="submit" value="update"/>



</div>
</form>
</body>
</html>