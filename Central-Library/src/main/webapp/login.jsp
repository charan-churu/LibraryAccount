<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Central-Library</title>
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
   margin-top:5px;
   margin-left:35%;
   border:none;
   border-radius: 10px;
   background-color: #4aaa6d;
   color:white;
   cursor: pointer;
}
</style>
</head>
<body>
   <h1>Central-Library Log-In Form</h1>
   <form action="login">
       Email: <br>
       <input type="text" name="mail" placeholder="Enter mail"> <br>
       Password: <br>
       <input type="password" name='pwd' placeholder="Enter Password"> <br>
       <br>
       <button>Submit</button> <br>
       New User - <a href="SignIn.jsp">Sign In</a> <br>
       
   </form>
</body>
</html>