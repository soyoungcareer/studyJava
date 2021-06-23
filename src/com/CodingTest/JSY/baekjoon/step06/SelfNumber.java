package com.CodingTest.JSY.baekjoon.step06;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SelfNumber {

	public static void main(String[] args) {
		// 20210623 - 4673번
		//10000보다 같거나 작은 셀프 넘버 한 줄에 하나씩 출력
		//////////////////////////////////////////////////////////////////////////이해 못함
		
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if (n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				sb.append(i + "\n");
			}
		}
		System.out.println(sb);
	}
	
	
	public static int d(int number) {
		int sum = number;
		
		while (number != 0) {
			sum += (number % 10);
			number /= 10;
		}
		
		return sum;
	}
}
