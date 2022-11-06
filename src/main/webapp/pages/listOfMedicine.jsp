<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Medicine</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>


</head>
<body>


<center>




<h1> The Medicine Details are:</h1>
<fieldset style="width: 1000px">



<table border = "1" width = "100%">
<thead>
<tr>
<th >Medicine Id</th>
<th>Medicine Name</th>
<th>Made In</th>
<th>Medicine Cost/Piece</th>

</tr>
</thead>
<tbody>



<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.medicineId}</td>
    <td>${x.medicineName}</td>  
   <td>${x.madeIn}</td> 
    
      <td>${x.medicineCost}</td> 

</c:forEach>




</tbody>
</table>


 <form action="searchMedicine" method="post" >

Enter the Medicine Id <input required="required" type = "number" placeholder="Enter Medicine id" name=medicineId> <br><br>
 <input type="submit" value="Enter"></input>
</form>



</body>
</html>