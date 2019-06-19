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
    <div class="menuitem"><a href="package.jsp" target="blank" rel="nofollow">Package</a></div>
    <div class="menuitem"><a href="rules.jsp" target="blank" rel="nofollow">Rules and policies</a></div>
    <div class="menuitem"><a href="Logout" target="blank" rel="nofollow">logout</a></div>
  </div>

  <div class="main">
    <h2>Internuncio</h2>
   <% HttpSession s=request.getSession(false);%>
<h2><center> welcome <%=s.getAttribute("ref") %></center></h2>
    <p Style="background-color:hsl(240, 100%, 90%);font-family:verdana;;">Internuncio A company, abbreviated as Internun co., is a legal entity made up of an association of people, be they natural, legal, or a mixture of both, for carrying on a commercial or industrial enterprise. Company members share a common purpose, and unite to focus their various talents and organize their collectively available skills or resources to achieve specific, declared goals.</p>

    <center>
    
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
  </div>
</div>

<footer>
&copy Copyrights reserved &#64 Internuncio Express 2019 
</footer>

</body>
</html>
