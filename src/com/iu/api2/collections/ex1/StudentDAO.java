package com.iu.api2.collections.ex1;

import java.util.Scanner;

public class StudentDAO {
	Scanner sc = new Scanner(System.in);
	private StringBuffer sb;
	boolean check = true;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
		System.out.println(sb);
		
	}

	public void start() {
		while(check) {
		 System.out.println("1. 학생 정보 초기화	");
		 System.out.println("2. 학생 정보 전체 조회");
		 System.out.println("3. 학생 정보 검색 조회(이름)");
		 System.out.println("4. 학생 정보 추가");
		 System.out.println("5. 학생 정보 삭제(이름)");
		 System.out.println("6. 프로그램 종료");
		 int select = sc.nextInt();
		 
		 switch(select) {
		 case 1:
			 System.out.println("학생 정보 초기화");
			 break;
		 case 2:
			 System.out.println("학생 정보 전체 조회");
			 break;
		 case 3:
			 System.out.println("학생 정보 검색 조회(이름)");
			 break;
		 case 4:
			 System.out.println("학생 정보 추가");
			 break;
		 case 5:
			 System.out.println("학생 정보 삭제(이름)");
			 break;
		 default:
			 System.out.println("프로그램 종료");
			 check =! check;
		 }
		}
	}
	
	public StringBuffer getSb() {
		return sb;
	}

	public void setSb(StringBuffer sb) {
		this.sb = sb;
	}
	
}
