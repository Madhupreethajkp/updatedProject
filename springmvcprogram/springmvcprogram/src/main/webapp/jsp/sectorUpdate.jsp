<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.util.*,com.example.springmvc.model.StockExchange,com.example.springmvc.model.Sector"%>
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
<button class="button1" type="submit" ><span><a href="/displayIPO" style="text-decoration:none; color:white">IPOs</a></span></button>
<button class="button1" type="submit" ><span><a href="/compareCompany" style="text-decoration:none; color:white">Compare Company</span></button>
<button class="button1" type="submit" ><span><a href="/compareSector" style="text-decoration:none; color:white">Compare Sectors</span></button>
<button class="button1" type="submit"  ><span><a href="/listSector" style="text-decoration:none; color:white">Other</span></button>
</div>


		<center>
	<div class="editDiv">

		<br>
		<br>
		<h3 align="center">Edit StockExchange Details</h3>
		<br> <br>
		<table align="center" cellpadding="10">
		<div style="font-weight:bold" class="thick">
			<form:form action="editSector" method="post"
				modelAttribute="sec" class="well form-horizontal">
				
							<%
								Sector s = (Sector) request.getAttribute("update");
							%>
				
				
				<tr>
					<td>Sector Id</td>
					<td>
				<form:input name="id" 
											value="<%=s.getSector_id() %>" class="form-control"
											type="text" path="sector_id" readonly="true" /></td>
											</tr>
				
				
				<tr>
					<td>Sector Name</td>
					<td><form:input name="" class="form-control" value="<%=s.getSector_name() %>"
							placeholder="Sector Name" type="text" path="sector_name"
							required="required" /> <small><form:errors
								path="sector_name" cssClass="errormsg" /></small></td>
				</tr>



				<tr>
					<td>Brief</td>
					<td><form:input name="" class="form-control"
						value="<%=s.getBrief() %>"	placeholder="Brief" type="text" path="brief"
							required="required" /> <small><form:errors
								path="brief" cssClass="errormsg" /></small></td>
				</tr>


			

				
				

				<tr>
					<td></td>
					<td>
						<button type="submit" id="updateCompany" class="buttonCompany buttonCom"
							name="listSector">Update</button>
				
					</td>
				</tr>
			</form:form>
			</div>
			
		</table>

	</div>
	</center>
</body>
</html>
