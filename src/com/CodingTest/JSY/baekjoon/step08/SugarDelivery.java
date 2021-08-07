package com.CodingTest.JSY.baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {

	public static void main(String[] args) throws IOException {
		// 20210806 - 백준 2839번
		//3kg, 5kg 봉지가 있음
		//최대한 적은 수의 봉지 들고가려고 함.
		//Nkg 배달해야할 때 봉지 몇 개 가져가야하는지
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //배달할 설탕 Nkg
		
		int minPack = 0;
		
//		오답
//		if (n % 5 == 0) {
//			minPack = n / 5;
//		} else { //n % 5 != 0
//			if ((n % 5) % 3 == 0) {
//				minPack = (n / 5) + (n % 5) / 3;
//			} else if (n % 3 == 0) {
//				minPack = n / 3;
//			} else {
//				minPack = -1;
//			}
//		}
		
		while (true) {
			if (n % 5 == 0) {
				//5의 배수이면 바로 출력
				minPack += n / 5;
				System.out.println(minPack);
				break;
			} else {
				//5의 배수 아닌 경우 3씩 빼서 나머지가 0이 될 때까지 반복
				n -= 3;
				minPack++;
			}
			
			if (n < 0) {
				System.out.println("-1");
				break;
			}
		}
	}
}
