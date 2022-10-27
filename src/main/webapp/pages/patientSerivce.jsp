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


<table border = "1" width = "100%">
<thead>
<tr>
<th >Service Id</th>
<th>Patient Name</th>
<th>Service Details</th>

</tr>





<c:forEach items="${service}" var="x">  
  <tr>
    <td>${x.serviceid}</td>
    <td>${x.patientname}</td>  
 
    <td>${x.servicedetails}</td>
    
</c:forEach>

</thead>
<tbody>
</body>
</html>