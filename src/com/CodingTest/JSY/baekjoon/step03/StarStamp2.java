package com.CodingTest.JSY.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StarStamp2 {

	public static void main(String[] args) throws IOException {
		// 20210617
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			for (int k = num; k > i; k--) {
				bw.write(" ");
			}
			for (int j = 0; j < i; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
