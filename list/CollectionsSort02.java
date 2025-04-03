package com.javastudy.ch08.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort02 {
	public static void main(String[] args) {
		// 3명의 회원 정보를 저장하기 위해 3개의 Member 클래스의 인스턴스를 생성
		Member m1 = new Member("midas1", "이순신", 25);
		Member m2 = new Member("komans", "홍길동", 39);
		Member m3 = new Member("eclipse", "어머나", 33);
		

		// 여러 명의 회원을 저장하기 위해 제네릭 타입을 Member로 지정해 ArrayList 생성
		ArrayList<Member> mList = new ArrayList<Member>(); 		
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		
//		comparable - compareTo() 메소드 활용해야 Member 타입의 list를  
		System.out.println("sort 전 : " + mList);
		Collections.sort(mList); // 상속을 주는 부모 클래스에 implements Comparable을 추가 수정해야 사용 가능
		
		System.out.println("sort 후 : " + mList);

		
	}
}
