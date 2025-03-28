package com.javastudy.ch04.classdefinition;

public class StudentInfoPrintTest1 {
	public static void main(String[] args) {
		StudentTest1 sd1 = new StudentTest1();
		StudentTest1 sd2 = new StudentTest1();
		StudentTest1 sd3 = new StudentTest1();
		
		sd1.name = "강바람";
		sd1.age = 20;
		sd1.gender = "남성";
		sd1.address = "인천시 부평구 부개동";
		
		sd2.name = "오빛나";
		sd2.age = 21;
		sd2.gender = "여성";
		sd2.address = "서울시 영등포구 당산동";
		
		sd3.name = "어머나";
		sd3.age = 25;
		sd3.gender = "여성";
		sd3.address = "부산시 해운대구 반여동";
		
		System.out.println("[실행결과]");
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 주소 : %s\n", sd1.name, sd1.age, sd1.gender, sd1.address);
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 주소 : %s\n", sd2.name, sd2.age, sd2.gender, sd2.address);
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 주소 : %s\n", sd3.name, sd3.age, sd3.gender, sd3.address);
	}
}
