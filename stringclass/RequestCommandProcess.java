package com.javastudy.ch07.stringclass;

public class RequestCommandProcess {
	
	public static void main(String[] args) {
		
		int index;
		int index2;
		int index3;
		
		String fileName;
		String fileName2;
		String fileName3;
		String val;
		
		int i;
		
		String[] urls = {
				 "http://www.localhost:8080/WebApp/joinProcess",
				 "http://www.localhost:8080/WebApp/orderProcess",
				 "http://www.localhost:8080/WebApp/writeMemo"
		};
		
//		urls 배열에 저장된 URL 정보 하나를 매개변수로 받아서 요청 명령을 추출
		
		String urls1 = urls[0];
		String urls2 = urls[1];
		String urls3 = urls[2];
		
		index = urls1.lastIndexOf("p");
		fileName = urls1.substring(index + 1);
		
		index2 = urls2.lastIndexOf("p");
		fileName2 = urls2.substring(index2 + 1);
		
		index3 = urls3.lastIndexOf("p");
		fileName3 = urls3.substring(index3 + 1);
		
		System.out.println("입력 값 : " + urls1);
		System.out.println("결과 값 : " + fileName);
		System.out.println();
		
		System.out.println("입력 값 : " + urls2);
		System.out.println("결과 값 : " + fileName2);
		System.out.println();
		
		System.out.println("입력 값 : " + urls3);
		System.out.println("결과 값 : " + fileName3);
		System.out.println();
		
//		조건문 활용한 요청 명령 출력
		for (i = 0; i < urls.length; i++) {
            val = getCommand(urls[i]);
            
            if (val.equals("/joinProcess")) {
                System.out.println("요청 명령 : " + val + " – 회원 가입 완료");
            } 
            else if (val.equals("/orderProcess")) {
                System.out.println("요청 명령 : " + val + " – 상품 주문 완료");
            } 
            else if (val.equals("/writeMemo")) {
                System.out.println("요청 명령 : " + val + " – 메모 작성 완료");
            } 
            else {
                System.out.println("요청 명령 : " + val + " – 요청이 존재하지 않습니다.");
            }
        }
	
	}

//	urls 배열에 저장된 URL 정보 하나를 매개변수로 받아서 요청 명령을 추출해 다음과 같이 반
//	환하는 getCommand() 메서드를 정의해 사용
	public static String getCommand(String val) {
		int get_index;
		
		get_index = val.lastIndexOf("/");
        return val.substring(get_index);
	}
}
