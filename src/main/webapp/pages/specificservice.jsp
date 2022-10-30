<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/">
<input type="submit" value="GoBack">
</form>

	<center>
		<h1>Welcome to Service Booking Page</h1>

		<h1>The Service Details are:</h1>

<fieldset style="width: 1000px">

 <table border = "1" width = "100%">
<thead>
<tr>
<th >Service Id</th> 
<th>Service Name</th>
<th>Amount</th>


</tr>
</thead>
<tbody>
  <tr>

   <td>${result.serviceId} </td> 
    <td>${result.serviceName}</td>  
	<td>${result.amount}</td>
	
	</tr>
	
</tbody>
</table>

</fieldset>
<br><br>
<form action="servicepayment" >
 <input type="submit" value="Confirm Service"></input>
</form><br><br>

</center>


</body>
</html>