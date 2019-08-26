<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
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
<button class="button1" type="button" ><span><a href="/displayIPO"  style="text-decoration:none; color:white">IPOs</a></span></button>
<button class="button1" type="submit" ><span><a href="/compareCompany" style="text-decoration:none; color:white">Compare Company</span></button>
<button class="button1" type="submit" ><span><a href="/compareSector" style="text-decoration:none; color:white">Compare Sectors</span></button>
<button class="button1" type="submit"  ><span><a href="/listSector" style="text-decoration:none; color:white">Other</span></button>
</div>
 

</body>
</html>
