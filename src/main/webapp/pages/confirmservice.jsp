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

<form action="payment" method ="post">
Enter Patients Name: <input required="required" type = "text" placeholder="Enter Name" , name = "patientname"> 
 <br> <br> 
Enter Age: <input  type = "number" placeholder="Enter Age" , name="age">
<br>  <br>
Enter Mobile Number  : <input  type = "number"  name="num">
<br>  <br>
Amount : <input type= "number"  name="amount" value="${amount}"/>
<input type ="submit" value="Confirm">
</form>



</center>

</body>
</html>