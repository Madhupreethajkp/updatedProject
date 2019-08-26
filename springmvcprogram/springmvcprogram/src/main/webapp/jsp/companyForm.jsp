<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.springmvc.model.Company,com.example.springmvc.model.Sector" pageEncoding="ISO-8859-1"%>
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




  <div class="container" style="color:black;background-color:#C0D8F4" >
 
	<form:form method="POST" action="/addCompany" modelAttribute="e1">
	<center><h3>Create New Company</h3></center>
	<b>
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 " for="companyName">Company Name</label>
               <div class="col-md-7">
                    <form:input type="text" path="companyName" id="companyName" class="field"/>
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
        
        
						 	<%
								Company company = (Company) request.getAttribute("e1");
							%>
				
        
        
        
				<tr>
				<%
										ArrayList sectorDetails = (ArrayList) request.getAttribute("sectorList");
											Iterator itr = sectorDetails.iterator();
									%>
				
					<td>Sector Id</td>
					<td><form:select path="sectorId" class="form-control"
							maxlength="10" required="required">
							<option value="<%=company.getSectorId() %>"  selected><%=company.getSectorId() %></option>
							<%
											
													while (itr.hasNext()) {
														Sector sector = (Sector) itr.next();
														int sectorId = sector.getSector_id();
														
										%>
										<option value="<%=sectorId %> ">
											<%=sectorId%></option>

										<%
											}
										%>

						</form:select></td>
				</tr>
				<tr>
				<tr> 
        
       
         
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
         
 
  <center> <div> <input type="submit" style="margin:50px;" value="Submit" />&nbsp;&nbsp;&nbsp;
    <button class="buttonCompany buttonCom"><a href="/updateCompany" style="text-decoration:none;">Update</a></button></div>
</center>
</b>
</form:form>
  </div>
  
 


</body>
</html>
