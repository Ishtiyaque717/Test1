package com.ServletToHibernate;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Naukar3 extends HttpServlet {
	String v1;
	String value2;
	String v3; 
	String value4;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		v1 = req.getParameter("key1");
		value2 = req.getParameter("key2");
		v3 = req.getParameter("key3");
		value4 = req.getParameter("key4");

		value1=Integer.parseInt(v1);  
		value3=Integer.parseInt(v3);
		Naukar2 n2= new Naukar2();
		n2.m1(this);
	}
	int value1;  
	int value3;


	
	
	
	
}
