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
<form action="feedbackdisplay" id="ft-form" method="POST" accept-charset="UTF-8">
  <fieldset>
    <legend>Feedback Details</legend>
   
   
    <label>
    Patient Name:
      <input type="text" name="name" required>
    </label>
    <br><br>
    <label>
    Feedback Details:
      <input type="text" name="details" required>
    </label>
    
   
  </fieldset>
  <fieldset>
   
     
    </div>
  
    
  </fieldset>
  <div class="btns">
    <input type="text" name="_gotcha" value="" style="display:none;">
    <input type="submit" value="Submit ">
  </div>
</form>

</center>

</body>
</html>