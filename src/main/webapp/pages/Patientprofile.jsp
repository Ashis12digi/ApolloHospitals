<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.example.demo.controller.PatientsController"%>
    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>Profile Summary</h3>

<h4>  Patient Name  :${result.name}</h4>

<h4>  Patient Username  :${result.username}</h4>


<h4>  Patient Email Id  :${result.emailid}</h4>

<h4>  Patient Gender  :${result.gender}</h4>

<h4>  Patient Blood Group  :${result.bloodgroup}</h4>

<h4>  Patient Mobile Number  :${result.mobilenumber}</h4>

<h4>  Patient Address  :${result.address}</h4>




</center>
</body>
</html>