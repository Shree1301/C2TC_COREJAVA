package org.tnsif.inheritance;

public class Citizen {
	private long aadharNo;
	private long phoneNo;
	private String address;
	
	public Citizen() {
		System.out.println("dafault constructor");
	}

	public Citizen(long aadharNo, long phoneNo, String address) {
		super();
		this.aadharNo = aadharNo;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
