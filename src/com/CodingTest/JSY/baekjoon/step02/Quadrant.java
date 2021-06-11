package com.CodingTest.JSY.baekjoon.step02;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// 20210611
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int quadrantNum = 0;
		
		while ((x >= -1000 && x <= 1000 && x != 0) && (y >= -1000 && y <= 1000 && y != 0)) {
			/*
			 * 방법1
			if (x > 0 && y > 0) {
				quadrantNum = 1; break;
			} else if (x < 0 && y > 0) {
				quadrantNum = 2; break;
			} else if (x < 0 && y < 0) {
				quadrantNum = 3; break;
			} else {
				quadrantNum = 4; break;
			}
			*/
			
			//방법2
			if (x > 0) {
				if (y > 0) {
					quadrantNum = 1; break;
				} else {
					quadrantNum = 4; break;
				}
			} else {
				if (y > 0) {
					quadrantNum = 2; break;
				} else {
					quadrantNum = 3; break;
				}
			}
			
		}
		System.out.println(quadrantNum);
	}
}
