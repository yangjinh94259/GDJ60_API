package com.iu.ap1.strings;

public class StringEx1 {

	public static void main(String[] args) {
		//
		String phone = "010-1234-5678";
		int idx = 0;
		boolean check = true;
		
		while(check) {
			idx = phone.indexOf('-', idx);
			if(-1 != idx) {
				System.out.println("IDX 번호 : " + idx);
				idx++;
			}
			else {
				break;
			}
			
		}
		
	}

}
