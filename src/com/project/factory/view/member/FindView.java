package com.project.factory.view.member;

import com.project.factory.member.Identify;

public class FindView {
	
	//TODO findMenu 메서드 추가
	//아이디(사원번호)/비밀번호 찾는 화면 
	public static void findMenu() {
		
		//로그인이 된 상태이면
		if(Identify.auth == null) {
			System.out.println("=============================");
			System.out.println();
			System.out.println("1. 아이디(사원번호) 찾기");
			System.out.println("2. 비밀번호 찾기");
			System.out.println();
			System.out.println("=============================");
			System.out.print("번호 입력: ");

			
			
			
		}
		
	}

}
