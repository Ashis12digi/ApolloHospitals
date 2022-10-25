<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Prescription</title>
</head>
<body>


<body style="background-color:powderblue;">
<style>
table,th,td{
border: 1px solid black;
padding: 3px;
text-align: center;
}
table{
border-spacing: 5px;
}
</style>

<hr> <hr>

<H1 align="center">HOSPITAL SWERSIE</H1>
	<hr>
	<a th:href="/ ">Home</a>
	 <hr>
	<br>
	<br>
       
        <table style="width:100%">
        <caption>Your appointments</caption>
        <tr>
            <th>AppointmentID</th>
            <th>Patient Name</th>
            <th>Prescription</th>
           
        </tr>
        <tr th:each="prescription : ${prescriptions}">
            <td th:text="${prescription.appointmentID}"></td>
          	<td th:text="${prescription.patientName}"></td>
          	<td th:text="${prescription.description}"></td>
          
        </tr>
    </table>

</body>
</html>