<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Events</title>
</head>
<body>
<h1>Events</h1>
	<table border="2" width="70%" cellpadding="2">  
	<tr><th>Event Name</th><th>Conducted By</th><th>Number Of Users Registered</th><th>Register</th></tr>  
	   <c:forEach var="e" items="${event}">   
		   <tr>  
		   <td>${e.eventName}</td>  
		   <td>${e.conductedBy}</td>  
		   <td>${e.numberOfUsersRegistered}</td>  
		   <td><a href="registerForEvent/${e.id}">Register</a></td>  
		   </tr>  
	   </c:forEach>  
   </table>  
   <br/>  
</body>
</html>