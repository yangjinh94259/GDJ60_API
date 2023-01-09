package com.iu.api1.strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		//StringBuffer String이 아님
		
		StringBuffer sb = new StringBuffer("Hello");	//hello
		
		//hello + world
		sb.append(" world");
		
		System.out.println(sb);
		
		//참조변수를 출력하면 toString() : 클래스명@객체주소
		//toString를 오버라이딩 함
		//변수에는 같은 데이터타입만 대입 가능
		String str = sb.substring(0);
		
		str = sb.toString();
		System.out.println(str);
		
		sb.reverse();
		System.out.println(sb);
		
		str = String.valueOf(123);		//static 붙으면 클래스명.변수명
		System.out.println(str);
		
		str = 123 + "";

	}

}
