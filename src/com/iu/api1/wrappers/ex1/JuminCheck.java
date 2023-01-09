package com.iu.api1.wrappers.ex1;

public class JuminCheck {
	//check1
	//주민등록번호를 받아서
	//남성인지 여성인지 출력
	public void check1(String jumin) {
//		jumin.charAt(7);
//		int c = Integer.parseInt(check);
		String check = jumin.substring(7,8);
		
//		if(c % 2 == 1) {
//			
//		}
//		else {
//			
//		}
		
//		if(c == 1 || c == 3) {
//			
//		}
//		else {
//			
//		}
		
		if(check.equals("1") || check.equals("3")) {
			System.out.println("남성");
		}
		else {
			System.out.println("여성");
		}
	}
	
	
	
	//check2
	//주민등록번호 받아서
	//나이 계산해서 출력
	//2-5 : 봄	6-8 : 여름	9-11 : 가을	12-2 : 겨울
	public void check2(String jumin) {
		//1.나이계산
		String y = jumin.substring(0, 2);		//99
		String check = jumin.substring(7, 8);	
		int year = 1900;
		//String = 19;
		if(check.equals("3") || check.equals("5")) {
			year = 2000;
			//year = "20
		}
			
		year = year + Integer.parseInt(y);		//99
		int age = 2023 - year;
		System.out.println("나이 : " + age);
		
		//계절 출력
		String m = jumin.substring(2, 4);
		int month = Integer.parseInt(m);
		if(month >= 3 && month <= 5) {
			System.out.println("계절 : 봄");
		}
		else if(month >= 6 && month <= 8) {
			System.out.println("계절 : 여름");
		}
		else if(month >= 9 && month <= 11) {
			System.out.println("계절 : 가을");
		}
		else {
			System.out.println("계절 : 겨울");
		}
		
	}
	
}
