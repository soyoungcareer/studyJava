package com.CodingTest.JSY.baekjoon.step03;

import java.util.Scanner;

public class multiTable {

	public static void main(String[] args) {
		//20210614
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
