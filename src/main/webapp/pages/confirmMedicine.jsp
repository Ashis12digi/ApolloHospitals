<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="paymentmedicine" method ="post">
Enter Patients Name: <input required="required" type = "text" placeholder="Enter Name" , name = "patientname"> 
 <br> <br> 
Enter Age: <input  type = "number" placeholder="Enter Age" , name="age">
<br>  <br>
Enter Number of Medicine  : <input  type = "number"  name="num">
<br>  <br>
Amount : <input type= "number"  name="medicinecost" value="${medicinecost}"/>
<input type ="submit" value="Confirm">
</form>



</body>
</html>