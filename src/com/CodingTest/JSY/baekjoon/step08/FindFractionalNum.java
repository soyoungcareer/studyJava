package com.CodingTest.JSY.baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFractionalNum {

	public static void main(String[] args) throws IOException {
		// 20210722 - 백준 1193번
		//이해 못함 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int line = 0; //대각선 개수
		int count = 0;
		
		while (count < num) {
			line++;
			count = line * (line + 1) / 2;
		}
		
		if (line % 2 != 0) {
			int top = 1 + (count - num);
			int bottom = line - (count - num);
			System.out.println(top + "/" + bottom);
		} else {
			int top = line - (count - num);
			int bottom = 1 + (count - num);
			System.out.println(top + "/" + bottom);
		}

	}

}
