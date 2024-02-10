package com.project.factory.resource.user;

/** 근태 등록 정보를 객체로 만드는 클래스이다.
 * 
 */
public class Commute{
	//출근 인원 목록(관리자 기능)
	private String cal;
	private String id;
	private String name;
	private String dept;
	private String level;
	private String currentTime;
	private String commute;

	
	public String getCal() {
		return cal;
	}
	public void setCal(String cal) {
		this.cal = cal;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	
	public String getCommute() {
		return commute;
	}
	public void setCommute(String commute) {
		this.commute = commute;
	}

	
	/** 근태등록을 한 멤버 정보 생성자
	 * @param cal = 출근 날짜
	 * @param id = 사원번호
	 * @param name = 이름
	 * @param dept = 부서
	 * @param level = 권한
	 * @param currentTime = 출근시간 
	 * @param commute = 출/퇴근 
	 */
	
	
	public Commute(String cal ,String id, String name, String dept, String level, String currentTime, String commute) {
		this.cal = cal;
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.level = level;
		this.currentTime = currentTime;
		this.commute = commute;
	}
//	@Override
//	public String toString() {
//		return "Commute [cal=" + cal + ", id=" + id + ", name=" + name + ", dept=" + dept + ", level=" + level
//				+ ", currentTime=" + currentTime + "]";
//	}

	
	
}
