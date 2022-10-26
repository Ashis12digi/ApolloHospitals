<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medicine Item</title>
</head>
<body>

<center>
<h1>Medicine Details</h1>

<center>
<form action="medicineitems" id="ft-form" method="POST" accept-charset="UTF-8">
  <fieldset>
    <legend>Medicine Details</legend>
    <label>
    Medicine Id
      <input type="text" name=medicineid required>
    </label>
    <br><br>
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