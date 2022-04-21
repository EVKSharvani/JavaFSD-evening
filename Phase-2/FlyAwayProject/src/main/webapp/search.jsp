<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
h2 {text-align: center;}
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;
margin: auto; width: 50%;
padding:10px;
}

input[type=text], input[type=date] {
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
select {
 
  flex: 1;
  padding: 0 1em;
  
  cursor: pointer;
}

select::-ms-expand {
  display: none;
}

.select {
  position: relative;
  display: flex;
  width: 40em;
  height: 2em;
  border-radius: .25em;
  overflow: hidden;
  padding:10px;
}
.check{
padding:10px;}


.select:hover::after {
  opacity: 0.8;
}
</style>
<body>
<h1>Welcome ${User.getFname()} !</h1>
<h2>Journey Details</h2>
<div class="login"> 
    <form action="search"  method="post">    
   <input type="hidden" name="user" value="${User.getID()}" />
        <label><b>From</b></label>    <br>
        <div class="select">
        <select name="from">
 <option value="">Select</option>
  <option value="hyd">HYDERABAD|IN</option>
  <option value="lucknow">LUCKNOW|IN</option>
  <option value="mumbai">MUMBAI|IN</option>
  <option value="kolkata">KOLKATA|IN</option>
</select>  </div>
         <label><b>To</b></label>  <br> 
        <div class="select"> 
         <select name="to">
 <option value="">Select</option>
  <option value="hyd">HYDERABAD|IN</option>
  <option value="lucknow">LUCKNOW|IN</option>
  <option value="mumbai">MUMBAI|IN</option>
  <option value="kolkata">KOLKATA|IN</option>
</select>  </div>
        <br><br>     
           
       <label><b>Travel Date</b></label>    
        <input type="date" name="tdate"  placeholder="dd-mm-yyyy">    
        <br><br> 
        <label><b>No Of Travellers</b></label>    
        <input type="text" name="tnum"  placeholder="Enter No of Travellers">    
        <br><br> 
       
        <input type="submit"  value="Search Flights">    
    </form>  
    </div>
</body>
</html>