package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StudyWord {

	public static void main(String[] args) throws IOException {
		// 20210625 - 1157번
		///////////////////////////////////////////////////////////////////////이해 못함 다시 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toUpperCase();
		/*
		char arr[] = new char[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		*/
		int arr[] = new int[26];
		
		int max = -1;
		char result = '?';
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 65]++;
			if (max < arr[str.charAt(i) - 65]) {
				max = arr[str.charAt(i) - 65];
				result = str.charAt(i);
			} else if (max == arr[str.charAt(i) - 65]) {
				result = '?';
			}
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}

}
