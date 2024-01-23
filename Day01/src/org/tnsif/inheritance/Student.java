package org.tnsif.inheritance;

public class Student extends Citizen {
	private int rollNo;
	private String course;
	
	public Student() {
		super();
		
	}

	public Student(long aadharNo, long phoneNo, String address,int rollNo, String course) {
		super(aadharNo,phoneNo,address);
		this.rollNo = rollNo;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [AadharNo=" + getAadharNo() + ", PhoneNo=" + getPhoneNo() + ", Address=" + getAddress()
				+ ", rollNo=" + rollNo + ", Course=" + course + "]";
	}
	
	
	//void m1() {}
	


}
