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

  <spring:url value="/addUser1" var="addURL" />
  <h2>Update Your Details</h2>



<form action="/updatePatient" method="post">
<div>
   <input type="hidden" name="id" cssClass="form-control" id="id"  value="${userdata.id}">
   
    <label>Patient Name</label>
    <input name="patientName" cssClass="form-control" id="patientName" value="${userdata.patientName}" />
   </div><br>
   
   <div class="form-group">
    <label>User Name</label>
    <input name="userName" cssClass="form-control" id="username"  value="${userdata.username}"/>
   </div><br>
   
   <div class="form-group">
    <label>Password</label>
    <input name="password" cssClass="form-control" id="password"  value="${userdata.password}"/>
   </div><br>
   
    <div class="form-group">
    <label>EmailId</label>
    <input name="emailId" cssClass="form-control" id="emailId" value="${userdata.emailId}"/>
   </div><br>
   
   <div class="form-group">
     <label>DOB</label>
    <input  type="text" name="dateOfBirth" cssClass="form-control" id="dateOfBirth" value="${userdata.dateOfBirth}" />
   </div><br>
   
  
   
   <div class="form-group">
    <label>Gender</label>
    <input name="gender" cssClass="form-control" id="gender" value="${userdata.gender}" />
   </div><br>
   
   <div class="form-group">
    <label>Blood Group</label>
    <input name="bloodGroup" cssClass="form-control" id="bloodGroup" value="${userdata.bloodGroup}"/>
   </div><br>
   
   <div class="form-group">
    <label>Mobile Number</label>
    <input name="mobileNumber" cssClass="form-control" id="mobileNumber" value="${userdata.mobileNumber}"/>
   </div><br>
   
   <div class="form-group">
    <label>Address</label>
    <input name="address" cssClass="form-control" id="address" value="${userdata.address}" />
   </div><br>
   
  
   
   
   <button type="submit" class="btn btn-success">Confirm</button>
</form>
  
  
</div>

</body>
</html>