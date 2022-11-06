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

<td>
<center>
<h1> The Appointment Details are:</h1>
<fieldset style="width: 1000px">



<table border = "1" width = "100%">
<thead>
<tr>
<th >Appointment Id</th>
<th>Patient Name</th>

<th>Doctor Name</th>
<th>Date</th>


</tr>
</thead>
<tbody>
<c:forEach items="${appointment}" var="appointment">
  <tr>
  
   <td>
${appointment.appointmentId}
</td>
  
  <td>
${appointment.patientName}
</td>
    

      
    <td>
${appointment.doctorName}
</td>
    
      
    <td>
${appointment.date}
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