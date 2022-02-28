package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import service.ContactDao;

@WebServlet(name = "Update",
description = "servlet to view co tacts",
urlPatterns = {"/updateContact"} )
public class Update extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException{
            int id = Integer.parseInt(request.getParameter("cid"));
            String name = request.getParameter("cname");
            int number = Integer.parseInt(request.getParameter("cnumber"));
            String image = request.getParameter("cimage");
            Contact contact = new Contact();
            contact.setContactId(id);
            contact.setContactName(name);
            contact.setContactNumber(number);
            contact.setContactImage(image);

            int res = ContactDao.updateContact(contact);
            if(res>0){
                response.sendRedirect("/contacts/findAll");
            }
            else{
                PrintWriter out = response.getWriter();
                 out.println("Check contact id you have entered");
            }
    }    
}
