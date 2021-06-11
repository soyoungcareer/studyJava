package com.CodingTest.JSY.baekjoon.step02;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// 20210611
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		//while문으로 입력값 유효성 검사
		while (score >= 0 && score <= 100) { 
			if (score >= 90) {
				System.out.println("A");
				break;
			} else if (score >= 80) {
				System.out.println("B");
				break;
			} else if (score >= 70) {
				System.out.println("C");
				break;
			} else if (score >= 60) {
				System.out.println("D");
				break;
			} else {
				System.out.println("F");
				break;
			}
		}
	}

}
