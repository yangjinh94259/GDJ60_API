package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다
		//Generic : Type의 안정성
		//E : 변수명
		//E = Integer
		ArrayList<Integer> ar = new ArrayList<>();		//<>에 Reference Type으로 대입 시킴
		ar.add(1);										//<>에 들어간 Type에 따라 Reference Type에 맞게 대입 해야함
		
		int num = ar.get(0);
		
		ArrayList<WetherDTO> ar2 = new ArrayList<>();
		WetherDTO wetherDTO = new WetherDTO();
		wetherDTO.setCity("Seoul");
		ar2.add(wetherDTO);
		wetherDTO = new WetherDTO();
		wetherDTO.setCity("Jeju");
		ar2.add(wetherDTO);
		
//		wetherDTO = new WetherDTO();
//		wetherDTO.setCity("Jeju");
		
		ar2.remove(wetherDTO);
		
		for(int i=0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i).getCity());
		}
			
	}

}
