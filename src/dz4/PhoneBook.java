/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz4;
import com.sun.javafx.css.Combinator;
import dz4.Contact;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;



/**
 *
 * @author Aslan
 */
public class PhoneBook implements Comparator<Contact>
{
   
    public HashMap<Integer, Contact> contacts=new HashMap<Integer, Contact>();
    
    
   public void InitContacts(int count)
   {
       String fullname="Ф.И.О. №";
       Random rnd=new   Random();
       for (int i = 0; i < count; i++)
       {   
           Contact cont=new  Contact(fullname+i,rnd.nextInt());
           int id=cont.GetId();
           for (Contact _cont: this.contacts.values())
           {
               cont.RelatedCont.add(_cont);
           }
           this.contacts.put(id, cont);
           
       }
   }
    
   public void IterateTreeSet()
   {
       long startTime = System.currentTimeMillis();
       TreeSet<Contact> treeSet=new TreeSet<Contact>(this);
       treeSet.addAll(this.contacts.values());       
       for (Contact cont:treeSet)
       {
          String str=cont.FullName;
       }
       long endTime = System.currentTimeMillis();
       System.out.println("TreeSet размер: "+treeSet.size());
       System.out.println("Время создания, заполнения и обработки:"+(endTime-startTime)+" милисекунд");
       System.out.println("#############################################");
   }
    public void IterateArray()
    {
       long startTime = System.currentTimeMillis();       
       Contact[] conts=new Contact[this.contacts.size()];
       int a=0;
       for (Contact cont:this.contacts.values())
        {
            conts[a]=cont;
        }          
       for (Contact cont:conts)
       {
           if (cont!=null)
           {             
                String str=cont.FullName;
           }
       }
       long endTime = System.currentTimeMillis();
       System.out.println("Обычный массив Contact[] размер: "+conts.length);
       System.out.println("Время создания, заполнения и обработки:"+(endTime-startTime)+" милисекунд");
       System.out.println("#############################################");
    }
   
   
   
    @Override
    public int compare(Contact o1, Contact o2)
    {
        if (o1.RelatedCont.size()<o2.RelatedCont.size())return 1;        
        else if (o1.RelatedCont.size()>o2.RelatedCont.size())return-1;       
        else  return 0;
    }
}
