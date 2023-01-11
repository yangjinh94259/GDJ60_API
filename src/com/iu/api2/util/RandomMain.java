package com.iu.api2.util;

import java.util.Random;
import java.util.Scanner;

public class RandomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//1000원 로또 구매 1-45 번호6개를 랜덤하게 추출
		System.out.println("자동 로또 구매 : 1000원");
		int num1 = sc.nextInt();
		
		int Lotto [] = new int[6];
		
		System.out.println("구매 완료");
		System.out.println("Lotto 랜덤 숫자 ");
		
		for(int i=0; i < Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j < i; j++) {
				if(Lotto[i] == Lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i < Lotto.length; i++) {
			System.out.print(Lotto[i] + "번" + "\t");
		}
	
	}
}
