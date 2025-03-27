package com.javastudy.ch03.forwhile;

public class Test7 {
	public static void main(String[] args) {
		
		int i = 0;
		String nums = "";
		
		for(i = 1; i <= 60; i++) {
			if(i % 10 == 0) {
                nums += i + "\n";
            }
            else {
                nums += (120 - i >= i) ?  i + ", " : i;
            }
			
		}
		
		System.out.println("[실행결과]");
		System.out.printf(nums);
	}
}
