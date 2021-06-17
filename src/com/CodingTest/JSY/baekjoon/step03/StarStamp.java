package com.CodingTest.JSY.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StarStamp {

	public static void main(String[] args) throws IOException {
		// 20210617
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				bw.write(String.valueOf("*"));
			}
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
