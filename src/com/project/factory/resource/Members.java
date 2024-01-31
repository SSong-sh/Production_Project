package com.project.factory.resource;

public class Members {
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String phoneNum;
	private String address;
	private int level;
	private String dept;
	private String email;

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public String getBirth() {
		return birth;
	}

	public String getEmail() {
		return email;
	}
	
	/**
	 * 
	 * @param 사원번호
	 * @param 비밀번호
	 * @param 이름
	 * @param 생년월일
	 * @param 휴대폰번호
	 * @param 주소
	 * @param 권한
	 * @param 부서
	 * @param 이메일
	 */
	public Members(String id, String pw, String name, String birth, String phoneNum, String address, int level, String dept, String email ) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.phoneNum = phoneNum;
		this.address = address;
		this.level = level;
		this.dept = dept;
		this.email = email;
	
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}