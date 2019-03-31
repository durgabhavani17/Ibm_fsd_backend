
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add employee</title>
<style type="text/css">
input[type=text], input[type=password], input[type=number], input[type=date]
	{
	width: 30%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: block;
	border: none;
	background: #f1f1f1;
}

input[type=submit] {
	background-color: green;
	width: 20%;
	padding: 15px;
	border: none;
}
</style>

</head>
<body>
	<h1 style="text-align: center">Add an Employee</h1>
	<form action="add.do">
		<center>
			<div>

				<label>Employee Name:</label><input type="text" name="name" /> <label>Employee
					Salary:</label><input type="number" name="salary" /> <label>Select
					Date of Birth</label><input type="date" name="dob" /> <label>Gender:</label>
				<div>
					<input type="radio" name="gender" value="male"> Male<br>
					<input type="radio" name="gender" value="female"> Female<br>

				</div>
				<label>Designation:</label> <input type="text" name="des" /> <label>Department:</label><input
					type="text" name="dep" /> <input type="submit" value="add">
			</div>
		</center>
	</form>

</body>
</html>