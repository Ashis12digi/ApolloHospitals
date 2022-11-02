<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form action="/">
<input type="submit" value="GoBack">
</form>
 
<center>
<h2>Appointment Request Confirmed</h2>

<h3>Appointment Details: </h3>

<h4> Appointment ID  :${appointmentid }</h4>
<h4> Patient Name   :${patientname }</h4>
<h4> Mobile Number :${MobileNumber }</h4>
<h4> Doctor Name  :${doctorname }</h4>
<h4> Appointment date  :${date }</h4>
<h4> Address  :${Address }</h4>
<h4>Please visit the hospital on the above date to take the best facility</h4>

</center>


</body>
</html>