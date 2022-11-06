<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient List</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>

 <form action="/">
<input type="submit" value="GoBack">
</form>
 

<center>
<h2>Profile Summary</h2>




<h4>  Patient Name  :${result.patientName}</h4>

<h4>  Patient Username  :${result.username}</h4>
<h4>  Patient password  :${result.password}</h4>

<h4>  Patient Email Id  :${result.emailId}</h4>
<h4>  Patient DOB  :${result.dateOfBirth}</h4>

<h4>  Patient Gender  :${result.gender}</h4>

<h4>  Patient Blood Group  :${result.bloodGroup}</h4>

<h4>  Patient Mobile Number  :${result.mobileNumber}</h4>

<h4>  Patient Address  :${result.address}</h4>

  <a class="btn btn-info" href="/editPatient?id=${result.id}"><h2>Update</h2></a>

<h4>



</center>
</body>
</html>