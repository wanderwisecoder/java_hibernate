package com.hibernate;


import java.util.List;

import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        Session session = factory.openSession();
        
        
        	//Following code is to data into the sql table
//        StudentClass st1 = new StudentClass("Ichigo", "Tokyo, Japan", "Soul Socity University","ichigo@soul.com");
//        StudentClass st2 = new StudentClass("Rukoya", "Kyoto Japan", "Soul Socity University", "rukoya@soul.com");
//        
//        Transaction tx = session.beginTransaction();
//        
//        session.save(st1);
//        session.save(st2);
//        
//        tx.commit();
//        System.out.println("Student Register Successfully");
        
        
        //Following code is to fetch data from DB and read it
//        List<StudentClass> list = session.createQuery("from StudentClass",StudentClass.class).list();
//
//        for (StudentClass e: list)
//        {
//        	System.out.println(e);
//        }
        //  System.out.println("Student Data Fetched Successfully");
        
        
        //to get data from DB with the help of id 
//        StudentClass st = session.get(StudentClass.class, 1);
//        System.out.println(st);
        //  System.out.println("Student Data Fetched Successfully with the help of id");
        
        //to update the data
//        StudentClass st = session.get(StudentClass.class, 1);
//        
//        st.setName("Ichogo_Kurosaki ");
//        st.setAddress("London UK England");
//        
//        Transaction tx = session.beginTransaction();
//        
//        session.saveOrUpdate(st);
//        
//        tx.commit();
        //  System.out.println("Data Updated Successfully");
        
        //to delete the data from DB
        StudentClass st = session.get(StudentClass.class, 2);
        
        Transaction tx = session.beginTransaction();
        
        session.delete(st);
        
        tx.commit();
        
        System.out.println("Data Deleted Successfully");
        
        
     session.close();
     factory.close();
        }
}







