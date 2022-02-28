package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ContactDao;

@WebServlet(name = "Delete",
description = "servlet to view co tacts",
urlPatterns = {"/deleteContact"} )
public class Delete extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException{
        int id = Integer.parseInt(request.getParameter("cid"));       
        int res = ContactDao.deleteContact(id);
        if(res>0){
            response.sendRedirect("/contacts/findAll");
        }
        else{
            PrintWriter out = response.getWriter();
             out.println("Check contact id you have entered");
        }
    }    
}
