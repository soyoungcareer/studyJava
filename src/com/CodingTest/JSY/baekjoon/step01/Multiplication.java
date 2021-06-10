package com.CodingTest.JSY.baekjoon.step01;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// 20210610
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //세 자리 자연수 1
		int b = sc.nextInt(); //세 자리 자연수 2
		
		int[] arr = new int[3];
		
		arr[0] = b % 10; //b의 1의 자리
		arr[1] = (b % 100) / 10; //b의 10의 자리
		arr[2] = b / 100; //b의 100의 자리
		
		System.out.println(a * arr[0]); //a * b의 1의 자리
		System.out.println(a * arr[1]); //a * b의 10의 자리
		System.out.println(a * arr[2]); //a * b의 100의 자리
		System.out.println(a * b); //a * b
		
	}

}
