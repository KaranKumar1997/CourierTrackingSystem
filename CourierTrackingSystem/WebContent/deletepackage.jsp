<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ page import="java.sql.Statement"%>
      <%@ page import ="com.cts.util.Db"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./css/external.css" type = "Text/css"/>
<title>travel right</title>
</head>
<body>


<%
                     int consignmentId=Integer.parseInt(request.getParameter("consignmentId"));

                                  try {
                                  Statement pst= Db.getDb().createStatement();
                                  
                                  pst.executeUpdate("delete from package where consignmentId='"+consignmentId+"'");
                                  response.sendRedirect("packageUpdation.jsp");
                                  }
                                  catch(Exception ex) {
                                  System.err.println(ex);
                                  
                                  }
                    
%>


</body>
</html>
