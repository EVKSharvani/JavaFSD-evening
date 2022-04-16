<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h3>Product List</h3>

    <p style="color: red;">${errorString}</p>

    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Price</th>
         
       </tr>
       <c:forEach items="${productList}" var="p" >
          <tr>
             <td>${p.getID()}</td>
             <td>${p.getName()}</td>
             <td>${p.getPrice()}</td>
            
            
          </tr>
       </c:forEach>
    </table>
   
</body>
</html>