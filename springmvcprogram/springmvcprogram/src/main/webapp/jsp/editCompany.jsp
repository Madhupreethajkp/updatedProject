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




  <div class="editDiv" style="color:black" >
 <!--  <form action="">
    <center><h1>Create New Company</h1></center>
    <p></p>
    <hr>

    <b>Company Name </b>
	<br>
    <input type="text" placeholder="" name="name" class="field" required>
    <br>
    <b>CEO Name </b>
    <input type="text" placeholder="" name="ceo" class="field" required>
	
<br>
    <b>Board Members</b>
    <input type="text" placeholder="" name="turnover" class="field" required>
	<br>
    <b>Brief Description</b>
    <input type="text" placeholder="" name="brief" class="field" required>
	<br>
    <b>IPO Date</b>
    <input type="date" placeholder="" name="date" class="field" required>
    <center><button type="submit" class="registerbtn1">Save</button></center>
	</form> -->
	<form:form method="POST" action="/editCompany" modelAttribute="editDetails">
	<center><h3>Edit Company Details</h3></center>
	<b>
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="company_code">Enter Company code</label>
               <div class="col-md-7">
                    <form:input type="text" path="company_code" id="company_code" class="field"/>
                    <div class="has-error">
                        <form:errors path="company_code" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 " for="companyName">Company Name</label>
               <div class="col-md-7">
                    <form:input type="text" class="field" path="companyName" id="companyName"></form:input>
                    
                    <div class="has-error">
                        <form:errors path="companyName" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="ceo">CEO name</label>
               <div class="col-md-7">
                    <form:input type="text" path="CEO" id="CEO" class="field"/>
                    <div class="has-error">
                        <form:errors path="CEO" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="boardOfDirectors">Board of directors</label>
               <div class="col-md-7">
                    <form:input type="text" path="boardOfDirectors" id="boardOfDirectors" class="field"/>
                    <div class="has-error">
                        <form:errors path="boardOfDirectors" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
 
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="turnOver">Turnover</label>
               <div class="col-md-7">
                    <form:input type="text" path="turnOver" id="turnOver" class="field"/>
                    <div class="has-error">
                        <form:errors path="turnOver" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="sectorId">SectorId</label>
               <div class="col-md-7">
                    <form:input type="text" path="sectorId" id="sectorId" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="sectorId" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div> 
        <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="briefWriteup">Brief Write up</label>
               <div class="col-md-7">
                    <form:input type="text" path="briefWriteup" id="briefWriteup" class="field"/>
                    <div class="has-error">
                        <form:errors path="briefWriteup" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
         
 
  <center> <div> <input type="submit" style="margin:50px;" value="Update" />&nbsp;&nbsp;&nbsp;
   
</center>
</b>
</form:form>
  </div>
  
 


</body>
</html>
