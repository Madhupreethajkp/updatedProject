<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*,com.example.springmvc.model.Sector" pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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

<center><h1>User Landing Page</h1></center>



<br>

<br>
<br>



<div style="margin:60px;z-index:-1">
<button class="button1" type="submit" ><span><a href="/displayIPO" style="text-decoration:none; color:white">IPOs</a></span></button>
<button class="button1" type="submit" ><span><a href="/compareCompany" style="text-decoration:none; color:white">Compare Company</span></button>
<button class="button1" type="submit" ><span><a href="/compareSector" style="text-decoration:none; color:white">Compare Sectors</span></button>
<button class="button1" type="submit"  ><span><a href="/listSector" style="text-decoration:none; color:white">Other</span></button>
</div>


  <div class="container" style="color:black">
                 
  
  
          
              
                
                                
                          <!-- Modal content-->
                          
                                  <table id="t01">
                                  <center><h3>List of Sector Details</h3></center>
                                 <tr>
    <th>Sector Id</th>
    <th>Sector Name</th> 
    <th>Brief</th>
    <th>Edit</th>
    <th>Delete</th>
  
  </tr>  
               <%
                  List sectorList=(List)request.getAttribute("listSector");
                  System.out.println(sectorList);
              %>
              <%for(int i=0;i<sectorList.size();i++)
              {
	             Sector s = (Sector)sectorList.get(i);
              
	          %>
 
  <tr>
    <td><%= s. getSector_id()%></td>
    <td><%= s. getSector_name()%></td>
    <td><%= s. getBrief()%></td>
   <td><a href="sectorUpdate?sector_id=<%= s.getSector_id() %>" class="btn btn-info btn-lg">Edit</a></td>
    <td><a href="sectorDelete?sector_id=<%= s.getSector_id() %>" class="btn btn-info btn-lg">Delete</a></td>
  </tr>
      <%  } %>
  <tr>
    
</table>
    </div>
    
                                 
              

                    
                  
                      </body>
                      </html>