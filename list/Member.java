package com.javastudy.ch08.list;

// 회원 한 명의 정보를 저장하는 클래스
public class Member implements Comparable<Member> {
	
	private String id;
	private String name;
	private int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

//	@Override
//	public int compareTo(Object o) {
//		// 정렬 기준? => 나이, 이름
//		return 0;
//	} => 제네릭 타입인 Member를 추가했기 때문에 Object가 아닌 Member의 compareTo 메서드를 생성해야 정상 작동 가능.

	@Override
	public int compareTo(Member o) {
		// 정렬 기준? => 나이, 이름
		// 나이 (x < y) ? -1 : ((x == y) ? 0 : 1);		
		return this.age < o.age ? -1 : ((this.age == o.age) ? 0 : 1);
	}
	
	public String toString() {
		return name + "(" + age + ")";
	}
}
