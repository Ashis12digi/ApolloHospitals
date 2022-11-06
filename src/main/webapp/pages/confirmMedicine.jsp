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
<form action="paymentMedicine" method ="post">
Enter Patients Name: <input required="required" type = "text" placeholder="Enter Name" , name = "patientName" > 
 <br> <br> 
Enter Age: <input  type = "number" placeholder="Enter Age" , name="age" required="required">
<br>  <br>
Enter Number of Medicine  : <input  type = "number"  name="number" required="required">
<br>  <br>
Amount : <input type= "hidden"  name="medicineCost" value="${medicineCost}"/>
<br>  <br>
<input type ="submit" value="Confirm">
</form>

</center>

</body>
</html>