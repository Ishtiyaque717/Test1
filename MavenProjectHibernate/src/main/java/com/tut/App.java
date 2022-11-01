package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employee e= new Employee();
    	e.setEmail("aqueansari001@gmail.com");
    	e.setId(16);
    	e.setE_name("izhan");
    	e.a=786;
    	
    	
    	
    	//step 1
    	 Configuration configObj = new Configuration();
         configObj.configure("hibernate.cfg.xml");         
         //Step 2
         SessionFactory sf= configObj.buildSessionFactory();
         Session s= sf.openSession();
         s.beginTransaction();
         s.saveOrUpdate(e);
         s.getTransaction().commit();
         
         s.close();
         sf.close();
         
    	
        
    }
}
