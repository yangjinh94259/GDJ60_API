package com.iu.api2.collections.sample;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		ArrayList<Parent> ar = new ArrayList<>();
		ar.add(child1);
		ar.add(child2);
		
		System.out.println(ar.get(0) instanceof Child1);
		System.out.println(ar.get(0) instanceof Child2);
		
		ArrayList<? extends Parent> ar2 = new ArrayList<>();	//Parent의 extends를 모으는것
		ArrayList<? super Parent> ar3 = new ArrayList<>();		//Parent의 부모 타입
		
	}

}
