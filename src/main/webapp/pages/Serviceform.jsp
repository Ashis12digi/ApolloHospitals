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
 Patient Id:<input type="text" name="id" placeholder="Enter id " required="required" >

 <br><br>
 
 <tr>
 Patient Name:
<input type="text" name="patientname" placeholder="Enter patientsname " >
</tr>
 
 <br><br>
 
 <select  style="width: 150px;margin:20px">
                    <option value="">Service details</option>
                    <option value="">Xray </option>
                    <option value="">ECG</option>
                    <option value="">TEST</option>
                    
                </select>
 
 
    <input type="submit" value="Submit Request">
 
</form>


</fieldset>
</center>

    </div>

</body>
</html>