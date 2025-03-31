package com.javastudy.ch05.inheritance;

public class Animal {
	private String name;
	private String species;
	private int age;
	private String sound;
	
	public Animal (String name, String species, int age, String sound) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.sound = sound;
	}
	
//	name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	species
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
//	age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	sound 소리
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void eat() {
		return ;
	}
	
	public void cry() {
		return ;
	}
	
	@Override
	public String toString() {
		return "부모 클래스";
	}
	
}
