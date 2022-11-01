package com.ServletToHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Naukar2 {

	static void m1(Naukar3 obj3) {
		
		
		try {
		Naukar saveobj= new Naukar(obj3.value1,obj3.value2,obj3.value3,obj3.value4);
		System.out.println("trying to save object "+ saveobj);

		Configuration conf = new Configuration();
		conf.configure("Naukar.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();

		s.save(saveobj);
		
		
		
		
		s.getTransaction().commit();

		s.close();
		sf.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
