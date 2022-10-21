<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Registration</title>

<style >

</style>



</head>
<body>

 <div align="center">
<center>

 <h2>Doctor Registration</h2>
<fieldset style="width:600px">
<form action="DRregsuccess" method="post" >
 NAME:<input type="text" name="name" placeholder="Enter Name " required="required" >

 <br><br>
 
 <tr>
 PASSWORD:
<input type="text" name="password" placeholder="Enter Password " required="required">
</tr>
 
 <br><br>
 <tr>
 LOCATION:
<input type="text" name="location" placeholder="Enter Location ">
</tr>
 <br><br>

  Gender
          <input type="radio"  name="gender" value="Male">Male</input>
         <input type="radio" name="gender" value="Female">Female</input>
 <br><br>

  
  <tr>
EMAIL  ID:
<input type="text" name="emailid" placeholder="Enter Email ID ">
</tr>


 <br><br>
 <tr>
TIMING:
<input type="text" name="timing" placeholder="Enter Time__:__ ">
</tr>
 <br><br>
  <tr>
FEES:
<input type="text" name="fees" placeholder="Enter Fees">
</tr>
  <br><br>
  <tr>
 MOBILE NUMBER:
<input type="text" name="mobilenumber" placeholder="Enter Moboile Number" >
</tr>
 <br><br>
  <tr>
INFO:
<input type="text" name="info" placeholder="Enter Information">
</tr>
 <br><br>
  <tr>
EXPREIENCE:
<input type="text" name="experience" placeholder="Enter Experience:__ " required="required">
</tr>
 <br><br>
 
 
    <input type="submit" value="Register">
   
</form>


</fieldset>
</center>

    </div>

</body>
</html>