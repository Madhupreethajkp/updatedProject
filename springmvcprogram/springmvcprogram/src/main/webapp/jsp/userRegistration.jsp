<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"  %>
    <%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<title>Insert title here</title>
</head><style>

body{
background-color:#C0D8F4;
}
</style>
<body>


<%-- 
<form:form modelAttribute="user" action="/addUser" method="post">
  <div class="container" >
    <center><h1>User Registration</h1></center>
    <p></p>
    <hr>
     <b>User Name </b>
	<br>
    <input type="text" placeholder="Enter User Name" name="userName" class="field" required>
    <br>
   
    <b>Password</b>
    <input type="password" placeholder="Enter Password" name="password" class="field" required>
	
<br>
    <b>Email</b>
    <input type="email" placeholder="Enter Email Id" name="email" class="field" required>
	<br>
    <b>Mobile Number</b>
    <input type="text" placeholder="Enter mobile number" name="mobile" class="field" required>
	<br>
    
    <center><button type="submit" class="registerbtn1">Register</button></center>
	
  </div> 
  </form:form>  --%>
   <div class="form">
    <center><h1>Registration</h1></center>
    <p></p>
<form:form method="POST" action="/addUser" modelAttribute="user">
 <div class="container" >
 
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="userName">User Name</label>
               <div class="col-md-7">
                    <form:input type="text" path="userName" placeholder="User name" class="field"/>
                    <div class="has-error">
                        <form:errors path="userName" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="password">Password</label>
               <div class="col-md-7">
                    <form:input type="password" path="password" id="password"  placeholder="Password" class="field"/>
                    <div class="has-error">
                        <form:errors path="password" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
          <div class="row">
        <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="userType">User Type</label>
               <div class="col-md-7">
               
                 <div class="col-md-7">
                    <form:input type="userType" path="userType" id="userType" placeholder="Type Admin or User" class="field"/>
                    <div class="has-error">
                        <form:errors path="userType" class="text-danger"/>
        </div>
        </div>
        </div>
        </div>
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="e_mail">Email</label>
               <div class="col-md-7">
                    <form:input type="text" path="e_mail" id="e_mail"  placeholder="Email" class="field"/>
                    <div class="has-error">
                        <form:errors path="e_mail" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
 
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="mobileNumber">Mobile Number</label>
               <div class="col-md-7">
                    <form:input type="text" path="mobileNumber" id="mobileNumber"  placeholder="Mobile Number" class="field"/>
                    <div class="has-error">
                        <form:errors path="mobileNumber" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
       
         

 <center>   <input type="submit" value="Register" class="registerbtn1" style="background-color: #1E90FF;" /></center>
   </div>
 <!-- <div class="container signin"> -->
 <center>
    <p>Already have an account? <a href="/userLogin">Sign in</a>.</p></center>
  </div>

</form:form>
  
 
</div>
</body>
</html>
