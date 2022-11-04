<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="Checkout">
Enter Patients Name: <input required="required" type = "text" placeholder="Enter Name" , name = "passangername" >  <br> <br> 
Enter Age: <input  type = "number" placeholder="Enter Age" , name="age" required="required"><br>  <br>
Enter Number of Seats: <input  type = "number"  name="number" required="required"><br>  <br>
Price : <input type= "number"  name="price" value="${price}">
<input type ="submit" value="CheckOut">
</form>

</body>
</html>