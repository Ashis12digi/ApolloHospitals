<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Doctor</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<a href="/">Go Back</a>
<div class="container">

  <spring:url value="/addUser1" var="addURL" />
  <h2>Update Doctor Details</h2>



<form action="/updateDoctor" method="post">
<div>
   <input type="hidden" name="id" cssClass="form-control" id="id"  value="${userdata.id}">
   
    <label>Doctor Name</label>
    <input name="name" cssClass="form-control" id="name" value="${userdata.name}" />
   </div><br>
   
   <div class="form-group">
    <label>User Name</label>
    <input name="username" cssClass="form-control" id="username"  value="${userdata.username}"/>
   </div><br>
   
   <div class="form-group">
    <label>Password</label>
    <input name="password" cssClass="form-control" id="password"  value="${userdata.password}"/>
   </div><br>
   
    <div class="form-group">
    <label>Location</label>
    <input name="location" cssClass="form-control" id="location" value="${userdata.location}"/>
   </div><br>
  
   
   <div class="form-group">
    <label>Gender</label>
    <input name="gender" cssClass="form-control" id="gender" value="${userdata.gender}" />
   </div><br>
   
   <div class="form-group">
    <label>Email Id</label>
    <input name="emailid" cssClass="form-control" id="emailid" value="${userdata.emailid}"/>
   </div><br>
   
   <div class="form-group">
    <label>Timing</label>
    <input name="timing" cssClass="form-control" id="timing" value="${userdata.timing}"/>
   </div><br>
   
  
  
  <div class="form-group">
    <label>Fees</label>
    <input name="fees" cssClass="form-control" id="fees" value="${userdata.fees}" />
   </div><br>
   
   <div class="form-group">
    <label>Mobile Number</label>
    <input name="mobilenumber" cssClass="form-control" id="mobilenumber" value="${userdata.mobilenumber}" />
   </div><br>
   
   <div class="form-group">
    <label>Info</label>
    <input name="info" cssClass="form-control" id="info" value="${userdata.info}" />
   </div><br>
   
   
   <div class="form-group">
    <label>Experience</label>
    <input name="experience" cssClass="form-control" id="experience" value="${userdata.experience}" />
   </div><br>
   
   <button type="submit" class="btn btn-success">Confirm</button>
</form>
  
  
</div>

</body>
</html>