package com.CodingTest.JSY.baekjoon.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hansu {

	public static void main(String[] args) throws IOException {
		// 20210624 - 1065번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		if (N < 100) {
			count = N;
		} else if (N < 1000) {
			count = 99;
			for (int i = 100; i <= N; i++) {
				if (((i / 100) - (i % 100) / 10) == ((i % 100) / 10 - (i % 100) % 10)) {
					count++;
				}
			}
		} else {
			count = 144;
		}
		
		bw.write(String.valueOf(count));
		bw.close();
		br.close();
	}
}
