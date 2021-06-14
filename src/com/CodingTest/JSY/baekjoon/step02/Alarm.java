package com.CodingTest.JSY.baekjoon.step02;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		//20210614
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		while (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
			if (minute < 45) {
				minute = 60 - (45 - minute);
				
				if (hour <= 0) {
					hour = 23;
				} else {
					hour -= 1;
				}
				
				break;
			} else {
				minute = (minute - 45);
				break;
			}
		}
		System.out.println(hour + " " + minute);
	}

}
