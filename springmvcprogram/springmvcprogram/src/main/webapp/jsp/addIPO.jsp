<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.springmvc.model.Company,com.example.springmvc.model.IPODetail,com.example.springmvc.model.StockExchange" pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="css/style.css"/>
  <style>
 
#excel
{
font-size : 30px;
text-align : center;
}

#select_text
{
font-size : 22px;
} 
.nav{
 height:150px;
 width:1000px;
}
 
  </style>
</head>
<body><div class="menu">
<h1 style="float:left">STOCK MARKET CHARTING</h1>
  <a href="/logout"  style="text-decoration:none;float:right">LOGOUT</a> 

</div>

<center><h1>Admin Landing Page</h1></center>



<br>

<br>
<br>

<div style="margin:60px;z-index:-1">
<button class="button1" type="submit" ><span><a href="/import" style="text-decoration:none; color:white">Import Data</a></span></button>
<button class="button1" type="submit" ><span><a href="/manageCompany" style="text-decoration:none; color:white">Manage Company</a></span></button>
<button class="button1" type="submit" ><span><a href="manageExchange" style="text-decoration:none; color:white">Manage Exchange</a></span></button>
<button class="button1" type="submit"  ><span><a href="/addIPO" style="text-decoration:none; color:white">Update IPO Details</a></span></button>
</div>






  <div class="container" style="color:black;background-color:#C0D8F4" >
 
	<form:form method="POST" action="/addIPODetail" modelAttribute="a1">
	<center><h3>Create New IPO</h3></center>
	<b>
	 <div class="row">
            <div class="form-group col-md-12">
        
	
						 	<%
						IPODetail ip= (IPODetail) request.getAttribute("a1");
							%>
							
				<tr>
				<%
										ArrayList companyDetails = (ArrayList) request.getAttribute("companyList");
											Iterator itr = companyDetails.iterator();
									%>
				
				
					<td>Company Code</td>
					<td><form:select path="companyCode" class="form-control"
							maxlength="10" required="required" >
							<option value="<%=ip.getCompanyCode() %>"  selected><%=ip.getCompanyCode() %></option>
							<%
											
													while (itr.hasNext()) {
														Company company = (Company) itr.next();
														int companyCode = company.getCompany_code();
														
										%>
										<option value="<%=companyCode %> ">
											<%=companyCode%></option>

										<%
											}
										%>

						</form:select></td>
				</tr>
			</div>
			</div>
			
			
			
			
			
			
			
			
			 <div class="row">
            <div class="form-group col-md-12">
        
	
						 	<%
						IPODetail ip1= (IPODetail) request.getAttribute("a1");
							%>
							
				<tr>
				<%
										ArrayList stockDetails = (ArrayList) request.getAttribute("stockList");
											Iterator itr1 = stockDetails.iterator();
									%>
				
				
					<td>Stock Exchange Id</td>
					<td><form:select path="stockExchange_id" class="form-control"
							maxlength="10" required="required">
							<option value="<%=ip1.getStockExchange_id() %>"  selected><%=ip1.getStockExchange_id() %></option>
							<%
											
													while (itr1.hasNext()) {
														StockExchange st = (StockExchange) itr1.next();
														int id = st.getId();
														
										%>
										<option value="<%=id %> ">
											<%=id%></option>

										<%
											}
										%>

						</form:select></td>
				</tr>
			</div>
			</div>
			
			
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="price">Price Per Share</label>
               <div class="col-md-7">
                    <form:input type="text" path="price" id="price" class="field"/>
                    <div class="has-error">
                        <form:errors path="price" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
 
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="totalShares">Total no of Shares</label>
               <div class="col-md-7">
                    <form:input type="text" path="totalShares" id="totalShares" class="field"/>
                    <div class="has-error">
                        <form:errors path="totalShares" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="remarks">Remarks</label>
               <div class="col-md-7">
                    <form:input type="text" path="remarks" id="remarks" class="field"/>
                    <div class="has-error">
                        <form:errors path="remarks" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
        
        
        
        
        
			
				
        
       
 
  <center> <div> <input type="submit" style="margin:50px;" value="Submit" />&nbsp;&nbsp;&nbsp;
   <!--  <button class="buttonCompany buttonCom"><a href="/updateStock" style="text-decoration:none;">Update</a></button></div> -->
</center>
</b>
</form:form>
  </div>
</body>

</html>