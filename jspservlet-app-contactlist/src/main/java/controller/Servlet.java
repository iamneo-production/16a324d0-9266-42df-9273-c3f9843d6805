package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import service.ContactDao;

@WebServlet("/AddContact")
public class Servlet extends HttpServlet {
    
    public  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String name = request.getParameter("cname");
        int number = Integer.parseInt(request.getParameter("cnumber"));
        String image = request.getParameter("cimage");
        Contact contact = new Contact();
        contact.setContactName(name);
        contact.setContactNumber(number);
        contact.setContactImage(image);

        int result = ContactDao.addContact(contact);
        if(result>0){
            response.sendRedirect("/contacts/findAll");
        }
        else{
            PrintWriter out = response.getWriter();
            out.println("not added sucessfully");
        }
    }
}
