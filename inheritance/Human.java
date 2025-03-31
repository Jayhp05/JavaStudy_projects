package com.javastudy.ch05.inheritance;

public class Human extends Animal {
	
	private String hobby;
	
	
	public Human(String name, String species, int age, String sound, String hobby) {

		super(name, species, age, sound);
	 
		this.hobby = hobby;
	 
	 }
	
//	hobby
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	 
//	 철수는 사람으로 아침을 먹습니다.
//	 철수는 사람으로 15살 이며 취미는 독서입니다.
//	 철수는 사람로 엉엉 웁니다.
	 
	@Override
	public void eat() {
		
		System.out.println(getName() + "는 " + getSpecies() + "으로 아침을 먹습니다.");
		
		super.eat();
	}
	 
	@Override
	public void cry() {
		
		System.out.println(getName() + "는 " + getSpecies() + "으로 " + getSound() + " 웁니다.");
		
		super.cry();
	}
	 
	@Override
	public String toString() {
	 
		return getName() + "는 " + getSpecies() + "으로 " + getAge() + "살 이며 취미는 " + hobby + "입니다.";
	}
}
