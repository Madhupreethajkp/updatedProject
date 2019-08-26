<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 <link rel="stylesheet" type="text/css" href="css/style.css"/>
 
</head>
<body><div class="menu">
<h1 style="float:left">STOCK MARKET CHARTING</h1>
  <a href="/logout"  style="text-decoration:none;float:right">LOGOUT</a> 

</div>

<center><h1>User Landing Page</h1></center>



<br>

<br>
<br>



<div style="margin:60px;z-index:-1">
<button class="button1" type="submit" ><span><a href="/displayIPO" style="text-decoration:none; color:white">IPOs</a></span></button>
<button class="button1" type="submit" ><span><a href="/compareCompany" style="text-decoration:none; color:white">Compare Company</span></button>
<button class="button1" type="submit" ><span><a href="/compareSector" style="text-decoration:none; color:white">Compare Sectors</span></button>
<button class="button1" type="submit"  ><span><a href="/listSector" style="text-decoration:none; color:white">Other</span></button>
</div>


  <div class="container" style="color:black" >
  <form action="">
    <center><h1>Compare Companies</h1></center>
    <p></p>
    <hr>

    <b>Select Company</b>
	<br>
    <input type="text" placeholder="" name="company" class="field" required>
    <br>
    <b>Select Stock Exchange </b>
    <input type="text" placeholder="" name="stock" class="field" required>
	
<br>
    <b>Company Name</b>
    <input type="text" placeholder="" name="name" class="field" required>
	<br>
    <b>From Period</b>
    <input type="date" placeholder="" name="from" class="field" required>
	<br>
    <b>To Period</b>
    <input type="date" placeholder="" name="to" class="field" required>
    <br>
    <b>Periodicity</b>
    <input type="text" placeholder="" name="period" class="field" required>
	<br>
	<div class="w3-container">
	<button class="w3-button w3-circle w3-black"  data-toggle="modal" data-target="#myModal">+</button>
	</div>
    <center><button type="submit" class="registerbtn1" >Generate Map</button></center>
	</form>
  </div>
<div class="modal fade" id="myModal" role="dialog">
                                <div class="modal-dialog">
                                
                                  <!-- Modal content-->
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <div style="color:black">
                                   <form:form action="">
    <center><h1>Compare Companies</h1></center>
    <p></p>
    <hr>

    <b>Select Company </b>
	<br>
    <input type="text" placeholder="" name="company" class="field" required>
    <br>
    <b>Select Stock Exchange </b>
    <input type="text" placeholder="" name="stock" class="field" required>
	
<br>
    <b>Company Name</b>
    <input type="text" placeholder="" name="name" class="field" required>
	<br>
    <b>From Period</b>
    <input type="date" placeholder="" name="from" class="field" required>
	<br>
    <b>To Period</b>
    <input type="date" placeholder="" name="to" class="field" required>
    <br>
    <b>Periodicity</b>
    <input type="text" placeholder="" name="period" class="field" required>
	<br>
	<div class="w3-container">
	<button class="w3-button w3-circle w3-black">+</button>
	</div>
    <center><button type="submit" class="registerbtn1"  data-toggle="modal" data-target="#myModal">Generate Map</button></center>
	</form:form>
	</div>
	</div>
	</div>
	</div>
	</div>
	
</body>
</html>
