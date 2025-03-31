package com.javastudy.ch05.inheritance;

public class Cat extends Animal {
	
	public Cat(String name, String species, int age, String sound) {

		super(name, species, age, sound);
	 
	 }
	 
//	야옹이는 고양이로 사료를 먹습니다.
//	야옹이는 고양이로 야옹 거립니다.
//	야옹이은(는) 고양이로 3살 입니다.
	 
	@Override
	public void eat() {
		
		System.out.println(getName() + "는 " + getSpecies() + "로 사료를 먹습니다.");
		
		super.eat();
	}
	 
	@Override
	public void cry() {
		
		System.out.println(getName() + "는 " + getSpecies() + "로 " + getSound() + " 거립니다.");
		
		super.cry();
	}
	 
	@Override
	public String toString() {
	 
		return getName() + "은(는) " + getSpecies() + "로 " + getAge() + "살 입니다.";
	}
}
