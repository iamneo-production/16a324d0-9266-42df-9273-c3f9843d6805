<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <form class="form-group" action ="updateContact" method="POST">
            <div class="form-control">
            <input type ="text" name= "cid" placeholder="Enter Contact Id" id="enterId" required></input><br>
            </div>
            <div class="form-control">
            <input type ="text" name= "cname" placeholder="Enter Contact Name" id="editContactName" required></input>
            </div>
            <div class="form-control">
            <input type ="text" name= "cnumber" placeholder="Enter Contact Number" id="editContactNumber" required></input>
            </div>
            <div class="form-control">
            <input type ="text" name= "cimage" placeholder="upload" id="addNewImage" required></input><br>
            </div>
            <input type ="submit" value= "Update"  class="btn btn-primary" id="updateContact"></input>
        </form>

    </body>