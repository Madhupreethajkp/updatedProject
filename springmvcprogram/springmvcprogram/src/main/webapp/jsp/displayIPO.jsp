<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.springmvc.model.IPODetail"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Insert title here</title>
  <link rel="stylesheet" type="text/css" href="css/style.css"/>
  <style>
  
    table {
  width:100%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
table#t01 tr:nth-child(even) {
  background-color: #eee;
}
table#t01 tr:nth-child(odd) {
 background-color: #fff;
}
table#t01 th {
  background-color:  #1E90FF;
  color: white;
}
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
 <div style="color:black">
                                  <table id="t01" style="align:center;width:80%">
                                  <h3>List of IPODetails</h3>
  <tr>
  <th>IPO Id</th>
  <th>Company Code</th>
    <th>Stock Exchange Id</th>
    <th>Price per share</th> 
    <th>Total number of shares</th>
    <th>Open Date Time</th>
    <th>Remarks</th>
    <!-- <th>Edit</th> -->
    <th>Delete</th>
  </tr>
  <%
                  List ipoList=(List)request.getAttribute("displayIPO");
                  System.out.println(ipoList);
              %>
              <%for(int i=0;i<ipoList.size();i++)
              {
	             IPODetail s = (IPODetail)ipoList.get(i);
              
	          %>
 
  <tr>
   <td><%= s.getId() %>
    <td><%= s.getCompanyCode() %></td>
    <td><%= s. getStockExchange_id()%></td>
    <td><%= s. getPrice() %></td>
    <td><%= s.getTotalShares() %>
    <td><%= s.getDateTime() %>
    <td><%= s.getRemarks() %>
   <%-- <td><a href="ipoUpdate?id=<%= s.getId() %>" class="btn btn-info btn-lg">Edit</a></td> --%>
     <td><a href="ipoDelete?id=<%= s.getId() %>" class="btn btn-info btn-lg">Delete</a></td>
  </tr>
      <%  } %>
  <tr>
  <tr>
    
</table>
    </div>                              

</center>

</body>
</html>
