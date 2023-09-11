package com.ty;

public class Person {
	
	
	private String name;
	private int age;
	private long phno;
	private String email;
	
	public Person(String name, int age, long phno, String email) {
		super();
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public long getPhno() {
		return phno;
	}
	
	public String getEmail() {
		return email;
	}

}
