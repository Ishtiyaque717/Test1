package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingTest {
public static void main(String[] args) {
	
	Person p= new Person();
	p.email= "izhan12355";
	p.name="izhan123456";
	
	
	Passport ps= new Passport();
	ps.address="momin";
	ps.name="ishtiyq";
	ps.p=p;
	
	Configuration conf= new Configuration().configure();
	SessionFactory sf=conf.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx= s.beginTransaction();
	
	//s.save(p);
	 s.save(ps);
	
	tx.commit();
	s.close();
	sf.close();
	
}
	
}
