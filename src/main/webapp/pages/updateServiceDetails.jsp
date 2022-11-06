<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Service</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<a href="/">Go Back</a>
<div class="container">

<center>

  <spring:url value="/addUser1" var="addURL" />
  <h2>Update Service Details</h2>



<form action="/updateService" method="post">
<div>
   <input type="hidden" name="serviceId"  cssClass="form-control" id="serviceId"  value="${servicedata.serviceId} ">
   
    <label>Service Name</label>
    <input name="serviceName" cssClass="form-control" id="serviceName" value="${servicedata.serviceName} " />
   </div><br>
   
    
   
   <button type="submit" class="btn btn-success">Confirm</button>
</form>
  
  
</div>
</center>

</body>
</html>