<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style >
.topnav {
  background-color: #333;
  overflow: hidden;
}



.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}



.topnav a:hover {
  background-color: #ddd;
  color: black;
}



.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
</style>

</head>
<body>
 
  <div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="">Lab Facility</a>
 </div>


<center>
<h1>Medicine Details</h1>

<center>
<form action="/update/Inventory" id="ft-form" method="POST" accept-charset="UTF-8">
  <fieldset>
    <legend>Medicine Details</legend>
    <label>
    Medicine Name:
      <input type="text" name="medicinename" required>
    </label>
    <br><br>
    <label>
    Brand Name:
      <input type="text" name="brand" required>
    </label>
    <br><br>
    <label>
    Made in:
      <input type="text" name="madein" required>
    </label>
    <br><br>
    <label>
    Quantity:
      <input type="text" name="quantity" required>
    </label>
    <br><br>
    <label>
    Medicine Cost:
      <input type="text" name="medicinecost" required>
    </label>
   <br><br>
    
   
  </fieldset>
  <fieldset>
   
     
    </div>
  
    
  </fieldset>
  <div class="btns">
    <input type="text" name="_gotcha" value="" style="display:none;">
    <input type="submit" value="Submit request">
  </div>
</form>

</center>


</body>
</html>