<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>

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


.activereg{
position: absolute;
left: 90%;
}

body {
  background-image:url("pages/images/DrRegister.jpg");
  background-size: cover;
}
  
</style>


</head>
<body>


<center>
<h1>Online Hospital Booking</h1>

<form action="">

  
  <div class="topnav">
  <a class="active" href="#home">HOME</a>
 
   <a href="fetchalldoctor">DOCTORS</a>
   <a href="Appointmentform">BOOK APPOINTMENT</a>
    
      
       <a href="ServiceFacilityindex">MEDICAL STORE</a>
  
     <a href="contactus">CONTACT US</a>
 
   <a  class="activereg" href="alllogin">LOGIN</a>
           
  
   
</div>
  
          
  
  </form>
  </center>
</body>
</html>