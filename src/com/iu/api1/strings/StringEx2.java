package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		System.out.println("파일명 입력");
		String fileName = sc.next();
		boolean flag = true;
		
		//확장자 분리 작업
		int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx + 1);
		System.out.println(result);
		
		//확장자가 이미지인지 검증
		for(int i=0; i < names.length; i++) {
			if(result.equals(names[i])) {		//문자끼리 비교할땐 .equals
				System.out.println("정상 파일");
				i = names.length;
				//flag = false;
				flag =! flag;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("비정상 파일");
		}
		
		System.out.println("Finish");
	}

}
