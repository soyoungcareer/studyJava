package com.CodingTest.JSY.baekjoon.step02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 20210611
		//윤년이면 1, 아니면 0 출력
		//윤년 : 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400배수일 때
		//입력값 : 1보다 크거나 같고, 4000보다 작거나 같은 자연수
	
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		int leapYear = 0;
		
		while (year >= 1 && year <= 4000) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				leapYear = 1; break;
			} else {
				leapYear = 0; break;
			}
		}
		System.out.println(leapYear);
	}
}
