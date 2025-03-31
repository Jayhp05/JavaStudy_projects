package com.javastudy.ch05.inheritance;

public class AnimalTest1 {
	
	public static void main(String[] args) {
		Human h = new Human("철수", "사람", 15, "엉엉", "독서");
		Cat c = new Cat("야옹이", "고양이", 3, "야옹");
		Dog d = new Dog("희망이", "강아지", 5, "멍멍");
		
		System.out.println("[실행결과]");
		
		d.eat();
		d.cry();
		System.out.println(d.toString());
		System.out.println();
		
		c.eat();
		c.cry();
		System.out.println(c.toString());
		System.out.println();
		
		h.eat();
		System.out.println(h.toString());
		h.cry();
	}
}
