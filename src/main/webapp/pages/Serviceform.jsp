<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service</title>
</head>
<body>

<div align="center">
<center>

 <h2>Service Details</h2>
<fieldset style="width:600px">
<form action="fetchServices"  >
 Patient Id:<input type="text" name="patientid" placeholder="Enter id " required="required" >

 <br><br>
 
 <tr>
 Patient Name:
<input type="text" name="patientname" placeholder="Enter patientsname " >
</tr>
 
 <br><br>
 
  Services details
          <input type="radio"  name="servicedetails" value="Xray">Xray</input>
         <input type="radio" name="servicedetails" value="ECG">ECG</input>
          <input type="radio"  name="servicedetails" value="TEST">TEST</input>
 <br><br>
 
 
 
    <input type="submit" value="Submit Request">
 
</form>


</fieldset>
</center>

    </div>

</body>
</html>