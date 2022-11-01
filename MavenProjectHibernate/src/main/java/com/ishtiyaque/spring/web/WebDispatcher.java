package com.ishtiyaque.spring.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer{
   protected Class<?>[] getRootConfigClasses() {
	        return new Class<?>[] { };
	    }
	    protected Class<?>[] getServletConfigClasses() {
	        return new Class<?>[] { WebConfig.class };
	    }
	    protected String[] getServletMappings() {
	        return new String[] { "/*" };
	    }
	}
