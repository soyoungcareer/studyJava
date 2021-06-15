package com.CodingTest.JSY.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NStamp {

	public static void main(String[] args) throws IOException {
		//20210615
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			bw.write(String.valueOf(i));
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
