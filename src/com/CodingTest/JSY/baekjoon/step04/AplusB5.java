package com.CodingTest.JSY.baekjoon.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB5 {

	public static void main(String[] args) throws IOException {
		// 20210618
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 1;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			count++;
			
			if (num1 == 0 && num2 == 0) {
				break;
			}
			
			bw.write(String.valueOf(num1 + num2));
			bw.newLine();
		}	
		bw.flush();
		br.close();
		bw.close();
	}
}
