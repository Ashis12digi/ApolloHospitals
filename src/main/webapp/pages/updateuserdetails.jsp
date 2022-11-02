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



<form action="/updateUser" method="post">
<div>
   <input type="hidden" name="id" cssClass="form-control" id="id"  value="${userdata.id}">
   
    <label>Patient Name</label>
    <input name="patientname" cssClass="form-control" id="patientname" value="${userdata.patientname}" />
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
    <label>EmailId</label>
    <input name="emailid" cssClass="form-control" id="emailid" value="${userdata.emailid}"/>
   </div><br>
   
   <div class="form-group">
     <label>DOB</label>
    <input  type="text" name="dateofbirth" cssClass="form-control" id="dateofbirth" value="${userdata.dateofbirth}" />
   </div><br>
   
  
   
   <div class="form-group">
    <label>Gender</label>
    <input name="gender" cssClass="form-control" id="gender" value="${userdata.gender}" />
   </div><br>
   
   <div class="form-group">
    <label>Blood Group</label>
    <input name="bloodgroup" cssClass="form-control" id="bloodgroup" value="${userdata.bloodgroup}"/>
   </div><br>
   
   <div class="form-group">
    <label>Mobile Number</label>
    <input name="mobilenumber" cssClass="form-control" id="mobilenumber" value="${userdata.mobilenumber}"/>
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