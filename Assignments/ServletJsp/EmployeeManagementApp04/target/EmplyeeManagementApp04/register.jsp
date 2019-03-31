<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee register form</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</style>
</head>
<body>
	<form action="register.do" >
		<h1 style="text-align: center">Employee Registration Form</h1>
       <div class="row justify-content-md-center">
		<div class="form-group col-md-4">
			<h4>Enter ur First Name:</h4>
			<input type="text" name="fname" class="form-control" placeholder="enter ur first name" />
			<h4>Enter ur Last Name:</h4>
			<input type="text" name="lname" class="form-control" placeholder="enter ur Last name" />

			<h4>Enter ur password:</h4>
			<input type="password" name="pass" class="form-control" placeholder="enter ur password" />

			<h4>Enter ur mobile no:</h4>
			<input type="number" name="pno"  class="form-control" placeholder="enter ur mobile no" />
			<input class="btn btn-primary" type="submit" value="register" /> <a href="login.jsp">Back</a>
		</div>
		</div>


	</form>
</body>
</html>