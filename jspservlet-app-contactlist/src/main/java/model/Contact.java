package model;

public class Contact {

   public int contactId;
   public String contactName;
   public int contactNumber;
   public String contactImage;

   public int getContactId() {
    return this.contactId;
}

public void setContactId(int contactId) {
    this.contactId = contactId;
}

public String getContactName() {
    return this.contactName;
}

public void setContactName(String contactName) {
    this.contactName = contactName;
}

public int getContactNumber() {
    return this.contactNumber;
}

public void setContactNumber(int contactNumber) {
    this.contactNumber = contactNumber;
}

public String getContactImage() {
    return this.contactImage;
}

public void setContactImage(String contactImage) {
    this.contactImage = contactImage; 
}
   
}
