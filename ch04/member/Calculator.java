package com.javastudy.ch04.member;

public class Calculator {

//	1. Calculator 클래스는 두 수를 입력 받아 각각 덧셈, 뺄셈, 나눗셈, 곱셈을 수행한 후 
//	  그 결과를 리턴 하는 4개의 메소드를 가지고 있다. 
//	2. Calculator 클래스 사용하는 CalculatorTest 클래스를 만들어 main() 메서드에서 4칙 연산의 
//	    결과를 출력하는 프로그램을 작성하시오.
	
	public int result;
		
	public int add(int num1, int num2) {
		result = num1 + num2;
		return result;
	}
	
	public int minus(int num3, int num4) {
		result = num3 - num4;
		return result;
	}
	
	public int multiply(int num5, int num6) {
		result = num5 * num6;
		return result;
	}
	
	public int divide(int num7, int num8) {
		result = num7 / num8;
		return result;
	}
	
}
