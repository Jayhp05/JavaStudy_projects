package com.javastudy.ch05.inheritance;

public class Dog extends Animal {
	
	public Dog(String name, String species, int age, String sound) {

		super(name, species, age, sound);
	 
	 }
	 
//	희망이는 강아지로 사료를 먹습니다.
//	희망이는 강아지로 멍멍 짖습니다.
//	희망이은(는) 강아지로 5살 입니다.
	 
	@Override
	public void eat() {
		
		System.out.println(getName() + "는 " + getSpecies() + "로 사료를 먹습니다.");
		
		super.eat();
	}
	 
	@Override
	public void cry() {
		
		System.out.println(getName() + "는 " + getSpecies() + "로 " + getSound() + " 짖습니다.");
		
		super.cry();
	}
	 
	@Override
	public String toString() {
	 
		return getName() + "은(는) " + getSpecies() + "로 " + getAge() + "살 입니다.";
	}
}
