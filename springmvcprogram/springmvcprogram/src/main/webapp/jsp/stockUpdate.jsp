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
<button class="button1" type="submit" ><span><a href="/import" style="text-decoration:none; color:white">Import Data</a></span></button>
<button class="button1" type="submit" ><span><a href="/manageCompany" style="text-decoration:none; color:white">Manage Company</a></span></button>
<button class="button1" type="submit" ><span><a href="manageExchange" style="text-decoration:none; color:white">Manage Exchange</a></span></button>
<button class="button1" type="submit"  ><span><a href="/addIPO" style="text-decoration:none; color:white">Add IPO Details</a></span></button>
</div>



		<center>
	<div class="editDiv">

		<br>
		<br>
		<h3 align="center">Edit StockExchange Details</h3>
		<br> <br>
		<table align="center" cellpadding="10">
		<div style="font-weight:bold" class="thick">
			<form:form action="editStock" method="post"
				modelAttribute="s1" class="well form-horizontal">
				
							<%
								StockExchange s = (StockExchange) request.getAttribute("update");
							%>
				
				
				<tr>
					<td>StockExchange Id</td>
					<td>
				<form:input name="id" 
											value="<%=s.getId() %>" class="form-control"
											type="text" path="id" readonly="true" /></td>
											</tr>
				
				
				<tr>
					<td>StockExchange Name</td>
					<td><form:input name="" class="form-control" value="<%=s.getStockexchange_name() %>"
							placeholder="Stock Exchange Name" type="text" path="stockexchange_name"
							required="required" /> <small><form:errors
								path="stockexchange_name" cssClass="errormsg" /></small></td>
				</tr>


<tr>
					<td>Contact Address</td>
					<td><form:input name="" class="form-control"
						value="<%=s.getContactAddress() %>"	placeholder="ContactAddress" type="text" path="contactAddress"
							required="required" /> <small><form:errors
								path="contactAddress" cssClass="errormsg" /></small></td>
				</tr>

				<tr>
					<td>Brief</td>
					<td><form:input name="" class="form-control"
						value="<%=s.getBrief() %>"	placeholder="Brief" type="text" path="brief"
							required="required" /> <small><form:errors
								path="brief" cssClass="errormsg" /></small></td>
				</tr>


			
				<tr>
					<td>Remarks</td>
					<td><form:input name="" class="form-control" placeholder="Remarks"
						value="<%=s.getRemarks() %>"	type="text" path="remarks" required="required" /> <small><form:errors
								path="remarks" cssClass="errormsg" /></small></td>
				</tr>
				
				

				
				

				<tr>
					<td></td>
					<td>
						<button type="submit" id="updateCompany" class="buttonCompany buttonCom"
							name="listStock">Update</button>
				
					</td>
				</tr>
			</form:form>
			</div>
			
		</table>

	</div>
	</center>
</body>
</html>
