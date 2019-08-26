<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<button class="button1" type="submit"  ><span><a href="/addIPO" style="text-decoration:none; color:white">Add IPO Details</a></span></button>
</div>





<div id="import" style="margin:60px">



 <table class="table-style" style="color:black">
                         <!--  <form>
                              <tr>
                                  <td class="spacing"> Select excel file to be uploaded:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="file"></td><br>
                                  
                                  <td class="spacing"><input type="file" value="Upload" name="myFile"></td>
                                  

                              </tr> -->
                              <form th:action="@{/import}" method="post" enctype="multipart/form-data"><tr>
 <td class="spacing"><input th:type="submit" value="Import" /></td>
     <td class="spacing"><input type="file" th:name="file"></td>

</tr>
                              <br>
                              <tr>
                                  <td class="spacing"><a href="sample.html">Click here to download the sample excel file here</a></td>
                              </tr>
                          </form>
                      </table>


</div>




</body>

</html>