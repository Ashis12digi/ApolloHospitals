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
 USERNAME:
<input type="text" name="username" placeholder="Enter username " pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
</tr>
 
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
<input type="text" name="emailid" placeholder="Enter Email ID " required="required">
</tr>


 <br><br>
 <tr>
TIMING:
<input type="text" name="timing" placeholder="mm:ss:ss " required="required">
</tr>
 <br><br>
  <tr>
FEES:
<input type="text" name="fees" placeholder="Enter Fees" required="required">
</tr>
  <br><br>
  <tr>
 MOBILE NUMBER:
<input type="text" name="mobilenumber" placeholder="Enter Moboile Number"  pattern("^((\\+91-?) |0)?[0-9]{10}$")
pattern="[789][0-9]{9}"
 title="Phone number with 7-9 and remaing 9 digit with 0-9"
 required="required">
</tr>
 <br><br>
  <tr>
INFO:
<input type="text" name="info" placeholder="Enter Information" required="required">
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