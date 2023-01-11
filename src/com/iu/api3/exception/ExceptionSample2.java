package com.iu.api3.exception;

public class ExceptionSample2 {

	public void ex2() throws Exception{
		ExceptionSample1 e1 = new ExceptionSample1();
		try {
			e1.ex1();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
