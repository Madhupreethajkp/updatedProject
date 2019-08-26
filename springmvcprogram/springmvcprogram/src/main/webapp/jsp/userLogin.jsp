<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="css/style.css"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
body{
background-color:#C0D8F4;
}
</style>
<body>

<div class="container">
<br>
<br>
<center>
 <h1>Login</h1>
 </center>
 <br/>
 <br/>
 <form action="/Login">
 <b>User Name</b>
	<br>
    <input type="text" placeholder="Enter User Name or Admin Name" name="userName" class="field" required>
    <br>
    <b>Password</b>
    <input type="password" placeholder="Enter Password" name="password" class="field" required>
	
<center><a href="/Login"><button class="button1" type="submit" ><span>Login</span></button></a></center>
</form>
 </div>
 </body>
 </html>