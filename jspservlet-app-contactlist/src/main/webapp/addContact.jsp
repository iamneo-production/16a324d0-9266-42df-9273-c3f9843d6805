<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script>
            function onAdd() {
                  alert("Contact Added Sucessfully");
                  window.location.reload();
                }
          </script>
    </head>
    <body>
        <form class="form-group" action ="AddContact" method="POST" style="align-content: center;">
            <div class="form-control">
                <input type ="text" name= "cname" placeholder="Enter Contact Name" id="enterContactName" required></input>
            </div>
            
            <div class="form-control">
                <input type ="text" name= "cnumber" placeholder="Enter Contact Number" id="enterContactNumber" required></input>
            </div>
            
            <div class="form-control">
                <input type ="text" name= "cimage" placeholder="Enter Image Name" id="uploadImage" required></input><br>
            </div>
            
            <input type ="submit" value= "Add" class="btn btn-primary" id="addContact" onclick="onAdd()"></input>
        </form>

    </body>