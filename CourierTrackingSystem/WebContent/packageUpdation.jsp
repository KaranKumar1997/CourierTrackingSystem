<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>Internuncio Express</title>
<link rel="shortcut icon" type="image/jpg" href="./image/myorder.jpg"/>
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
 

header
{
bottom: 0%;
min-width: 100%;
position: fixed;
background-color:#0d38e2;
text-align:center;
padding:10px;
margin-bottom:0px;
font-size:12px;
}
</style>
<SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() { window.history.forward(); }
</SCRIPT>
</head>
<center>
<body style="font-family:proxima-nova,Helvetica Neue,Helvetica,Roboto,Arial,sans-serif" onload="noBack();" 
	onpageshow="if (event.persisted) noBack();" onunload="">
<div style="width: 90%" align="left">
<div style="background-color:#3ed315; padding:15px;">
  <h1><font color="white" style="font-family:proxima-nova,Helvetica Neue,Helvetica,Roboto,Arial,sans-serif">Internuncio Express</font></h1>
  <h3><font color="white">Eliteness Redefined</font></h3>
</div>

<div style="overflow:auto">
  <div class="menu">
     
      <div class="menuitem"><a href="index.html" target="blank" rel="nofollow">Home</a></div>
      <div class="menuitem"><a href="packageCreation.jsp" target="blank" rel="nofollow">Package Creation</a></div>
    <div class="menuitem"><a href="rules.jsp" target="blank" rel="nofollow">Rules and policies</a></div>
    <div> <img src="./image/track.png" style="width:100%"></div>
  </div>

  <div class="main">
    <h2>Internuncio</h2>
    <p Style="background-color:hsl(240, 100%, 90%);font-family:verdana;;">Internuncio A company, abbreviated as Internun co., is a legal entity made up of an association of people, be they natural, legal, or a mixture of both, for carrying on a commercial or industrial enterprise. Company members share a common purpose, and unite to focus their various talents and organize their collectively available skills or resources to achieve specific, declared goals.</p>
    <img src="./image/courier.jpg" style="width:100%"  height="100%">
    <br>
    <s:setDataSource driver="com.mysql.jdbc.Driver" 
				url="jdbc:mysql://localhost:3306/cts"
				user="root" password="root" var="db" /> 

<s:query var="rec" dataSource="${db}">
select * from package;
</s:query>
<table border="5px"><tr><th>Consignment id</th><th>accept date</th><th>package Weight</th><th>cost</th><th>receiver address</th>
<th>employee Id</th><th>customer Id</th><th>current location</th><th>package status</th><th>Update</th><th>Delete</th></tr>
<c:forEach items="${rec.rows}" var="v">
<tr><td>${v.consignmentId}</td><td>${v.acceptDate}</td><td>${v.packageWeight}</td><td>${v.cost}</td>
<td>${v.receiverAddress}</td><td>${v.employeeId}</td><td>${v.customerId}</td><td>${v.currentLocation}</td>
<td>${v.packageStatus}</td>
<td><a href="updatepackage.jsp?consignmentId=${v.consignmentId}&acceptDate=${v.acceptDate}&packageWeight=${v.packageWeight}&cost=${v.cost}&receiverAddress=${v.receiverAddress}&employeeId=${v.employeeId}&customerId=${v.customerId}&currentLocation=${v.currentLocation}&packageStatus=${v.packageStatus}">Update</a></td>
<td><a href="deletepackage.jsp?consignmentId=${v.consignmentId}">Delete</a></td>
</tr>
</c:forEach>
</table>
    <br>
    <img src="./image/track1.jpg" style="width:100%"  height="100%">
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
