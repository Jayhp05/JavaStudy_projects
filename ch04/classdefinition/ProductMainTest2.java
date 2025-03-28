package com.javastudy.ch04.classdefinition;

public class ProductMainTest2 {
	public static void main(String[] args) {

//		아메리카노 1+1(2990), 제조사 : 스타벅스, 상품설명 : 스타벅스 오리지날 아메리카노 커피 1+1
//		뉴그랜저(32500000), 제조사 : 현대자동차, 상품설명 : 3000cc 동급 최강 승용차
//		데스크탑5(799000), 제조사 : 삼성전자, 상품설명 : CUP 6코어 i5 10400F 4.3GH
		
		ProductTest2 pd1 = new ProductTest2("아메리카노 1+1", 2990, "스타벅스", "스타벅스 오리지날 아메리카노 커피 1+1");
		ProductTest2 pd2 = new ProductTest2("뉴그랜저", 32500000, "현대자동차", "3000cc 동급 최강 승용차");
		ProductTest2 pd3 = new ProductTest2("데스크랍5", 799000, "삼성전자", "CPU 6코어 i5 10400F 4.3GH");
		
		System.out.println("[실행결과]");
		System.out.println("### 상품 리스트 ###");
		System.out.println();
		
		System.out.println(pd1.toString());
		System.out.println(pd2.toString());
		System.out.println(pd3.toString());
	}
}
