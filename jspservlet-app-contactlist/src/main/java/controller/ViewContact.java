package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import service.ContactDao;

@WebServlet(name = "ViewContact",
description = "servlet to view contacts",
urlPatterns = {"/findAll"} )
public class ViewContact  extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            List<Contact> contacts = ContactDao.findAll();
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("viewContact.jsp");
            request.setAttribute("contacts", contacts);
            dispatcher.forward(request, response);
         }
}
