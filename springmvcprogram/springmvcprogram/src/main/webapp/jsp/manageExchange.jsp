<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  import="java.util.*,com.example.springmvc.model.StockExchange"    pageEncoding="ISO-8859-1"%>
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



<div style="margin-left:900px;margin-bottom:600px">
 <a href="" type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" style="width:200px;height:40px" >Add Stock Details</a>
 <a href="/listStock" type="button" class="btn btn-info"  style="width:200px;height:40px" >List Stock Details</a>
 

</div>
        
 <div class="modal fade" id="myModal" role="dialog">
                                <div class="modal-dialog">
                                
                                  <!-- Modal content-->
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    <form:form action="/addStock" modelAttribute="s1" >
    <center><h3>Create New Stock Exchange</h3></center>
    <p></p>
    <hr>

    <b>Stock Exchange Name </b>
	<br>
    <input type="text" placeholder="" name="stockexchange_name" class="field" required>
    <br>
    <b>Contact Address </b>
    <input type="text" placeholder="" name="contactAddress" class="field" required>
	
<br>
    <b>Brief</b>
    <input type="textarea" placeholder="" name="brief" class="field" required>
	<br>
    <b>Remarks</b>
    <input type="text" placeholder="" name="remarks" class="field" required>
	<br>
 
    <center><a href="/addStock"><button type="submit" class="registerbtn1">Save</button></a></center>
	</form:form> 
	
  </div>
  
 
	
                                    </div>
                    
                                  </div>
                                  </div>
                                  
    

</body>

</html>