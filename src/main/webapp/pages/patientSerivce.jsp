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
<th >Prescription Id</th>
<th>Patient Name</th>
<th>Description</th>

</tr>





<c:forEach items="${service}" var="x">  
  <tr>
    <td>${x.prescriptionId}</td>
    <td>${x.patientName}</td>  
 
    <td>${x.description}</td>
    
</c:forEach>

</thead>
<tbody>
</body>
</html>