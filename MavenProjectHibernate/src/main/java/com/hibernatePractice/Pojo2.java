package com.hibernatePractice;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Pojo2 {
	static SessionFactory sf;
	public static void main(String[] args) {
		Configuration co= new Configuration();
		co.configure();
		sf= co.buildSessionFactory();
		
		Pojo2 obj1= new Pojo2();
		//Address address1= new obj1.addAddress("mominpura","parbhani","MH","431401");
	}
	
	
	
}
