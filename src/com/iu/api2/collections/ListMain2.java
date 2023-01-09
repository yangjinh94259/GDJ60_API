package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr = new int [3];
		ArrayList ar = new ArrayList();
		//다형성(상속 관계에서만 가능
//		Integer num1 = new Integer(1);
		Integer num1 = 1;
		int num2 = 3;
		ar.add(num2);		//Auto-Boxing
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
//		int n1 = (Integer)ar.get(0);		
//		double n2 = (Double)ar.get(1);		
		
		Object n1 = ar.get(0);
		Object n2 = ar.get(1);
		
		for(int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
	}

}
