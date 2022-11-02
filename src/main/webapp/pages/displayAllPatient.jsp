<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Patient</title>
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

<h1> The Patient Details are:</h1>








<fieldset style="width: 1000px">



<table border = "1" width = "100%">
<thead>
<tr>
<th >Patient Id</th>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
<th>EmailId</th>
<th>DateOfBirth</th>

<th>Gender</th>
<th>BloodGroup</th>

<th>MobileNumber</th>
<th>Address</th>


</tr>
</thead>
<tbody>



<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.id}</td>
    <td>${x.patientname}</td>  
 
    <td>${x.username}</td>
    <td>${x.password}</td>
   
    <td>${x.emailid}</td>
    <td>${x.dateofbirth}</td>
 
    <td>${x.gender}</td>
      <td>${x.bloodgroup}</td>
      <td>${x.mobilenumber}</td>
       <td>${x.address}</td>
       
         
     <td>
       <spring:url value="/doctor/deletePatient/${x.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
      
    
    
</c:forEach>




</tbody>
</table>


</body>
</html>