package com.javastudy.ch07.objectmethods;

public class MemberUserExam {
	public static void main(String[] args) {
		
		Member m1 = new Member("홍길동", 25, "남성");
		Member m2 = new Member("홍길동", 25, "남성");
		
//		toString()메서드 출력
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println();
		
//		인스턴스의 클래스명@16진수 해시코드 출력		
		System.out.println("m1을 이용한 정보출력하기 : \n" + m1.getClass().getName() + "@" + Integer.toHexString(m1.hashCode()));
		System.out.println();
		
//		해시코드 비교
		if(m1.equals(m2)) {
			 /* Object hashCode() 메소드는 인스턴스의 주소 값을 이용해 
			* 해시코드를 생성하므로 인스턴스마다 고유한 정수 값을 반환한다.
			 * 즉 서로 다른 인스턴스라면 해시코드 값은 다르게 반환된다.
			 **/
			 System.out.println("m1과 m2의 해시코드 비교 : " + m1.hashCode() + " - " + m2.hashCode());
			 System.out.println(m1.toString() + " : " + m2.toString() + "은 같은 사람입니다.");
			 } else {
				 System.out.println("m1과 m2의 해시코드 비교 : " + m1.hashCode() + " - " + m2.hashCode());
			 System.out.println(m1.toString() + " : " + m2.toString() + "은 다른 사람입니다.");
			 }
	}
}
