package com.CodingTest.JSY.baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClimbSnail {

	public static void main(String[] args) throws IOException {
		// 20210726 - 백준 2869번
		//낮에 A미터 올라가고, 밤에 B미터 내려감.
		//높이 V미터인 나무막대
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		//---시간초과---
		/*
		int day = 1; //소요일수
		int climbHeight = 0; //달팽이가 올라간 높이
		
		while (climbHeight < v) {
			climbHeight += a;
			
			if (climbHeight >= v) {
				break;
			} else {
				climbHeight -= b;
			}
			
			day++;
		}
		*/
		
		int day = (v - b) / (a - b);
		
		if ((v - b) % (a - b) != 0) { //잔여 블럭이 있을 경우
			day++;
		}
		
		System.out.println(day);
	}

}
