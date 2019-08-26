<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*,com.example.springmvc.model.Company"   pageEncoding="ISO-8859-1"%>
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
  <!-- <div class="container" style="color:black">
                 
   <center><div class="panel-heading" style="color:black"><h3>Company Details</h3></div></center>
   -->
       <center><h3>Company Details</h3></center>
                                 <tr>
    <th>Company Code</th>
    <th>Company Name</th> 
    <th>Turnover</th>
    <th>CEO</th>
    <th>Board Of Directors</th>
    <th>Sector Id</th>
    <th>BriefWriteUp</th>
    <th>EDIT</th>
    <th>Delete</th>
  </tr>  
              <%
                  List companyList=(List)request.getAttribute("updateCompany");
                  System.out.println(companyList);
              %>
              <%
              for(int i=0;i<companyList.size();i++)
              {
	             Company e = (Company)companyList.get(i);
              
	          %>
	           <tr>
    <td><%= e. getCompany_code()%></td>
    <td><%= e. getCompanyName()%></td>
    <td><%= e. getTurnOver()%></td>
    <td><%= e. getCEO()%></td>
     <td><%= e. getBoardOfDirectors()%></td>
      <td><%= e. getSectorId()%></td>
       <td><%= e. getBriefWriteup()%></td>
     
       
<td><a href="companyUpdate?id=<%= e.getCompany_code() %>" class="btn btn-info btn-lg">Edit</a></td>
<td><a href="companyDelete?id=<%= e.getCompany_code() %>" class="btn btn-info brn-lg">Delete</a>      
  </tr>
      <%  } %>
  <tr>
    
</table>
    </div>
                <%-- <div class="panel panel-info">
                       
                        <div class="panel-body" style="color:black">
                        <div class="row">
                            <div  class="col-md-2">

                            </div>
  <div  class="col-md-2" style="color:black">
                            <p><%= e. getCompany_code()%></p> 
                            </div>
                            <div  class="col-md-2" style="color:black">
                            <p><%= e. getCompanyName()%></p> 
                            </div>

                            <div  class="col-md-2" style="color:black">
                            <p><%= e. getCEO() %></p>  
                            </div>

                            <div  class="col-md-2" style="color:black">
                            <P><%= e.getBriefWriteup() %></P>   
                            </div>

                            
                            <div  class="col-md-2">
                            <a href="" type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" >EDIT</a>
                            </div>

                        </div>
                        </div>
                      </div>

                      <%  } %> --%>
                          <%-- <div class="modal fade" id="myModal" role="dialog">
                                <div class="modal-dialog">
                                
                                  <!-- Modal content-->
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h2 class="modal-title">Edit Company Details</h2>
                                    </div>
                                    <div class="modal-body">
                                            <form:form method="post" action="/editCompany" modelAttribute="e2">
                                                <label for="cname">Company Name</label>
                                                <input type="text" id="companyName" name="companyname" placeholder="Company Name">
                                            
                                                <label for="lname">Turnover</label>
                                                <input type="text" id="turnover" name="turnover" placeholder="turnover">
                <label for="ceo">CEO</label>
                                                <input type="text" id="ceo" name="ceo" placeholder="CEO">
                                                <label for="boardOfDirectors">Board Of Directors</label>
                                                <input type="text" id="boardOfDirectors" name="boardOfDirectors" placeholder="Board of Directors">
                                            
                                                <label for="briefwriteup">Brief WriteUp</label>
                                                <textarea id="brief" name="briefwriteup" placeholder="Brief WriteUp" style="height:200px"></textarea>
                                             
                                            <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal" style="float:left">Close</button>
        
                                              <a href="/editCompany"><input type="submit" value="Update"  style="font-size:12px"></a>  
                                                </div>
                                              </form:form>
                                    </div>
                    
                                  </div> --%>
                                  
         
                          
 
</body>

</html>