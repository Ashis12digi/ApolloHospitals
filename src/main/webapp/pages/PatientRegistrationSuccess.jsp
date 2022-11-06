<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
<center>
<h2>Registration Successful!</h2>



<h3>Patients Details: </h3>

<h4> Patients ID  :${id }</h4>
<h4> Patients NAME  :${patientName}</h4>
<h4> Patients USERNAME  :${username }</h4>
<h4> Patients PASSWORD  :${password }</h4>
<h4> Patients Email ID  :${emailId}</h4>
<h4> Patients DATE OF BIRTH  :${dateOfBirth }</h4>
<h4> Patients GENDER  :${gender }</h4>
<h4> Patients BLOOD GROUP  :${bloodGroup }</h4>
<h4> Patients MOBILE NUMBER  :${mobileNumber }</h4>
<h4> Patients ADDRESS  :${address }</h4>
<h2> <a href="patientLogin">Click Here</a> to go for login page</h2>

</center>
</body>
</html>