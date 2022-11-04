 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patients Login</title>

</head>
<body>


<center>

<h1>Patients Login</h1>
<fieldset style="width:600px">
<form action="patientloginusername" method="post" >
 USER NAME:<input type="text" name="username" placeholder="Enter UserName" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required >

 <br><br>
 
 <tr>
 PASSWORD:
<input type="text" name="password" placeholder="Enter Password " required="required">
</tr>
 
 <br><br>
    <input type="submit" value="Login" >
  
 
<hr>
</form>
 <a  href="pregistration"><button>Create new Account</button></a>

</fieldset>
</center>


</body>
</html>