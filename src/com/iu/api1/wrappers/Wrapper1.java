package com.iu.api1.wrappers;

public class Wrapper1 {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);	//4
		System.out.println(Long.BYTES);		//8
		System.out.println(Integer.MIN_VALUE);	
		System.out.println(Integer.MAX_VALUE);	
		System.out.println(Integer.SIZE);	
		
//		String n1 = "one";
//		Integer int1 = new Integer(n1);
		
		//parseInt
		String n1 = "12";
		int num1 = Integer.parseInt(n1);
		System.out.println(num1 * 2);
		
		n1 = "15.323";
		double d1 = Double.parseDouble(n1);
		System.out.println(d1 * 1.1);

	}

}
