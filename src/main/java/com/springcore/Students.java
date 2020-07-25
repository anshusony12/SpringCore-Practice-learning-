package com.springcore;

public class Students {
	private String studentName;
	private String studentId;
	private String studentAddress;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Students(String studentName, String studentId, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAddress = studentAddress;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Students [studentName=" + studentName + ", studentId=" + studentId + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
}
