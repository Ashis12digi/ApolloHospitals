<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Registration</title>
</head>
<body>

<div align="center">
<center>

 <h2>Admin Registration</h2>
<fieldset style="width:600px">
<form action="aregist" method="post" >
 NAME:<input type="text" name="name" required="required">

 <br><br>
 
 <tr>
 PASSWORD:
<input type="text" name="password" required="required">
</tr>
 
 <br><br>
 <tr>
 EMAIL ID:
<input type="text" name="emailid">
</tr>

 <br><br>
  Gender
          <input type="radio"  name="gender" value="Male">Male</input>
         <input type="radio" name="gender" value="Female">Female</input>
 <br><br>
 
  <tr>
 MOBILE NUMBER:
<input type="text" name="mobilenumber" 
 pattern("^((\\+91-?) |0)?[0-9]{10}$")
pattern="[789][0-9]{9}"
 title="Phone number with 7-9 and remaing 9 digit with 0-9"
 required="required">

 <br><br>
 <tr>
  <input type="submit" value="Register">
  </tr>
</form>


</fieldset>
</center>

    </div>


</body>
</html>