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

input[type=submit],input[type=button] {
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
<h2>Search and Update</h2>
<div class="login">    
    <form action="loguser"  method="post">    
        <label><b>User ID</b></label>    
        <input type="text" name="User"  placeholder="Enter User ID to be searched">    
        <br><br>    
       
      
        <input type="submit" value="Search">    
    </form>  
       
</div>   
</body>
</html>