package com.CodingTest.JSY.baekjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Average {

	public static void main(String[] args) throws IOException {
		// 20210622 - 1546번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nums = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[nums];
		
		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
		}
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		
		double newArr[] = new double[arr.length];
		double sum = 0;
		
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = (double)arr[i] / max * 100;
			sum += newArr[i];
		}
		
		double avg = sum / arr.length;
		
		bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
		br.close();
	}
}
