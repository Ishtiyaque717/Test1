package com.hibernet;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernet1 {
public static void main(String[] args) throws IOException {
		Teacher t1 = new Teacher();
		
		t1.name="moiz sir";
		t1.mob_no= "123456789";
		t1.email="moiz123@gmail.com";
		t1.Address="mumtaz colony";
		t1.designation="assistant teacher";
		Teacher t2= new Teacher();
		t2.id=2;
		t2.name="basit sir";
		t2.mob_no= "234567891";
		t2.email="basit23@gmail.com";
		t2.Address="shah inayat mohalla";
		t2.designation="headmaster";
		
		Teacher t3= new Teacher();
		t3.id=3;
		t3.name="shehnaz baji";
		t3.mob_no= "34567891";
		t3.email="shehnazbaji3@gmail.com";
		t3.Address="shahganj mohalla";
		t3.designation="Ladyteacher";
		Teacher t4= new Teacher();
		t4.id=4;
		t4.name="raheel";
		t4.mob_no= "4567891";
		t4.email="rahil3@gmail.com";
		t4.Address="dargah road";
		t4.designation="peon";
		
		Configuration configObj = new Configuration();
         configObj.configure("hibernate.cfg.xml");
         SessionFactory sf= configObj.buildSessionFactory();
         Session s= sf.openSession();
         s.beginTransaction();
         s.save(t1);
         s.save(t2);
         s.save(t3);
         s.save(t4);
        
         
         s.getTransaction().commit();
         
         s.close();
         sf.close();

	}
	

}
