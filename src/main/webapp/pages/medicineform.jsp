<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Medical Shop</h1>

<center>
<form action="update/medicineInventory" id="ft-form" method="POST" accept-charset="UTF-8">
  <fieldset>
    <legend>Medicine Details</legend>
   
    <label>
    Patient Name:
      <input type="text" name="patientName" required>
    </label>
    <br><br>
    <label>
    Medicine Name:
      <input type="text" name="medicineName" required>
    </label>
    <br><br>
    
    <label>
    Quantity:
      <input type="text" name="quantity" required>
    </label>
    <br><br>
    <label>
    Medicine Cost:
      <input type="text" name="medicineCost" required>
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