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
<form action="displayPrescription" id="ft-form" method="POST" accept-charset="UTF-8">
  <fieldset>
    <legend>For Patient</legend>
    <label>
    Patient Name:
      <input type="text" name="patientname" required>
    </label>
    <div class="two-cols">
      <label>
     Appointment ID:
        <input type="text" name="appointmentid">
      </label>
      
       <label>
    Prescription Details:
        <input type="text" name="description">
      </label>
      
    </div>
  </fieldset>

  <div class="btns">
    <input type="text" name="_gotcha" value="" style="display:none;">
    <input type="submit" value="Submit request">
  </div>
</center>

</body>
</html>