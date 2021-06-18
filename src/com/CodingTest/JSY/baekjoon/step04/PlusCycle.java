package com.CodingTest.JSY.baekjoon.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PlusCycle {

	public static void main(String[] args) throws IOException {
		// 20210618
		//===============================================================다시 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int newNum = num;
		int count = 0;
		
		while(true) {
			num = (num % 10) * 10 + ((num / 10) + (num % 10)) % 10;
			count++;
			if (num == newNum) {
				break;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		br.close();
		bw.close();
	}
}
