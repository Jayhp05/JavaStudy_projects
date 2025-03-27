package com.javastudy.ch03.forwhile;

public class Test5 {
	public static void main(String[] args) {
		
		 final int num = 7;
		 int count = 0;
		 String nums = "";
		 
		 for(int i = 100; i <= 150; i++) {			 
			 if(i % num == 0) {
				 nums += (150 - num >= i) ?  i + ", " : i;
				
				 count = count + 1; // count++;
			 }
		 }
		 System.out.printf("100부터 ~ 150까지 7의 배수 : %s \n", nums);
		 System.out.printf("100부터 ~ 150까지 7의 배수의 개수 : %d", count);
	}
}
