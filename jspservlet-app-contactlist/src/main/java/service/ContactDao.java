package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Contact;
import utility.ConnectionManager;

public class ContactDao {

     
    public static int addContact(Contact contact){
        int res=0;
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into contact values(?,?,?,?)");){
         
         ps.setInt(1,contact.contactId);
         ps.setInt(2,contact.contactNumber);
         ps.setString(3,contact.contactName);
         ps.setString(4,contact.contactImage);
         res =ps.executeUpdate();
        
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return res;
    }

    public static List<Contact> findAll()  
    {
        List<Contact> contacts=new ArrayList<Contact>();
        //int res=0;
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM contact");){
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                Contact contact = new Contact();
                contact.setContactId(rs.getInt("contactId"));
                contact.setContactName(rs.getString("contactName"));
                contact.setContactNumber(rs.getInt("contactNumber"));
                contact.setContactImage(rs.getString("contactImage"));
                contacts.add(contact);
                }
            
        }catch(Exception e){
                e.printStackTrace();
        }
      return contacts;  
    }

  

    public static int updateContact(Contact contact){

        int res=0;
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("update contact set contactName=?,contactNumber=?,contactImage=? where contactId =?");){
        
         ps.setString(1,contact.getContactName());
         ps.setInt(2,contact.getContactNumber());
         ps.setString(3,contact.getContactImage());
         ps.setInt(4,contact.getContactId());
         res =ps.executeUpdate();
        
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return res;

    }

    public static int deleteContact(int id){
            int res=0;
        try(Connection connection = ConnectionManager.getConnection();
              PreparedStatement ps = connection.prepareStatement("delete from contact where contactId=?");){
        
          ps.setInt(1,id);
         res =ps.executeUpdate();
        
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return res;
    }
    public static Contact viewContactById (int id){
        Contact contact = new Contact();
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from contact where contactId=?");)
        {        
         ps.setInt(1,id);
         ResultSet rs =ps.executeQuery();
            while(rs.next()){
            contact.setContactId(rs.getInt("contactId"));
            contact.setContactName(rs.getString("contactName"));
            contact.setContactNumber(rs.getInt("contactNumber"));
            contact.setContactImage(rs.getString("contactImage")); 
            }  
            return contact;              
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return contact;   
    }
}
