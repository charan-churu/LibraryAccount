<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
body{
background-color: #d6eee1;
}
h1,h5{
text-align: center;
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
input{
cursor:pointer;
}

table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}
tr:nth-child(odd){
 background-color: #04aa6d ;
}
div{
margin: 15px;
font-size: 20px;
}
input{
width:90px;
   padding:10px;
   margin-top:5px;
   border:none;
   border-radius: 10px;
   background-color: red;
   color:white;
   cursor: pointer;
}
</style>
</head>

<body>
   <h1>Central Library </h1>
   <h5>12th Main, BTM 2nd Stage, MICO Layout, Bangalore, 560076. Landline - 286345</h5>
<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>

<table>
<h2>Books Taken -</h2>
  <tr>
    <th>S.No</th>
<th>Books</th>
<th>Start Date</th>
<th>Return Date</th>
<th>OverDue Fine</th>
  </tr>
  <tr>
    <td>1</td>
    <td>The Perks of being Wallflower</td>
    <td>2nd Feburary 2017</td>
    <td>22nd Feburary 2017</td>
    <td>0</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Two States</td>
    <td>10th March 2017</td>
    <td>-</td>
    <td style="color:red">50</td>
  </tr>
  <tr>
    <td>3</td>
    <td>Harry Potter</td>
    <td>2nd April 2017</td>
    <td>30th April 2017</td>
    <td>0</td>
  </tr>
  <tr>
    <td>4</td>
    <td>Dune Book 1</td>
    <td>5th June 2017</td>
    <td>5th July 2017</td>
    <td >0</td>
  </tr>
  <tr>
    <td>5</td>
    <td>A Song Of Ice And Fire</td>
    <td>4th September 2017</td>
    <td>-</td>
    <td style="color:red">200</td>
  </tr>
  <tr>
  <td colspan="4">Total</td>
  <td style="color:red">250</td>
  </tr>
</table>

    <div>
       To Update the Details - <a href="update.jsp">Click Here </a> 
       <br> <br>
       To Delete the Details - <a href="update.jsp">Click Here </a> 
       <br>
      
    </div>
     
      <%
        if(session.getAttribute("mail")==null)
        {
	         response.sendRedirect("login.jsp");
        }
        response.setHeader("Cache-Control", "no-cache, no-store,must-revalidate");
        response.setHeader("Pragma","no-cache");
        response.setHeader("Expires","0");
     %>
       <form action="Logout" action="post" >
           <input type="submit" value="logout">
       </form>
</body>
</html>