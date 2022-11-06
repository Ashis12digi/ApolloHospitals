<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Patient</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<a href="/">Go Back</a>
<div class="container">
<center>

  <spring:url value="/addUser1" var="addURL" />
  <h2>Update Medicine Details</h2>



<form action="/updateMedicine" method="post">
<div>
   <input type="hidden" name="medicineId" cssClass="form-control" id="medicineId"  value="${medicinedata.medicineId}">
   
    <label>Medicine Name</label>
    <input name="medicineName" cssClass="form-control" id="medicineName" value="${medicinedata.medicineName}" />
   </div><br>
   
   <div class="form-group">
    <label>Brand</label>
    <input name="brand" cssClass="form-control" id="brand"  value="${medicinedata.brand}"/>
   </div><br>
   
   <div class="form-group">
    <label>MadeIn</label>
    <input name="madeIn" cssClass="form-control" id="madeIn"  value="${medicinedata.madeIn}"/>
   </div><br>
   
    <div class="form-group">
    <label>Quantity</label>
    <input name="quantity" cssClass="form-control" id="quantity" value="${medicinedata.quantity}" />
   </div><br>
   
  
   
   
   <button type="submit" class="btn btn-success">Confirm</button>
</form>
  
  
</div>
</center>

</body>
</html>