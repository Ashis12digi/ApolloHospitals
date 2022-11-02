<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Doctor</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>


<style >
.topnav {
  background-color: #333;
  overflow: hidden;
}



.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}



.topnav a:hover {
  background-color: #ddd;
  color: black;
}



.topnav a.active {
  background-color: #04AA6D;
  color: white;
}


</style>
</head>
<body>

<center>
<h1> Welcome to our Hospital</h1>

<div class="topnav">
  <a class="active" href="/">Home</a>
</div> 



<form modelAttribute="eventForm" method="POST" >

<h1> The Doctor Details are:</h1>
<fieldset style="width: 1000px">



<table border = "1" width = "100%">
<thead>
<tr>
<th >Doctor Id</th>
<th>Name</th>
<th>UserName</th>

<th>Password</th>
<th>Location</th>
<th>Gender</th>
<th>EmailId</th>
<th>Timing</th>
<th>Fees</th>
<th>MobileNumber</th>
<th>Info</th>
<th>Experience</th>
<th>Action</th>

</tr>
</thead>
<tbody>



<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.id}</td>
    <td>${x.name}</td>  
   <td>${x.username}</td> 
   <td>${x.password}</td> 
    <td>${x.location}</td>
    <td>${x.gender}</td>
    <td>${x.emailid}</td> 
   
    <td>${x.timing}</td>
    <td>${x.fees}</td>
    <td>${x.mobilenumber}</td> 
 
    <td>${x.info}</td>
      <td>${x.experience}</td>
      
      
      
      
     <td>
       <spring:url value="/doctor/deleteDoctor/${x.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
     
    
</c:forEach>




</tbody>
</table>
</fieldset></form>
</body>
</html>