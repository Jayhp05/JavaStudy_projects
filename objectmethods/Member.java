package com.javastudy.ch07.objectmethods;

public class Member {
	private String name;
	private int age;
	private String gender;
	
	
	
	public Member(String name, int age, String gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	//	name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	gender
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + " - " + gender + ")" ;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Member) {
			 Member m = (Member) obj;
			 return this.name.equals(m.name) && gender.equals(m.gender);
			 }
			 return false;
	}
}
