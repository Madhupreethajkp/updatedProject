<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.util.*,com.example.springmvc.model.IPODetail,com.example.springmvc.model.Company,com.example.springmvc.model.StockExchange"%>
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

<center><h1>User Landing Page</h1></center>



<br>

<br>
<br>



<div style="margin:60px;z-index:-1">
<button class="button1" type="button" ><span><a href="/displayIPO" style="text-decoration:none; color:white">IPOs</a></span></button>
<button class="button1" type="submit" ><span><a href="/compareCompany" style="text-decoration:none; color:white">Compare Company</span></button>
<button class="button1" type="submit" ><span><a href="/compareSector" style="text-decoration:none; color:white">Compare Sectors</span></button>
<button class="button1" type="submit"  ><span><a href="/listSector" style="text-decoration:none; color:white">Other</span></button>
</div>


		<center>
	<div class="editDiv" style="color:black">

		<br>
		<br>
		<h3 align="center">Edit IPO Details</h3>
		<br> <br>
		<table align="center" cellpadding="10">
		<div style="font-weight:bold" class="thick">
			<form:form action="editIpoDetail" method="post"
				modelAttribute="a1" class="well form-horizontal">
				
							<%
								IPODetail ip = (IPODetail) request.getAttribute("update");
							%>
				
				<tr>
					<td>IPO  id</td>
					<td>
				<form:input name="id" 
											value="<%=ip.getId() %>" class="form-control"
											type="text" path="id" readonly="true" /></td>
											</tr>
				<tr>
				
				
				<%
										ArrayList cd = (ArrayList) request.getAttribute("companyList");
											Iterator itr = cd.iterator();
									%>
					<td>Company Code</td>
					<td>
			<td><form:select path="companyCode" class="form-control"
							maxlength="10" required="required">
							<option value="<%=ip.getCompanyCode() %>"  selected><%=ip.getCompanyCode() %></option>
							<%
											
													while (itr.hasNext()) {
														Company company = (Company) itr.next();
														int company_code = company.getCompany_code();
														
										%>
										<option value="<%=company_code %> ">
											<%=company_code%></option>

										<%
											}
										%>

						</form:select></td>
				</tr>
				
				
				<tr>
				<%
										ArrayList stockDetails = (ArrayList) request.getAttribute("stockList");
											Iterator itr1 = stockDetails.iterator();
									%>
					<td>Stock Exchange Id</td>
						<td><form:select path="stockExchange_id" class="form-control"
							maxlength="10" required="required">
							<option value="<%=ip.getStockExchange_id() %>"  selected><%=ip.getStockExchange_id() %></option>
							<%
											
													while (itr1.hasNext()) {
														StockExchange stockExchange = (StockExchange) itr1.next();
														int stockexchange_id = stockExchange.getId();
														
										%>
										<option value="<%=stockexchange_id %> ">
											<%=stockexchange_id%></option>

										<%
											}
										%>

						</form:select></td>
				</tr>

<tr>
					<td>Price Per Share</td>
					<td><form:input name="" class="form-control"
						value="<%=ip.getPrice() %>"	placeholder="PRice Per Share" type="text" path="price"
							required="required" /> <small><form:errors
								path="price" cssClass="errormsg" /></small></td>
				</tr>

				<tr>
					<td>Total No Of Shares</td>
					<td><form:input name="" class="form-control" placeholder="totalShares"
						value="<%=ip.getTotalShares() %>"	type="text" path="totalShares" required="required" /> <small><form:errors
								path="totalShares" cssClass="errormsg" /></small></td>
				</tr>
				<tr>
					<td>Date Time</td>
					<td><form:input name="" class="form-control"
							value = "<%=ip.getDateTime() %>" placeholder="Date Time" type="text"
							path="dateTime" required="required" /> <small><form:errors
								path="dateTime" cssClass="errormsg" /></small></td>
				</tr>
				

			
				
				<tr>
					<td>Remarks</td>
					<td><form:input name="" class="form-control"
						value="<%=ip.getRemarks() %>"	placeholder="Remarks" type="text" path="remarks"
							required="required" /> <small><form:errors
								path="remarks" cssClass="errormsg" /></small></td>
				</tr>


				<tr>
					<td></td>
					
				</tr>

				<tr>
					<td></td>
					<td>
						<button type="submit" id="updateIpo" class="buttonCompany buttonCom"
							name="displayIPO">Update</button>
				
					</td>
				</tr>
			</form:form>
			</div>
			
		</table>

	</div>
	</center>
</body>
</html>
