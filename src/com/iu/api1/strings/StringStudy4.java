package com.iu.api1.strings;

public class StringStudy4 {

	public static void main(String[] args) {
		String str = "StarWars";
		
		String result = str.substring(4);
		System.out.println(result);

		result = str.substring(4, 6);
		System.out.println(result);
		
		str = "test@naver.com";
		result = str.substring(5);
		System.out.println(result);
	}

}
