package com.iu.api3.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample2 e2 = new ExceptionSample2();
		
			try {
				e1.ex2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
		
//		try {
//			e1.ex1(); //원래는 빨간줄이 있어야함
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("종료합니다");
	}

}
