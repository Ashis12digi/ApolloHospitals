<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment Form</title>



</head>
<body>
  


  <div align="center">
       
       

<center>
<h1> Book Appointment </h1>
 
<fieldset style="width:600px">
<form action="appointment" method="post" >
Enter Full Name:<input type="text" name="patientname" required="required">
  <br><br>

Enter Mobile Number:<input type="number" name="MobileNumber"
 pattern("^((\\+91-?) |0)?[0-9]{10}$")
pattern="[789][0-9]{9}"
 title="Phone number with 7-9 and remaing 9 digit with 0-9"

>
  <br><br>
  
 
Doctor Name:<input type="text" name="doctorname" required="required">

 
  <br><br>
 <tr>
 DATE:
<input type="date" name="date" required="required">
</tr>

 <br><br>
  Enter Address:<input type="text" name="Address" required="required">
  <br><br>
 
 
    <input type="submit" value="Appointment Request">
    
 
</form>


</fieldset>


    </div>

</center>
</body>
</html>