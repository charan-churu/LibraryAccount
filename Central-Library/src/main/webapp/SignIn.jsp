<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
<style type="text/css">
    body{
background-color: #04aa6d;
}
h1{
   text-align: center;
}
    form {
    width:30%;
    padding:15px;
    margin-top: 45px;
    margin-left:35%;
	border: "1px solid black";
	border-radius:10px;
	background-color: #d9eee1;
}
input{
border:none;
width:90%;
padding:10px;
border-radius: 10px;
margin: 5px;

}
button{
   width:90px;
   padding:10px;
   margin:10px;
   border:none;
   border-radius: 10px;
   background-color: #04aa6d;
   color:white;
   cursor: pointer;
}
a{
color:black;
float: right;
padding: 20px
}
div{
width:50%;
font-size:30px;
text-align: center;
margin-top: 20px;
margin-left:25%;
color: red;
}
</style>
</head>
<body>
<h1>Fill the details to register</h1>
<div>${message}</div>
<form action="SignIn">
       FullName: <br>
       <input type="text" name="nm" placeholder="Enter name"> <br>
       Date Of Birth: <br>
       <input type="text" name="DOB" placeholder="Enter date of birth"> <br>
       Mobile Number: <br>
       <input type="text" name="num" placeholder="Enter mobile number"> <br>
       Email: <br>
       <input type="text" name="mail" placeholder="Enter mail id"> <br>
       Create Password: <br>
       <input type="password" name='pwd' placeholder="Enter a strong password"> <br>
       Address: <br>
       <input type="text" name="add" placeholder="Enter Address">
       <br>
       <button>Submit</button> 
       <a href="login.jsp">&lt--back</a>     
</form>


</body>
</html>