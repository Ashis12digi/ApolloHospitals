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
    <br><br>
    <div class="two-cols">
     
      
       <label>
    Prescription Details:
      
        <textarea cols="80" rows="5" name="description">  
</textarea> 
        
      </label>
       <br><br>
    </div>
  </fieldset>

  <div class="btns">
    <input type="text" name="_gotcha" value="" style="display:none;">
    <input type="submit" value="Submit request">
  </div>
</center>

</body>
</html>