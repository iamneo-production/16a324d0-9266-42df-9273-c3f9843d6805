package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import service.ContactDao;

@WebServlet(name = "Find",
description = "servlet to view co tacts",
urlPatterns = {"/findContact"} )
public class Find extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException{
        int id = Integer.parseInt(request.getParameter("cid"));
        Contact contact = ContactDao.viewContactById(id);  
        if(contact!=null){  
        RequestDispatcher dispatcher = request.getRequestDispatcher("find.jsp");
        request.setAttribute("contact", contact);
        dispatcher.forward(request, response);
        }
        else{
            PrintWriter out = response.getWriter();
            out.println("Check the id you have entered");
        }
     }    
}
