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
<h2>Services Request Register Successful!</h2>

<h3>Service Details: </h3>

<h4> Service ID  :${serviceId }</h4>

<h4>Patient Name  :${patientName }</h4>
<h4> Service Details  :${servicedetails }</h4>
<h4>Service Amount  :${amount }</h4>

</center>



</body>
</html>