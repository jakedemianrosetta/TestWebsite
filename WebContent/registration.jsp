<style type="text/css">

#loginform
{
	display: block;
	width: 300px;
	background-color: #BBBBFF;
	padding: 15px;
	float: center;
	margin-left: auto;
	margin-right: auto;
	margin-top: 100px;
	position: relative;
}

#submitbutton
{
	margin-top: 15px;
	border-radius: 10px;
}

.centeredobject
{
	display: block;
	margin-left: auto;
	margin-right: auto;
}

p, h3
{
	text-align: center;
	margin-top: 0px;
	margin-bottom: 0px;
}

.textbox
{
	width: 200px;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

.confirmtext
{
	margin-top: -15px;
}

</style>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
</head>
<body>

<form id="loginform" method="post" action="VerifySignup">

	<h3>Register</h3>
	<br><p>Email Address</p><input class="textbox" class="centeredobject" type="text" name="email"/>
	<br><p class="confirmtext">Confirm Email Address</p><input class="textbox" class="centeredobject" type="text" name="confirmemail"/>
	<br><p>Password</p><input class="textbox" class="centeredobject" type="password" name="password"/>
	<br><p class="confirmtext">Confirm Password</p><input class="textbox" class="centeredobject" type="password" name="confirmpassword"/>
	<br><input class="centeredobject" id="submitbutton" type="submit" value="Sign Up"/>

</form>
</body>
</html>