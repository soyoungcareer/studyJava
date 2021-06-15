package com.CodingTest.JSY.baekjoon.step03;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 20210615
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
