package com.CodingTest.JSY.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAplusB {

	public static void main(String[] args) throws IOException {
		//20210615
		//////////////////////////////다시 풀기////////////////////////////////////
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int times = Integer.parseInt(br.readLine()); //반복횟수 입력받기

		for (int i = 0; i < times; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int sum = num1 + num2;

			bw.write(String.valueOf(sum));
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
