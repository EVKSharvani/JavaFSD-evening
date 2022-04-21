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

tr{
height:30px;}

input[type=button]{
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
<h2>Booking Details</h2>
<form action="" method="post">
<table  style=" width:100%; border:1px solid black;margin-left:auto;margin-right:auto;" >
       
       <tr> 
          <th style="width:40%">                                          </th>
          <th style="width:30%">                                          </th>
          <th style="width:30%">                                          </th>
       </tr><tr>
          <td> <b>Flight Number:</b></td>
          <td style="text-align:center">${p.getFno()}</td>
          <td>                            </td>
       </tr>
       <tr>
          <td> <b>Airline:</b></td>
           <td style="text-align:center">${p.getAirline()}</td>
          <td>                            </td>
           </tr>
            <tr>
          <td> <b>Travel Class:</b></td>
           <td style="text-align:center">Economy</td>
           <td>                            </td>
           </tr>
           <tr>
          <td> <b>Source:</b></td>
           <td style="text-align:center">${p.getSrc()}</td>
           <td>                            </td>
           </tr>
       <tr>
          <td> <b>Destination:</b></td>
           <td style="text-align:center">${p.getDes()}</td>
           <td>                            </td>
           </tr>
       <tr>
          <td> <b>Travel Date:</b></td>
           <td style="text-align:center">2022-04-18(Monday)</td>
           <td>                            </td>
           </tr>
       
       <tr>
         <td> <b>No of Passengers:</b></td>
          <td style="text-align:center">1</td>
         <td>                            </td>
       </tr>
       <tr>
         <td> <b>Total Amount to be paid:</b></td>
          <td style="text-align:center">3000*1=3000</td>
      <td>                            </td>
       </tr>
       
        <tr>
         <td> <b>Passenger Details:</b></td>
         <td> <b>Customer id:</b></td>
         <td style="text-align:center"> 1 </td>
       </tr> 
       <tr>
         <td>                          </td>
         <td> <b>Customer Name:</b></td>
         <td style="text-align:center"> Sharvani </td>
       </tr>
        <tr>
         <td>                          </td>
         <td> <b>Email Address:</b></td>
         <td style="text-align:center"> sharvani123@gmail.com </td>
       </tr>
        <tr>
         <td>                          </td>
         <td> <b>Phone Number:</b></td>
         <td style="text-align:center"> 870678809 </td>
       </tr> 
    </table>
 <input type="button" onclick="window.location.href='payment.html'"value="Confirm Booking">
 </form>
</body>
</html>