package com.javastudy.ch03.forwhile;

public class Test6 {
	public static void main(String[] args) {
		final int n = 3;
		final int n2 = 6;
		int count = 0;
		int sum = 0;
		String nums = "";
		 
		for(int i = 50; i <= 100; i++) {			 
			if(i % n == 0) { 
				if(i % n2 != 0) {
					nums += (100 - n >= i) ?  i + ", " : i;
					
					sum += i;
					count = count + 1; // count++;
				}
			}
		}
		
		System.out.printf("3의 배수이면서 6의 배수가 아닌 수 : %s \n", nums);
		System.out.printf("3의 배수이면서 6의 배수가 아닌 정수의 개수 : %d \n", count);
		System.out.printf("3의 배수이면서 6의 배수가 아닌 정수의 합 : %d", sum);
	}
}