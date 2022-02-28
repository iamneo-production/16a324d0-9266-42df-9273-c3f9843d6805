<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Document</title>
		<link href="./assets/css/contact.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<jsp:forward page="/findAll">
     <jsp:param name="firstName" value="Enter First Nam" />
      <jsp:param name="lastName" value="Enter Last Name" />
     </jsp:forward>

	</body>
</html>