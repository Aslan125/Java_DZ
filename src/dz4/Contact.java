/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Aslan
 */
public class Contact
{
   int Id;
   String FullName;
   int PhoneNumber;
   List<Contact> RelatedCont;
   
   public boolean AddRelateCont(Contact contact)
   {
       boolean add =false;
       add=this.RelatedCont.add(contact);
       return add;
   }
   
   public int GetId()
   {
       return this.Id;
   }
   
   public String GetFullName()
   {
       return this.FullName;
   }
   
   public int GetPhoneNumber()
   {
       return this.PhoneNumber;
   }
   
   
   public Contact(String fullName, int phone)
   {
       
       this.Id=this.hashCode();
       this.RelatedCont = new ArrayList<>();
       this.FullName=fullName;
       this.PhoneNumber=phone;
   }
   
   @Override
   public String toString()
   {
       String str="";
       str+="ID="+this.Id+"\n";
       str+="Name="+this.FullName+"\n";
       str+="Phone="+this.PhoneNumber;       
       return str;
   }
   

   @Override
   public boolean equals(Object obj)
   {
       Contact _cont=(Contact) obj;       
       if (obj==null || !(getClass()==obj.getClass()))return false;
       return (obj==this||_cont.Id==this.Id);
   }
}
