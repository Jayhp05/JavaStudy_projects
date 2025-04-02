package com.javastudy.ch07.objectclass;

class Member {
	String id;
	String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
//		우리가 원하는 것 - 아이디, 이름이 같으면 - true
//		return (this == obj);

//		this Member 인스턴스 = obj Member 인스턴스인지
		if(obj instanceof Member) {
//			this.id == obj.id;
			Member m = (Member) obj;
			return this.id.equals(m.id) && this.name.equals(m.name); 
		}
//		"현재 인스턴스에 id와 이름이" == "넘어온 인스턴스의 id와 이름 "
//		return this.id == obj.id;
		return false;
	} 
	
}

public class ObjectMethods03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p1 = new Person("홍길동");
//		Person p2 = new Person("홍길동");
		Member p1 = new Member("midas", "홍길동");
		Member p2 = new Member("midas", "홍길동");
		
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 회원");
		}
		else {
			System.out.println("p1과 p2는 다른 회원");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 회원");
		}
		else {
			System.out.println("p1과 p2는 다른 회원");
		}

	}

}
