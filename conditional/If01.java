package com.javastudy.ch03.conditional;

// if 문과 나머지 연산자를 이용한 배수와 홀, 짝수 인지 판단하기
public class If01 {
	
	public static void main(String[] args) {
		
		int x = 21;
		int y = 7;
		int score = 79;
		
		System.out.println("배수 구하기");
		if(x % y == 0) {
//			조건이 참일 때, 실행
			System.out.printf("%d는 %d의 배수 입니다.", x, y);
		}
		
		System.out.println();
		System.out.println("홀/짝수 구하기");
		if(x % 2 == 0) {
			System.out.printf("%d은(는) 짝수 입니다.", x);
		}
		else {
			System.out.printf("%d는 홀수 입니다.", x);
		}
		
		System.out.println();
		if(score >= 80) {
			System.out.println("축하합니다. 합격~");
		}
		else {
			System.out.println( score + "점 입니다...");
			System.out.println("아쉽네요. 다음 기회에....");
		}
	}
}
