package com.CodingTest.JSY.baekjoon.step02;

import java.util.Scanner;

public class TwoNumsCompare {

	public static void main(String[] args) {
		// 20210610
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}
