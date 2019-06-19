<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
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
</head>
<body style="font-family:Verdana;">

<div style="background-color:hsl(240, 100%, 65%); padding:15px;">
  <h1><font color="white">Internuncio Express</font></h1>
  <h3><font color="white">Eliteness Redefined</font></h3>
</div>

<div style="overflow:auto">
  <div class="menu">
     
    <div class="menuitem"><a href="index.html" target="blank" rel="nofollow">Home</a></div>
    <div class="menuitem"><a href="staff.html" target="blank" rel="nofollow">Staff Login</a></div>
    <div class="menuitem"><a href="staff.html" target="blank" rel="nofollow">Administrator Login</a></div>
    <div class="menuitem"><a href="ContactUs.html" target="blank" rel="nofollow">Contact Us</a></div>
  </div>

  <div class="main">
    <h2>Internuncio</h2>
    <p Style="background-color:hsl(240, 100%, 90%);font-family:verdana;;">Internuncio A company, abbreviated as Internun co., is a legal entity made up of an association of people, be they natural, legal, or a mixture of both, for carrying on a commercial or industrial enterprise. Company members share a common purpose, and unite to focus their various talents and organize their collectively available skills or resources to achieve specific, declared goals.</p>

    <center>
    <form action="StaffRegistrationModule" method="post">
    <table border="5px">
    <tr><td>First Name</td><td><input type="text" name="firstName" placeholder="first name" required="required"/></td></tr>
    <tr><td>Last Name</td><td><input type="text" name="lastName" placeholder="last name"/></td></tr>
    <tr><td>Gender </td><td><input type="text" name="gender" placeholder="gender" required="required"/></td></tr>
    <tr><td>email </td><td><input type="text" name="email" placeholder="email"/></td></tr>
    <tr><td>contact number </td><td><input type="number" name="contactNumber" placeholder="Contact Number" required="required"/></td></tr>
   <%-- <tr><td>employeeId </td><td><input type="number" name="employeeId" placeholder="Employee Id"/></td></tr> --%>
    <tr><td>password </td><td><input type="password" name="password" placeholder="password" required="required"/></td></tr>
    <tr><td>salary</td><td> <input type="number" name="salary" placeholder="salary" required="required"/></td></tr>
    <tr><td>Designation </td><td><input type="text" name="designation" placeholder="designation" required="required"/></td></tr>
    <tr><td>permanent address </td><td><input type="text" name="permanentAddress" placeholder="permanent address"/></td></tr>
    <tr><td>correpondance address </td><td><input type="text" name="correpondanceAddress" placeholder="correpondance address" required="required"/></td></tr>
    <tr><td>login type </td><td><input type="text" name="loginType" placeholder="Enter A-admin S-staff" required="required"/></td></tr>
    <tr><td><input id=a type="submit" value="Submit" /></td></tr> 
    </table> 
    </form>
    </center>
   
  </div>

 <div class="right">
    <h2><font color="white">What?</font></h2>
    <p><font color="white">Domestic Courier Service. International Courier Services. Door To Door Delivery. Local Courier Services. Parcel Delivery Services. International Parcel Service. Cargo Courier Services. Express Parcel Services.</font></p>
    <h2><font color="white">Where?</font></h2>
    <p><font color="white">On the southEast coast of Bay Of Bengal,city of Chennai</font></p>
    <h2><font color="white">Price?</font></h2>
    <p><font color="white">The Walk is free!</font></p>
   
  </div>
</div>

<footer>
&copy Copyrights reserved &#64 Internuncio Express 2019 
</footer>

</body>
</html>
