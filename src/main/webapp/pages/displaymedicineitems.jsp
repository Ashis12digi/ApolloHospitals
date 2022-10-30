<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Medicine Items</title>
</head>
<body>



<center>


<h3>Medicine Details: </h3>


<h4>  Medicine ID  :${medicineId }</h4>

<h4>  Medicine Name  :${medicinename }</h4>

<h4>  Medicine Brand  :${brand }</h4>

<h4> Medicine Type  :${madein }</h4>

<h4>  Quantity  :${quantity }</h4>
<h4> Medicine Cost  :${medicinecost }</h4>


</center>

</body>
</html>