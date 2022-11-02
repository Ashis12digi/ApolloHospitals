<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patients Registration</title>





</head>
<body>

  <div align="center">
       
       

<center>

 <h2>Patients Registration</h2>
<fieldset style="width:600px">
<form action="regsuccess" method="post" >
 NAME:<input type="text" name="patientname" required="required">

 <br><br>
 <tr>
 USERNAME:
<input type="text" name="username" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
</tr>
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

<tr>
DATE OF BIRTH:
<input type="text" name="dateofbirth" placeholder=" MM/dd/yyyy " required="required">
</tr>


 <br><br>
  Gender
          <input type="radio"  name="gender" value="Male">Male</input>
         <input type="radio" name="gender" value="Female">Female</input>
 <br><br>
  <tr>
BLOOD GROUP:
<input type="text" name="bloodgroup">
</tr>
 <br><br>
 
  <tr>
 MOBILE NUMBER:
<input type="text" name="mobilenumber" 
 pattern("^((\\+91-?) |0)?[0-9]{10}$")
pattern="[789][0-9]{9}"
 title="Phone number with 7-9 and remaing 9 digit with 0-9"
 required="required"

>
</tr>
 <br><br>
<tr>
ADDRESS:



<textarea name="address" rows="2" cols="30"  placeholder="Enter Address here..." ></textarea>
</tr>

 <br><br>
 
 
    <input type="submit" value="Register">
    
  
 
<hr>
</form>


</fieldset>
</center>

    </div>

</body>
</html>