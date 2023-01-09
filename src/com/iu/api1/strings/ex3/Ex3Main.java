package com.iu.api1.strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");
		
		WetherController wetherController = new WetherController();
		wetherController.start();
		
//		new WetherController().start();
		
		System.out.println("Finish");

	}

}
