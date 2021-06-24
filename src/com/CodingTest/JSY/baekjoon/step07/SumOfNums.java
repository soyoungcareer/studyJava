package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfNums {

	public static void main(String[] args) throws IOException {
		// 20210624 - 11720번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
