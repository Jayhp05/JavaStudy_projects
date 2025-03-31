package com.javastudy.ch04.overloading;

public class MemberPrintTest4 {
	public static void main(String[] args) {
		
		MemberTest4 mem1 = new MemberTest4("홍길동", 25);
		MemberTest4 mem2 = new MemberTest4("이순신", 30, "leesunshin", "4321");
		MemberTest4 mem3 = new MemberTest4("유관순", 35, "midas", "1111", "여성", "경기도 부천시 오정구 고강동");
		
		System.out.println("[실행결과]");
		System.out.println(mem1.toString());
		System.out.println(mem2.toString());
		System.out.println(mem3.toString());
	}
}
