package com.CodingTest.JSY.baekjoon.step01;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		//20210610
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
		
	}

}
