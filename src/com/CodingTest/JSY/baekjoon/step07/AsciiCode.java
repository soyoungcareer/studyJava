package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AsciiCode {

	public static void main(String[] args) throws IOException {
		// 20210624 - 11654번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char input = br.readLine().charAt(0);
		
		int output = (int)input;
		
		bw.write(String.valueOf(output));
		bw.flush();
		bw.close();
		br.close();
		
		/*
		 * 한줄짜리 정답
		System.out.println(System.in.read());
		*/
	}
}
