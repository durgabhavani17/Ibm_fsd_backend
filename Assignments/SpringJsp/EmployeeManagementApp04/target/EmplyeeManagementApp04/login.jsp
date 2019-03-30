<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<style type="text/css">
input[type=text], input[type=password],input[type=number] {
  width: 30%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: block;
  border: none;
  background: #f1f1f1;
}
input[type=submit]{
background-color:green;
width: 20%;
padding: 15px;
border:none;
}
</style>
</head>
<body>
<h1 style="text-align:center">Employee Login Form</h1>
<form action="login.do">
<center>
<div>
<h3>Enter UserName:</h3><input type="text" name="user" placeholder="enter ur username"/>
<h3>Enter PassWord:</h3><input type="password" name="pass" placeholder="enter ur password"/>
<h3><input type="submit" value="submit"/></h3>
</div>
</center>
</form>
<a href="index.jsp"></a>
</body>
</html>