package com.CodingTest.JSY.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CaseAplusBwithFormula {

	public static void main(String[] args) throws IOException {
		// 20210616
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int times = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= times; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;
			
			bw.write("Case #" + i + ": ");
			bw.append(String.valueOf(a) + " + ");
			bw.append(String.valueOf(b) + " = ");
			bw.append(String.valueOf(sum));
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
