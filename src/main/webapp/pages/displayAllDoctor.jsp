<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


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



<h1> The Doctor Details are:</h1>
<fieldset style="width: 1000px">



<table border = "1" width = "100%">
<thead>
<tr>
<th >Doctor Id</th>
<th>Name</th>

<th>Location</th>
<th>Gender</th>

<th>Timing</th>
<th>Fees</th>

<th>Info</th>
<th>Experience</th>


</tr>
</thead>
<tbody>



<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.id}</td>
    <td>${x.doctorName}</td>  
 
    <td>${x.location}</td>
    <td>${x.gender}</td>
   
    <td>${x.timing}</td>
    <td>${x.fees}</td>
 
    <td>${x.info}</td>
      <td>${x.experience}</td>
     
    
</c:forEach>




</tbody>
</table>

</body>
</html>