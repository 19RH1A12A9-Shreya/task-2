package com.motivity2;
public class student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String studentFatherName;
	public int getStudentId() {
		return studentId;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentFatherName = "+ studentFatherName"]";
		
	}
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentFatherName() {
		return studentFatherName;
	}


	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	 public int getStudent_id() {
		return studentId;
	}
	public void setStudent_id(int student_id) {
		this.studentId = student_id;
	}
	public String getStudent_name() {
		return studentName;
	}
	public void setStudent_name(String student_name) {
		this.studentName = student_name;
	}
	public String getStudent_address() {
		return studentAddress;
	}
	public void setStudent_address(String student_address) {
		this.studentAddress = student_address;
	}

}
