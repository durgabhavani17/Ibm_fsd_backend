<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee register form</title>
<style type="text/css">
input{
display:block
}
input{
padding:10 10 10 10px;
width:200px;
height:30px;
border-radius:5px;
}


</style>
</head>
<body>
<form action="register.do">
Enter ur First Name:<input type="text" name="fname" placeholder="enter ur first name"/>
Enter ur Last Name:<input type="text" name="lname" placeholder="enter ur Last name"/>

Enter ur  password:<input type="password" name="pass" placeholder="enter ur password"/>

Enter ur mobile no:<input type="number" name="pno" placeholder="enter ur mobile no"/>
<input type="submit" value="register"/>

</form>
</body>
</html>