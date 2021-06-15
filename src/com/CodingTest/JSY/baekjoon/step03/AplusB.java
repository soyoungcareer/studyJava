package com.CodingTest.JSY.baekjoon.step03;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		//20210614
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for (int i = 0; i < times; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
	}
}
