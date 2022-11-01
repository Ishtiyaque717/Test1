package com.hibernet;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QueryTest {
	
	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s= sf.openSession();
		s.beginTransaction();
		Query q= s.createQuery("INSERT INTO Employee(id,e_name,email,a) values (:ids,:name,:email,:a)");
		q.setParameter("ids", 12);
		q.setParameter("name", "izhan");
		q.setParameter("email", "izhanueansri");
		q.setParameter("a", 1);
		Query a= s.createQuery("update INTO Employee(e_name,email,a) values (?1,?2,?3)");
		a.setParameter( 1, "ishaque123");
		a.setParameter(2, "ishaqueansri123");
		a.setParameter(3, 123);
		
		
		int m=a.executeUpdate();
		
	//	System.out.println(l+" "+m);
		s.getTransaction().commit();
	}

}
