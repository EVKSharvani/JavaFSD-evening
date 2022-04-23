
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2 {text-align: center;}
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;
margin: auto; width: 50%;
padding:10px;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

input[type=submit] {
  background-color:black;;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}
</style>
</head>
<body>
<h2>Update Data Form</h2>
<div class="login">    
    <form action="change"  method="post">
        
        <input type="hidden" name="Id"  value="${User.getID()}">    
          
        <label><b>First Name</b></label>    
        <input type="text" name="fname1"  placeholder="Firstname" Required>    
        <br><br> 
        <label><b>Last Name</b></label>    
        <input type="text" name="lname1"  placeholder="Lastname" Required>    
        <br><br>
        <label><b>Email ID</b></label>    
        <input type="text" name="email1"  placeholder="Email ID" Required>    
        <br><br>     
        <label><b>Password</b></label>    
        <input type="Password" name="pwd1"  placeholder="Password" Required>    
        <br><br> 
        <label><b>Phone Number</b></label>    
        <input type="text" name="phno1"  placeholder="Phone Number" Required>    
        <br><br>    
          
       
        <input type="submit" value="Update">    
    </form>  
       
</div>   
</body>
</html>