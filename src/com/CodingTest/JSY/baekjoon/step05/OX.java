package com.CodingTest.JSY.baekjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class OX {

	public static void main(String[] args) throws IOException {
		// 20210622 - 8958번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		String arr[] = new String[num];
		
		
		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			for (int j = 0; j < arr[i].length(); j++) { //각 배열마다 길이가 다름.
				if (arr[i].charAt(j) == 'O') {
					count++;
				} else { //X가 나오면 0으로 초기화
					count = 0;
				}
				sum += count;
			}
			sb.append(sum + "\n");
		}
		
		System.out.println(sb);
	}

}
