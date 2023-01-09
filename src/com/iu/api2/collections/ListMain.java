package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//순서유지, 값의 중복 허용, 배열기반
		int [] arr = new int [3];
		ArrayList ar = new ArrayList<>();
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		//add는 새로운 데이터 추가
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=========");
		
		ar.add(1, 8);	//1번 index 번호에 8을 추가(2, 3, 4가 밀림)
		ar.remove(0);
		//ar.clear();
		ar.set(2, 9);	//해당 index 번호를 수정
		
		for(int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
	}

}
