<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
<h1> Generate Bill</h1>
<pre>
<form action="saveBill" method="post">
FirstName <input type="text" name="firstName"  value="${contact.firstName }"/>
LastName <input type="text" name="lastName"  value="${contact.lastName }"/>
Email <input type="email" name="email" value="${contact.email }"/>
Mobile <input type="number" name="mobile" value="${contact.mobile }" />
Product <input type="text" name="product"/>
Amount<input type="text" name="amount"/>

<input type="submit" value="GenerateBill"/>
</form>
</pre>

</body>
</html>