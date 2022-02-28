<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@
        page import ="java.util.* , model.*"
    %>
<!DOCTYPE html>
<html>
	<head>
  <style>
     
    </style>
		<meta charset="ISO-8859-1">
		<title>Find Contacts</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="./assets/css/display.css" rel="stylesheet" type="text/css">
	</head>
	<body>
       
          <%
            Contact contact = (Contact)request.getAttribute("contact");         
        %>
        <div  class="col-xs-1 center-block text-center">
        <h1>Contact Details:</h1>
        <div class="card" style="width:400px">
          <img class="img-thumbnail"  src="./assets/<%=contact.getContactImage()%>" alt="Card image" style="width:100%">
          <div class="card-body">
            <h4 class="card-title">Name:<%=contact.getContactName() %></h4>
            <p class="card-text">Number:<%=contact.getContactId() %></p>
            <p class="card-text">Number:<%=contact.getContactNumber() %></p>    
          </div>
        </div>
      </div>
	</body>
</html>