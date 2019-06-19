<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Internuncio Express</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* {
  box-sizing: border-box;
}
.menu {
  float: left;
  width: 20%;
}
.menuitem {
  padding: 8px;
  margin-top: 7px;
  border-bottom: 1px solid #f1f1f1;
}
.main {
  float: left;
  width: 60%;
  padding: 0 20px;
  overflow: hidden;
}
.right {
  background-color:#0d38e2;
  float: left;
  width: 20%;
  padding: 10px 15px;
  margin-top: 7px;
}
footer
{
bottom:0%;
position:fixed;
min-width:90%;
font-size:15px;
font-family:'assistant';
color:#333;
text-align:center;
background-color : #0d38e2;
padding : 5px 0;
} 
#customers {
  font-family: "Assistant";
  font-size: 20px;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align:justify;
  background-color: #4CAF50;
  color: white;
}
</style>

</head>
<center>
<body style="font-family:Verdana;">
<div style="width: 90%" align="left">
<div style="background-color:#3ed315; padding:15px;">
  <h1><font color="white">Internuncio Express</font></h1>
  <h3><font color="white">Eliteness Redefined</font></h3>
</div>

<div style="overflow:auto">
  <div class="menu">
     
    <div class="menuitem"><a href="Logout" target="blank" rel="nofollow">Logout</a></div>
    <div class="menuitem"><a href="rules.jsp" target="blank" rel="nofollow">Rules and Policies</a></div>
    <div class="menuitem"><a href="ContactUs.html" target="blank" rel="nofollow">Contact Us</a></div>
    <div> <img src="./image/track.png" style="width:100%"></div>
  </div>

  <div class="main">
    <h2>Internuncio</h2>
    <p Style="background-color:hsl(240, 100%, 90%);font-family:verdana;;">Internuncio A company, abbreviated as Internun co., is a legal entity made up of an association of people, be they natural, legal, or a mixture of both, for carrying on a commercial or industrial enterprise. Company members share a common purpose, and unite to focus their various talents and organize their collectively available skills or resources to achieve specific, declared goals.</p>
    <img src="./image/courier.jpg" style="width:100%"  height="100%">
    <br>
    <br>
    <% HttpSession s=request.getSession(false);%>
<h2><center> welcome <%=s.getAttribute("ref") %></center></h2>


<table border="5px" id="customers"><tr><th>Consignment id</th><th>accept date</th><th>package Weight</th><th>cost</th><th>receiver address</th><th>customer Id</th><th>current location</th><th>package status</th></tr>
<c:forEach items="${al}" var="v">
<tr><td>${v.getCosignmentId()}</td><td>${v.getAcceptDate()}</td><td>${v.getPackageWeight()}</td><td>${v.getCost()}</td><td>${v.getReceiverAddress()}</td><td>${v.getCustomerId()}</td><td>${v.getCurrentLocation()}</td><td>${v.getPackageStatus()}</td></tr>
</c:forEach>
</table>
  </div>

 <div class="right">
    <h2><font color="white">What?</font></h2>
    <p><font color="white">Domestic Courier Service. International Courier Services. Door To Door Delivery. Local Courier Services. Parcel Delivery Services. International Parcel Service. Cargo Courier Services. Express Parcel Services.</font></p>
    <h2><font color="white">Where?</font></h2>
    <p><font color="white">On the southEast coast of Bay Of Bengal,city of Chennai</font></p>
    <h2><font color="white">Price?</font></h2>
    <p><font color="white">The Walk is free!</font></p>
   <img src="./image/track2.png" style="width:100%"  height="100%">
  </div>
 
</div>

<footer>
<font color="white">
&copy Copyrights reserved &#64 Internuncio Express 2019 
</font>
</footer>
</center>
</div>
</body>
</html>
