<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
  background-color:hsl(240, 100%, 70%);
  float: left;
  width: 20%;
  padding: 10px 15px;
  margin-top: 7px;
}
footer{
bottom: 0%;
min-width: 100%;
position: fixed;
background-color:#f1f1f1;
text-align:center;
padding:10px;
margin-bottom:0px;
font-size:12px;
}
#a
{
color:#e83c3c;
background-color: #8cf442;
border: none;
}
</style>
<SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() { window.history.forward(); }
</SCRIPT>
</head>
<body style="font-family:Verdana;" onload="noBack();" 
	onpageshow="if (event.persisted) noBack();" onunload="">
<s:setDataSource driver="com.mysql.jdbc.Driver" 
				url="jdbc:mysql://localhost:3306/cts"
				user="root" password="root" var="db" /> 

<s:query var="rec" dataSource="${db}">
select max(CustomerId) value from user;
</s:query>
<c:forEach items="${rec.rows}" var="v">
<c:set var="res" value="${v.value}"></c:set>
</c:forEach>

<div style="background-color:hsl(240, 100%, 65%); padding:15px;">
  <h1><font color="white">Internuncio Express</font></h1>
  <h3><font color="white">Eliteness Redefined</font></h3>
</div>

<div style="overflow:auto">
  <div class="menu">
     
    <div class="menuitem"><a href="index.html" target="blank" rel="nofollow">Home</a></div>
    <div class="menuitem"><a href="rules.jsp" target="blank" rel="nofollow">Rules and policies</a></div>
    <div class="menuitem"><a href="ContactUs.html" target="blank" rel="nofollow">Contact Us</a></div>
    <div>
    <br><br>
    <div style="width:30%" "float:right">
    <fieldset>
    <legend> Login User</legend>
    <br>
    <form action="UserLoginBOValidation" method="post">
    <table border="5px">
    <tr><td>User Name</td><td><input type="number" name="customerId" placeholder="user id"/></td></tr>
    <tr><td>Password</td><td><input type="password" name="password" placeholder="password"/></td></tr>
    <tr><td><input id=a type="submit" value="Log in" /></td></tr>
    </table> 
    </form>
    </fieldset>
    </div>
    <br>
     <fieldset>
    <legend> New User</legend>
    <br>
    <form action="UserCreation" method="post">
    <table border="5px">
    <tr><td>First Name</td><td><input type="text" name="firstName" placeholder="first name" required="required"/></td></tr>
    <tr><td>Last Name</td><td><input type="text" name="lastName" placeholder="last name"/></td></tr>
    <tr><td>Gender </td><td><select name="gender" placeholder="Male or Female"/>
              <option value="male">male</option>
              <option value="female">female</option>
    <tr><td>email </td><td><input type="text" name="email" placeholder="email"/></td></tr>
    <tr><td>contact number </td><td><input type="number" name="contactNumber" placeholder="Contact Number" required="required"/></td></tr>
    <tr><td>CustomerId </td><td><input type="number" name="CustomerId" value="<c:out value="${res+1}"/>" readonly="readonly"/></td></tr>
    <tr><td>password </td><td><input type="password" name="password" placeholder="password" required="required"/></td></tr>
    <tr><td><input id=a type="submit" value="Submit" /></td></tr> 
    </table> 
    </form>
    </fieldset>
    </div>
    <div>Kindly note down your customerId</div>
    <div> <img src="./image/myorder.jpg" style="width:100%"></div>
    </div>
    <br>
    
  

  <div class="main">
    <h2>Internuncio</h2>
    <p Style="background-color:hsl(240, 100%, 90%);font-family:verdana;">Internuncio A company, abbreviated as Internun co., is a legal entity made up of an association of people, be they natural, legal, or a mixture of both, for carrying on a commercial or industrial enterprise. Company members share a common purpose, and unite to focus their various talents and organize their collectively available skills or resources to achieve specific, declared goals.</p>
     
     <center>
     <img src="./image/courier.jpg" style="width:100%"  height="100%">
     <br>
     <br>
      <div> <img src="./image/track1.jpg" style="width:100%"></div>
    </center>
  </div>

 <div class="right">
    <h2><font color="white">What?</font></h2>
    <p><font color="white">Domestic Courier Service. International Courier Services. Door To Door Delivery. Local Courier Services. Parcel Delivery Services. International Parcel Service. Cargo Courier Services. Express Parcel Services.</font></p>
    <h2><font color="white">Where?</font></h2>
    <p><font color="white">On the southEast coast of Bay Of Bengal,city of Chennai</font></p>
    <h2><font color="white">Price?</font></h2>
    <p><font color="white">The Walk is free!</font></p>
    </font>
    <div><img src="./image/order.png" style="width:100%"  height="100%"></div>
  </div>
</div>

<footer>
&copy Copyrights reserved &#64 Internuncio Express 2019 
</footer>

</body>
</html>
