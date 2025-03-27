package com.javastudy.ch03.forwhile;

public class Test4 {
	public static void main(String[] args) {
		
		int i = 0;
		int even_count = 0;
		int odd_count = 0;
		
		
		for(i = 33; i <= 235; i++) {
			if(i % 2 == 0) {
				even_count += 1;
			}
			else {
				odd_count += 1;
			}
		}
		
		System.out.printf("33부터 ~ 235까지 홀수의 개수 : %d\n", odd_count);
		System.out.printf("33부터 ~ 235까지 짝수의 개수 : %d", even_count);
	}
}
