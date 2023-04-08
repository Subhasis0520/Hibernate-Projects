package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Start Project" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        
        Student s1 = new Student(1,"Lokesh","Kolkata");
        
         Address add1 = new Address();
         add1.setCity("Kolkata");
         add1.setStreet("street1");
         add1.setOpen(true);
         add1.setAddedDate(new Date());
         add1.setX(12.343);
         
         // insert image 
			FileInputStream file1 = new FileInputStream("src/main/java/Virat.jpg");
             byte[] data = new byte[file1.available()];
             file1.read(data);
             add1.setImage(data);
     
        
       Session session = factory.openSession();
       
       Transaction t = session.beginTransaction();
       session.save(s1);
       session.save(add1);
       t.commit();
       
       
       
       
       session.close();
       factory.close();
       
       System.out.println("Table creation complete");
    }
}
