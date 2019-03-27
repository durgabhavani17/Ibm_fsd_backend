<%@page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input{
display:block;
}
</style>
</head>
<body>
<form action="update.do">
<label>Employee ID:</label><input type="number" name="id" value="<%=request.getParameter("id")%>"/>
<label>Employee Name:</label><input type="text" name="name"  value="<%=request.getParameter("name")%>"/>
<label>Employee Salary:</label><input type="number" name="salary" value="<%=request.getParameter("salary")%>"/>
<label>Select Date of Birth</label><input type="date" name="dob" value="<%=request.getParameter("dob")%>"/>
<label>Gender:</label>
<div>
  <input type="radio" name="gender" value="male"> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  
</div>
<label>Designation:</label>
<input type="text" name="des" value="<%=request.getParameter("des")%>"/>
<input type="submit" value="update"/>


</form>

</body>
</html>