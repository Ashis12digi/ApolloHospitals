<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Login</title>

<style >

</style>

</head>
<body>
<center>

<h1>Doctor Login</h1>
<fieldset style="width:600px">
<form action="doctorloginusername" >
 USER NAME:<input type="text" name="username" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required >

 <br><br>
 
 <tr>
 PASSWORD:
<input type="text" name="password">
</tr>
 
 <br><br>
    <input type="submit" value="Login">

 
<hr>
</form>
   <a  href="dregistration"><button>Create new Account</button></a>

</fieldset>
</center>


</body>
</html>