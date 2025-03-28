package com.javastudy.ch04.classdefinition;


public class Time {	
	// 시간을 하나의 데이터 타입으로 다루기 위해 시, 분, 초 3개의 필드를 정의
	int hour;
	int minute;
	int second;
	
	public Time() {
		
	}
	
//	public Time(parameter) {}
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
//	함수 => 메소드(method)
	String 현재시간은() {
		return hour + "시 " + minute + "분 " + second + "초";
	}
}
