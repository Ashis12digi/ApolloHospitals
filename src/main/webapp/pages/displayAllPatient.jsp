<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<center>



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
    <td>${x.name}</td>  
 
    <td>${x.username}</td>
    <td>${x.password}</td>
   
    <td>${x.emailid}</td>
    <td>${x.dateofbirth}</td>
 
    <td>${x.gender}</td>
      <td>${x.bloodgroup}</td>
      <td>${x.mobilenumber}</td>
       <td>${x.address}</td>
    
</c:forEach>




</tbody>
</table>


</body>
</html>