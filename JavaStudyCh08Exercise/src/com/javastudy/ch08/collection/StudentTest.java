package com.javastudy.ch08.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("202001003", "홍길동", 1, "남성");
		Student s2 = new Student("201709103", "어머나", 3, "여성");
		Student s3 = new Student("201903001", "왕빛나", 2, "여성");
		Student s4 = new Student("201905023", "김유신", 2, "남성");
		Student s5 = new Student("202007275", "전해영", 1, "여성");
	
//		ArrayList
		ArrayList<Student> sdList = new ArrayList<Student>(); 
		sdList.add(s1);
		sdList.add(s2);
		sdList.add(s3);
		sdList.add(s4);
		sdList.add(s5);
		
//		ArrayList 출력
		System.out.println("===== ArrayList =====");
		for(int i = 0; i < sdList.size(); i++) {
			System.out.println(sdList.get(i).toString());
		}
		System.out.println();
		
//		HashMap
		System.out.println("===== HashMap =====");
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		for (Student student : sdList) {
            map.put(student.getStudentNo(), student); // 학번을 키로 사용하여 저장
        }

        // HashMap 출력
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key));
        }
	}
}
