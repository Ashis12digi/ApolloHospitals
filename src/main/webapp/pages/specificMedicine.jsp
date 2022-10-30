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
		<h1>Welcome to Medicine Booking Page</h1>

		<h1>The Medicine Details are:</h1>

<fieldset style="width: 1000px">

 <table border = "1" width = "100%">
<thead>
<tr>
<th >Medicine Id</th> 
<th>Medicine Name</th>
<th>Made In</th>
<th>Medicine Cost</th>

</tr>
</thead>
<tbody>
  <tr>

   <td>${result.medicineId} </td> 
    <td>${result.medicinename}</td>  
	<td>${result.madein}</td>
	<td>${result.medicinecost}</td>
	</tr>
	
</tbody>
</table>

</fieldset>
<br><br>
<form action="medicinepayment" >
 <input type="submit" value="Confirm"></input>
</form><br><br>

</center>



</body>
</html>