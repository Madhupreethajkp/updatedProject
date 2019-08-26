<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*,com.example.springmvc.model.StockExchange"   pageEncoding="ISO-8859-1"%>
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

<center><h1>Admin Landing Page</h1></center>



<br>

<br>
<br>

<div style="margin:60px;z-index:-1">
<button class="button1" type="submit" ><span><a href="/import" style="text-decoration:none; color:white">Import Data</a></span></button>
<button class="button1" type="submit" ><span><a href="/manageCompany" style="text-decoration:none; color:white">Manage Company</a></span></button>
<button class="button1" type="submit" ><span><a href="manageExchange" style="text-decoration:none; color:white">Manage Exchange</a></span></button>
<button class="button1" type="submit"  ><span><a href="/addIPO" style="text-decoration:none; color:white">Add IPO Details</a></span></button>
</div>

  <div class="container" style="color:black">
                 
  
  
          
              
                
                                
                          <!-- Modal content-->
                          
                                  <table id="t01">
              <tr>                     <center><h3>List of Stock Details</h3></center>
    <th>Stock Exchange Id</th>                            
    <th>Stock Exchange Name</th>
    <th>Contact Address</th> 
    <th>Brief</th>
    <th>Remarks</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>  
               <%
                  List stockList=(List)request.getAttribute("listStock");
                  System.out.println(stockList);
              %>
              <%for(int i=0;i<stockList.size();i++)
              {
	             StockExchange s = (StockExchange)stockList.get(i);
              
	          %>
 
  <tr>
  <td><%= s.getId() %>
    <td><%= s. getStockexchange_name()%></td>
    <td><%= s. getContactAddress()%></td>
    <td><%= s. getBrief()%></td>
    <td><%= s.getRemarks()%></td>
    <td><a href="stockUpdate?id=<%= s.getId() %>" class="btn btn-info btn-lg">Edit</a></td>
    <td><a href="stockDelete?id=<%= s.getId() %>" class="btn btn-info btn-lg">Delete</a></td>
  </tr>
      <%  } %>
  <tr>
    
</table>
    </div>
    
                                 
              

                    
                  
                      </body>
                      </html>