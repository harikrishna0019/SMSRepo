<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SMS Login </title>
<style>
#myDiv1{
	
	height:400px;
	width: 500px;	
	margin-left: 35%;
	margin-top:08%;
	background-color:#899DAB;
}
#loginDiv{
margin-left: 20%;


}
h1{
	background-color:green;
	color: white;
}
</style>
</head>
<body>
<div id="myDiv1" >
<form action="LoginSubmit" method="post">
<h1>School Software Login</h1>


<div id="loginDiv">
	<h4> Login As:</h4><br>
	<input type="radio" value="admin" name="login">Admin
	<input type="radio" value="user" name="login" checked="checked"> User<br><br>
	<font color="green" style="text-align: center;">USER NAME	:</font> <input type="text" name="loginUserName"/></br></br>
	<font color="green"style="text-align: center;">PASSWORD	:</font><input type="password" name="loginUserPassword"/></br></br>
	<input type="submit" value="Login"/>
</div>
</form>
</div>
</body>
</html>