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

#loginerrormessage
{
	text-align: center;
	margin: 5px;
	color: red;
	font-size: 12px;
}

#signup
{
	right: 0;
	position: absolute;
	margin-right: 10px;
	margin-top: 2px;
	margin-bottom: 2px;
}

</style>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>



<form id="loginform" method="post" action="verifyLogin">
	<a id="signup" href="registration.jsp">Sign Up</a>
	<h3>Log In</h3>
	<br><p>Email Address</p><input class="textbox" class="centeredobject" type="text" name="email"/>
	<br><p>Password</p><input class="textbox" class="centeredobject" type="password" name="password"/>
	<br><input class="centeredobject" id="submitbutton" type="submit" value="Log In"/>
	
	<c:if test="${not empty param.loginfailed }">
	    <c:if test="${ param.loginfailed eq 'true' }">
	        <h4 id="loginerrormessage">Invalid email address or password.</h4>
	    </c:if>	
	</c:if>
	

</form>


</body>
</html>