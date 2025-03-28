package com.javastudy.ch04.classdefinition;

public class ProductTest2 {
	
	private String pd; // product 상품
	private int price; // 가격
	private String mf; // manufacture 제조사
	private String etc; // 기타 등등. 설명관련된 속성
	
	public ProductTest2(String pd, int price, String mf, String etc) {
		// TODO Auto-generated constructor stub
		this.pd = pd;
		this.price = price;
		this.mf = mf;
		this.etc = etc;
	}
	
	public String getPd() {
		return pd;
	}
	public void setPd(String pd) {
		this.pd = pd;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getMf() {
		return mf;
	}
	public void setMf(String mf) {
		this.mf = mf;
	}
	
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}

	@Override
	public String toString() {
		return pd + "(" + price + "), " +  "제조사 : " + mf + ", " + "상품설명 : " + etc;
	}

//	아메리카노 1+1(2990), 제조사 : 스타벅스, 상품설명 : 스타벅스 오리지날 아메리카노 커피 1+1
//	뉴그랜저(32500000), 제조사 : 현대자동차, 상품설명 : 3000cc 동급 최강 승용차
//	데스크탑5(799000), 제조사 : 삼성전자, 상품설명 : CUP 6코어 i5 10400F 4.3GH
	
}
