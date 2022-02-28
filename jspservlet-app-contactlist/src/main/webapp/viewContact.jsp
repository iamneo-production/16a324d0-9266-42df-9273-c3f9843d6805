<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@
        page import ="java.util.* , model.*"
    %>
<!DOCTYPE html>
<html>
	<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

		<meta charset="ISO-8859-1">
		<title>title</title>
		<link href="./assets/css/display.css" rel="stylesheet" type="text/css">
    <script>
      function onSubmit() {
            alert("Contact Deleted");
            window.location.reload();
          }
    </script>
	</head>
	<body>
    <h1 class="text-center">CONTACT LIST APPLICATION</h1>
    <div class="input-group">
      <div class="form-outline">
        <form action ="findContact" method="POST">
          <input type ="text" name= "cid" placeholder="Enter Contact Id" required></input>
          <input type ="submit" value= "Search"></input>  
          </form>
      </div>
    </div>
    <form method="POST" action="addContact.jsp" >  
      <div class="text-right">
        <button type="submit" id="addButton">Add Contact</button>  
      </div>     
    </form>
        <%
            List<Contact> contacts = (List<Contact>)request.getAttribute("contacts");         
        %>
        <% for(Contact c : contacts) {%>
          <div class="card" id=grid<%=c.getContactId() %>>
            <div class="card-body">
              <img class="img-thumbnail" src="./assets/<%=c.getContactImage()%>" alt="Card image">
              <h4 class="card-title">Name:<%=c.getContactName() %></h4>
              <p class="card-text">Number:<%=c.getContactNumber() %></p>
              <div class="row">
                <div class="col-md-6">
                  <form method="POST" action="update.jsp" >  
                    <div class="text-left">
                      <button type="submit" id="editContact<%=c.getContactId()%>">Edit</button>  
                    </div>  
                  </form>
                </div>
                <div class="col-md-6 text-left">            
              <form action ="deleteContact" method="POST">
                  <input type="hidden" name="cid" value="<%=c.getContactId()%>"/>
                      <button type ="submit" value ="Del" id="deleteContact<%=c.getContactId()%>" OnClick="onSubmit()">Delete</button>
                  </form>
                </div>
            </div>
              
            </div>
          </div>
          <%
        }
        %>
        
	</body>
</html>