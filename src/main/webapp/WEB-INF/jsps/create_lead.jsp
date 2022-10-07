<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
<h1> Create Lead</h1>
<pre>
<form action="saveLead" method="post">
FirstName <input type="text" name="firstName" />
LastName <input type="text" name="lastName" />
Email <input type="email" name="email" />
Mobile <input type="number" name="mobile" />
Source:
	<select name="source" >
	  <option value="news paper">News Paper</option>
	  <option value="tv commercial">TV Commercial</option>
	  <option value="online">Online</option>
	  <option value="seminar">Seminar</option>
	</select>
<input type="submit" value="Save"/>
</form>
</pre>

</body>
</html>