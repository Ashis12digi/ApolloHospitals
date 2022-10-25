<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<center>
<h1> welcome</h1>



<h1> The DOctor Details are:</h1>
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
<th>Email id</th>
<th>Timing</th>
<th>Fees</th>
<th>MobileNumber</th>
<th>Info</th>
<th>Experience</th>


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
    
</c:forEach>




</tbody>
</table>

</body>
</html>