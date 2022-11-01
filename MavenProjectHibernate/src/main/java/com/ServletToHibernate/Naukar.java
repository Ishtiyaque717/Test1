package com.ServletToHibernate;

public class Naukar {
	int id;
	String name;
	int age;
	String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Naukar(int id, String name, int age, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	
	@Override
	public String toString() {
		return "Naukar [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getMobile()=" + getMobile()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

	
}
