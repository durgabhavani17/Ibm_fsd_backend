<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<style type="text/css">
input{
display:block,

}
div{
padding:10 10 10 10px,
width:50,
height:50
}
</style>
</head>
<body>
<form action="login.do">
<div>
<p>Enter UserName:</p><input type="text" name="user" placeholder="enter ur username"/>
<p>Enter PassWord:</p><input type="password" name="pass" placeholder="enter ur password"/>
<p><input type="submit" value="submit"/></p>
</div>
</form>

</body>
</html>