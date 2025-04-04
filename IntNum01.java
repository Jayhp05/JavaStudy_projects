package com.javastudy.ch02.datatype;

// 정수형 데이터 사용하기 1
public class IntNum01 {

	/* 정수 자료형은 음수, 0, 양수를 나타내는 수치 자료형으로 자바에서는 byte, short, 
	 * int, long형 등의 4가지 자료형을 제공하고 있다. 각각의 자료형은 메모리에 저장되는
	 * 크기가 다르며 부호가 있는 정수를 다루기 때문에 표현할 수 있는 수의 범위가 다르다
	 * 컴퓨터 내부에서 수를 표현할 때는 2진수 0과 1로 표현되며 부호가 있는 수를 2진 
	 * 비트로 표현하기 위해서 맨 앞의 첫 번째 비트를 부호 비트로 사용하며 이 부호 비트가
	 * 0이면 양수를 나타내고 1이면 음수를 나타낸다. 
	 * 자바의 4가지 정수 자료형이 표현할 수 있는 수의 범위는 아래와 같다.
	 * 
	 * byte	: 1Byte(-2의 7승 ~ 2의 7승 - 1)
	 * short	: 2Byte(-2의 15승 ~ 2의 15승 - 1)
	 * int		: 4Byte(-2의 31승 ~ 2의 31승 - 1)
	 * long	: 8Byte(-2의 63승 ~ 2의 63승 - 1)
	 * */
	public static void main(String[] args) {		
		
		// int형 변수를 먼저 선언하고 각 변수에 정수 값을 할당하고 있다.
		int a, b;
		a = 300;
		b = 200;
		
		// 변수에 저장된 값을 연산자를 이용해 계산하여 콘솔로 출력하고 있다.		
		System.out.println("a + b = " + (a + b));		
		System.out.println("a * b = " + (a * b));
		
//		16bit
		System.out.println(0b11111111);
		
	}
}