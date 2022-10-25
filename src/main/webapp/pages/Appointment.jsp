<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment Form</title>



</head>
<body>

<center>
<form action="appointmnet" id="ft-form" method="POST" accept-charset="UTF-8">
  <fieldset>
    <legend>For Patient</legend>
    <label>
    Patient Id
      <input type="text" name="patientid" required>
    </label>
    <div class="two-cols">
      <label>
      Doctor Name
        <input type="text" name="doctorname">
      </label>
      
    </div>
  </fieldset>
  <fieldset>
    <legend>Appointment request</legend>
    <div class="two-cols">
      <label>
        date
        <input type="date" name="Appointment request" required>
      </label>
     
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