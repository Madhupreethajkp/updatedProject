<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<style>

</style>
</head>
<body>
<div class="menu">
<h1 style="float:left">STOCK MARKET CHARTING</h1>
   <a href="/logout"  style="text-decoration:none;float:right">LOGOUT</a> 
  
</div>
<div style="margin:60px;z-index:-1">
<button class="button1" type="submit" ><span><a href="/import" style="text-decoration:none; color:white">Import Data</a></span></button>
<button class="button1" type="submit" ><span><a href="/manageCompany" style="text-decoration:none; color:white">Manage Company</a></span></button>
<button class="button1" type="submit" ><span><a href="manageExchange" style="text-decoration:none; color:white">Manage Exchange</a></span></button>
<button class="button1" type="submit"  ><span><a href="/addIPO" style="text-decoration:none; color:white">Add IPO Details</a></span></button>
</div>




  <div class="container" style="color:black" >
 
	<form:form method="POST" action="/addSector" modelAttribute="sec">
	<center><h3>Create New Sector</h3></center>
	<b>
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 " for="sector_name">Sector Name</label>
               <div class="col-md-7">
                    <form:input type="text" path="sector_name" id="sector_name" class="field"/>
                    <div class="has-error">
                        <form:errors path="sector_name" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
	
        <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="brie">Brief</label>
               <div class="col-md-7">
                    <form:input type="text" path="brief" id="brief" class="field"/>
                    <div class="has-error">
                        <form:errors path="brief" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
         
 
  <center> <div> <input type="submit" style="margin:50px;" value="Submit" />&nbsp;&nbsp;&nbsp;
 
</center>
</b>
</form:form>
  </div>
  
 


</body>
</html>
