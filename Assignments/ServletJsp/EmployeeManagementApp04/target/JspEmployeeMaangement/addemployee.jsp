
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add employee</title>
<style type="text/css">
input{
display:block;
width:200px;
height:30px;
border-radius:5px;
}
div{
display:inline;
}
input[type="radio"]{
width:200px;
height:30px;
}
</style>
</head>
<body>
<form action="add.do">
<label>Employee ID:</label><input type="number" name="id"/>
<label>Employee Name:</label><input type="text" name="name"/>
<label>Employee Salary:</label><input type="number" name="salary"/>
<label>Select Date of Birth</label><input type="date" name="dob"/>
<label>Gender:</label>
<div>
  <input type="radio" name="gender" value="male"> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  
</div>
<label>Designation:</label>
<input type="text" name="des"/>
<label>Department:</label><input type="text" name="dep"/>
<input type="submit" value="add">

</form>
</body>
</html>