package com.CodingTest.JSY.baekjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Remainder {

	public static void main(String[] args) throws IOException {
		// 20210622 - 3052번 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num % 42;
		}

		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				result++;
			}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
		
		
		/*
		 * HashSet 은 중복된 값을 허용하지 않음.
		 * 훨씬 간단하게 풀 수 있음.
		 * 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(hs.size());
		*/
	}
}
