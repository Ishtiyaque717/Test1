package com.ishtiyaque.spring.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserReposatory {
	private List<User> userlist;
	void createUsers(){
		userlist = new ArrayList<User>();
		userlist.add(new User("ishtiyaque",28));
		userlist.add(new User("ishtiyaque123",48));
		userlist.add(new User("ishtiyaque456",38));
		userlist.add(new User("ishtiyaque789",30));
	}
	
	List<User> getUserList() {
		
		return userlist;
	}
	
	
	
}

class User{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
}