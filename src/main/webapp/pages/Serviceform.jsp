<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service</title>
</head>
<body>

<div align="center">
<center>

 <h2>Service Details</h2>
<fieldset style="width:600px">
<form action="fetchServices"  >

 
 <tr>
 Patient Name:
<input type="text" name="patientName" placeholder="Enter patientsName " required="required">
</tr>
 
 <br><br>
 
<select name="servicedetails"  id="data">
  <option value="">Lab Tests </option>
  <option value="Blood enzyme tests">Blood enzyme tests</option>
  <option value="liver function test">liver function test</option>
   <option value="Xray">Xray</option>
    <option value="gastric fluid analysis">gastric fluid analysis</option>
     <option value="malabsorption">malabsorption test</option>
      <option value="Ecg">ECG</option>
       <option value="enzyme">Blood enzyme tests</option>
        <option value="metabolic">Basic metabolic panel</option>
         <option value="Liver">Liver Panel</option>
          <option value="Thyroid">Thyroid Stimulating Hormone</option>
           <option value="Hemoglobin">Hemoglobin A1C</option>
            <option value="Complete blood count">Complete blood count</option>
             <option value="Organ function tests">Organ function tests</option>
              <option value=" Infectious disease tests"> Infectious disease tests</option>
              
      
          
          
          
 
</select>
<br><br>

 <tr>
 Service Amount:
<input type="text" name="amount"  value="${amount}" required="required" >
</tr>   
 <br><br>
    <input type="submit" value="Submit Request">
 
</form>


</fieldset>
</center>

    </div>

</body>
</html>