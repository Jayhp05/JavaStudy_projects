package com.javastudy.ch08.collection;

public class Student {
	private String studentNo;
	private String name;
	private int grade;
	private String gender;
	
	public Student(String studentNo, String name, int grade, String gender) {
		// TODO Auto-generated constructor stub
		this.studentNo = studentNo;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		
	} 
	
//	학번
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
//	이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	학년
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
//	성별
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return name + "(" + studentNo + " - " + grade + "학년 " + gender + ")";
	}
	
	
}
