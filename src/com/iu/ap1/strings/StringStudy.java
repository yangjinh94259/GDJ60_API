package com.iu.ap1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {

		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "abcfbnfgsgbcvd";
		
		System.out.println(str == str2);
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		//문자열 : 문자배열	
		//char [] ar = {a, b, c,};
		//String str = "abc";
		char ch= str2.charAt(0);	
		System.out.println("char type : " + ch);
		
//		Scanner sc = new Scanner(System.in);
//		ch = sc.next().charAt(0);		//scanner 한 글자 받기
		
		int num = str2.indexOf('c', 3);
		System.out.println("num : " + num);
		
	}

}
