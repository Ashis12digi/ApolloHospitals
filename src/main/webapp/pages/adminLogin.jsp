<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>


<center>

<h1>Admin Login</h1>
<fieldset style="width:600px">
<form action="adminLoginValidation" >
 USER NAME:<input type="text" name="userName" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required >

 <br><br>
 
 <tr>
 PASSWORD:
<input type="password" name="password" required="required">
</tr>
 
 <br><br>
    <input type="submit" value="Login">
 
 
 
<hr>
</form>
   <a  href="adminRegistration"><button>Create new Account</button></a>
</fieldset>
</center>


</body>
</html>