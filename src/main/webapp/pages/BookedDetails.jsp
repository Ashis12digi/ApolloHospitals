<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Services</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>



</head>
<body>

<center>




<h1> The Service Details are:</h1>
<fieldset style="width: 1000px">



<table border = "1" width = "100%">
<thead>
<tr>
<th >Service Id</th>
<th>Patient Name</th>
<th>Service Name</th>
<th>Mobile Number</th>
<th>Amount</th>
<th>Action</th>


</tr>
</thead>
<tbody>
 
    <td>${serviceId}</td>
     <td>${patientname}</td>
    <td>${serviceName}</td>
    <td>${mobilenumber}</td>  
   <td>${amount}</td> 
   
   
   
   <td>
   
   <form action="/payment" method ="post">

<input type ="submit" value="Confirm">
</form>
   
   </td>
 



</tbody>
</table>




</body>
</html>