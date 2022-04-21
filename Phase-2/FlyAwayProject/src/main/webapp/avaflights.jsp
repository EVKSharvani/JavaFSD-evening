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


th {
  background-color: #f1f1f1;
}

input[type=submit]{
  background-color:black;;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  
}
</style>
<body>

 <h2>Available Flights</h2>

    
    <table border="1" cellpadding="5" cellspacing="1" style="border:1px solid black;margin-left:auto;margin-right:auto;border-collapse: collapse;" >
       <tr>
          <th>Flight Number</th>
          <th>Airline</th>
          <th>Travel Date</th>
          <th>Source</th>
          <th>Destination</th>
          <th>           </th>
         
       </tr>
       
          <tr>
             <td style="text-align:center">${p.getFno()}</td>
             <td style="text-align:center">${p.getAirline()}</td>
             <td style="text-align:center">2022-04-18(Monday)</td>
             <td style="text-align:center">${p.getSrc()}</td>
             <td style="text-align:center">${p.getDes()}</td>
             <td style="text-align:center"><form action="detail"  method="post"><input type="hidden" name="flight" value="${p.getFno()}" /><input type="submit"  value="Book Tickets"></form></td>
            
            
          </tr>
      
    </table>

</body>
</html>