package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		//1000원 로또 구매 1-45 번호6개를 랜덤하게 추출
		
		
		//2. Set
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()<6) {
			hs.add(random.nextInt(45)+1);
		}
		
		System.out.println(hs);
		
		
		
		//1. 배열
		int [] nums = new int [6];
		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size()<6) {
			
			int n = random.nextInt(45)+1;
			boolean check=true;
			
			for(int i=0;i<ar.size();i++) {
				if(n == ar.get(i)) {
					check=false;
					break;
				}
			}
			
			if(check) {
				ar.add(n);
			}
			
			
			
		}
		
		
//		for(int i=0;i<nums.length;i++) {
//		
//			nums[i]=random.nextInt(45)+1;
//			for(int j=0;j<i;j++) {
//				if(nums[i]==nums[j]) {
//					i--;
//					break;
//				}
//			}
//			
//		}
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));

			
		}

	}

}
