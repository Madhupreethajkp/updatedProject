<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.util.*,com.example.springmvc.model.Company,com.example.springmvc.model.Sector"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<style>
.thick{
font-weight:bold;
}


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



		<center>
	<div class="editDiv">

		<br>
		<br>
		<h3 align="center">Edit Company Details</h3>
		<br> <br>
		<table align="center" cellpadding="10">
		<div style="font-weight:bold" class="thick">
			<form:form action="editCompany" method="post"
				modelAttribute="e1" class="well form-horizontal">
				
							<%
								Company company = (Company) request.getAttribute("update");
							%>
				
				
				<tr>
					<td>Company Code</td>
					<td>
				<form:input name="company_code" 
											value="<%=company.getCompany_code() %>" class="form-control"
											type="text" path="company_code" readonly="true" /></td>
											</tr>
				
				
				<tr>
					<td>Company Name</td>
					<td><form:input name="" class="form-control" value="<%=company.getCompanyName() %>"
							placeholder="Company Name" type="text" path="companyName"
							required="required" /> <small><form:errors
								path="companyName" cssClass="errormsg" /></small></td>
				</tr>


<tr>
					<td>TurnOver</td>
					<td><form:input name="" class="form-control"
						value="<%=company.getTurnOver() %>"	placeholder="Turn Over" type="text" path="turnOver"
							required="required" /> <small><form:errors
								path="turnOver" cssClass="errormsg" /></small></td>
				</tr>

				<tr>
					<td>CEO Name</td>
					<td><form:input name="" class="form-control" placeholder="CEO"
						value="<%=company.getCEO() %>"	type="text" path="CEO" required="required" /> <small><form:errors
								path="CEO" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Board Of Directors</td>
					<td><form:input name="" class="form-control"
							value = "<%=company.getBoardOfDirectors() %>" placeholder="Board Of directors" type="text"
							path="boardOfDirectors" required="required" /> <small><form:errors
								path="boardOfDirectors" cssClass="errormsg" /></small></td>
				</tr>
				

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
					<td>Brief Description</td>
					<td><form:input name="" class="form-control"
						value="<%=company.getBriefWriteup() %>"	placeholder="Brief WriteUp" type="text" path="briefWriteup"
							required="required" /> <small><form:errors
								path="briefWriteup" cssClass="errormsg" /></small></td>
				</tr>


				<tr>
					<td></td>
					
				</tr>

				<tr>
					<td></td>
					<td>
						<button type="submit" id="updateCompany" class="buttonCompany buttonCom"
							name="updateCompany">Update</button>
				
					</td>
				</tr>
			</form:form>
			</div>
			
		</table>

	</div>
	</center>
</body>
</html>
