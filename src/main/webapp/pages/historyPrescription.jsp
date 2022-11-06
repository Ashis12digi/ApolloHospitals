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
<h2>Prescription History</h2>


<td>




<h1> The Prescription Details are:</h1>
<fieldset style="width: 1000px">



<table border = "1" width = "100%">
<thead>
<tr>
<th >Prescription Id</th>
<th>Patient Name</th>
<th>Description</th>


</tr>
</thead>
<tbody>


 
     


<c:forEach items="${prescription}" var="prescription">

 
  
  <tr>
  
   <td>
${prescription.prescriptionId}
</td>
  
  <td>
${prescription.patientName}
</td>
    
    <td>
${prescription.description}
</td>
    
 
 <td>
    
  </td>

  </tr>
 </form>
  
  

</c:forEach>




</tbody>
</table>






</center>


</body>
</html>