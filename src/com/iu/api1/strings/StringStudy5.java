package com.iu.api1.strings;

public class StringStudy5 {

	public static void main(String[] args) {
		String str = "apple# Apple, aPPle# appLe";		//전처리
		str = str.replace(",", "#");
//		str = str.replace(" ", "");
//		str = str.trim();
		String [] result = str.split("#");	//파싱(parsing)
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i].trim().toUpperCase());		//toUpperCase() -> 대문자로 바꿈
		}															//toLowerCase() -> 소문자로 바꿈
	}

}
