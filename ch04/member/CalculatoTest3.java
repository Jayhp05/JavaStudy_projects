package com.javastudy.ch04.member;

public class CalculatoTest3 {
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 5;
		int num3 = 100;
		int num4 = 78;
		int num5 = 101;
		int num6 = 23;
		int num7 = 400;
		int num8 = 25;
		
		Calculator cal = new Calculator();
				
		System.out.println("[실행결과]");
		System.out.println(num1 + " + " + num2 + " = " + cal.add(num1, num2));
		System.out.println(num3 + " - " + num4 + " = " + cal.minus(num3, num4));
		System.out.println(num5 + " * " + num6 + " = " + cal.multiply(num5, num6));
		System.out.println(num7 + " / " + num8 + " = " + cal.divide(num7, num8));
	}
}
