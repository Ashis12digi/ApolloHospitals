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
<h3>Doctor Profile Details</h3>

<h4>  Doctor Name  :${result.name}</h4>

<h4>  Doctor Username  :${result.username}</h4>


<h4>  Doctor Password  :${result.password}</h4>

<h4>  Doctor Location  :${result.location}</h4>

<h4>  Doctor Gender  :${result.gender}</h4>

<h4>  Doctor EmailId  :${result.emailid}</h4>

<h4>  Doctor Timing  :${result.timing}</h4>
<h4>  Doctor Fees  :${result.fees}</h4>
<h4>  Doctor Mobile Number  :${result.mobilenumber}</h4>
<h4>  Doctor Info  :${result.info}</h4>
<h4>  Doctor Experience  :${result.experience}</h4>


<a class="btn btn-info" href="/editDoctor?id=${result.id}"><h2>Update</h2></a>



</center>

</body>
</html>