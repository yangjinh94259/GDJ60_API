package com.iu.api2.util;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		int [] nums = new int [6];
		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size() < 6) {
			
			ar.add(random.nextInt(45)+1);
			
			
		}
		
//		for(int i=0; i < nums.length; i++) {
//			
//			nums[i] = random.nextInt(45)+1;
//			for(int j=0; j < i; j++) {
//				if(nums[i] == nums[j]) {
//					
//				}
//			}
//		}

	}

}
