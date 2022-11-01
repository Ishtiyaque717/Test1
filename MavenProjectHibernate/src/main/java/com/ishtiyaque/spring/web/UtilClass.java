package com.ishtiyaque.spring.web;

import java.util.List;

public class UtilClass {
	public static void main(String[] args) {
		UserReposatory ur= new UserReposatory();
		List<User> ul= ur.getUserList();
		if(ul == null) {
		System.out.println("ul is empty");}
		System.out.println(ul);
		ur.createUsers();
		List<User> ull=		ur.getUserList();
		System.out.println(ull);
	}
}
